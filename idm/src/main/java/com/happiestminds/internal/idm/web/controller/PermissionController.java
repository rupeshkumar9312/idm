package com.happiestminds.internal.idm.web.controller;

import com.happiestminds.internal.idm.business.PermissionService;
import com.happiestminds.internal.idm.dataaccess.entities.Permission;
import com.happiestminds.internal.idm.exception.ResourceNotFoundException;
import com.happiestminds.internal.idm.web.model.PermissionDto;
import com.happiestminds.internal.idm.web.response.ErrorMessage;
import com.happiestminds.internal.idm.web.transformer.PermissionTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/permissions")
public class PermissionController {

  private PermissionService permissionService;

  @Autowired
  public PermissionController(PermissionService aPermissionService) {
    this.permissionService = aPermissionService;
  }

  @GetMapping("/search")
  public Map<String, List<PermissionDto>> getPermission(@RequestParam String feature) {
    var features = Arrays.asList(feature.split(","));
    var permissionList = permissionService.getAllPermissionByFeature(features);
    if (permissionList.isEmpty()) {
      throw new ResourceNotFoundException(ErrorMessage.PERMISSION_NOT_FOUND);
    }
    return getFeatureAndPermissions(permissionList);
  }

  @GetMapping
  public Map<String, List<PermissionDto>> getPermissions() {
    var permissions = permissionService.getAllPermissions();
    Map<String, List<PermissionDto>> featurePermissions = getFeatureAndPermissions(permissions);
    return featurePermissions;
  }

  private Map<String, List<PermissionDto>> getFeatureAndPermissions(List<Permission> permissions) {
    Map<String, List<PermissionDto>> featurePermissions = new HashMap<>();
    var features = permissions.stream().map(Permission::getFeature).collect(Collectors.toSet());
    features.forEach(
            feature -> {
              var permissionList =
                      permissions.stream()
                              .filter(permission -> permission.getFeature().equalsIgnoreCase(feature))
                              .collect(Collectors.toList());
              featurePermissions.put(feature, PermissionTransformer.INSTANCE.toDto(permissionList));
            });
    return featurePermissions;
  }
}
