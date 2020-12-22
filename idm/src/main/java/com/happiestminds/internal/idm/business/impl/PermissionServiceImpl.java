package com.happiestminds.internal.idm.business.impl;

import com.happiestminds.internal.idm.business.PermissionService;
import com.happiestminds.internal.idm.dataaccess.entities.Permission;
import com.happiestminds.internal.idm.dataaccess.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class PermissionServiceImpl implements PermissionService {

  private final PermissionRepository permissionRepository;

  @Autowired
  public PermissionServiceImpl(PermissionRepository permissionRepository) {
    this.permissionRepository = permissionRepository;
  }

  @Override
  public List<Permission> getAllPermissions() {
    return StreamSupport.stream(permissionRepository.findAll().spliterator(), false)
            .collect(Collectors.toList());
  }

  @Override
  public List<Permission> getAllPermissionByFeature(List<String> feature) {
    return permissionRepository.findAllByFeatureIn(feature);
  }
}
