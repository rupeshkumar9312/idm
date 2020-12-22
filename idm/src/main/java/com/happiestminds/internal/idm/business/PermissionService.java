package com.happiestminds.internal.idm.business;

import com.happiestminds.internal.idm.dataaccess.entities.Permission;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PermissionService {

  List<Permission> getAllPermissions();

  List<Permission> getAllPermissionByFeature(List<String> feature);

}
