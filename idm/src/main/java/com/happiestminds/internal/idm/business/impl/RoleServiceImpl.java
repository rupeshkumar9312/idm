package com.happiestminds.internal.idm.business.impl;

import com.happiestminds.internal.idm.business.RoleService;
import com.happiestminds.internal.idm.dataaccess.entities.Role;
import com.happiestminds.internal.idm.dataaccess.entities.RolePermission;
import com.happiestminds.internal.idm.dataaccess.repository.PermissionRepository;
import com.happiestminds.internal.idm.dataaccess.repository.RolePermissionRepository;
import com.happiestminds.internal.idm.dataaccess.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class RoleServiceImpl implements RoleService {

  @Autowired
  private RoleRepository roleRepository;

  @Autowired
  private RolePermissionRepository rolePermissionRepository;

  @Autowired
  private PermissionRepository permissionRepository;

  @Override
  public Role createRole(Role role) {
    return roleRepository.save(role);
  }

  @Override
  public Role getRole(Long id) {
    return roleRepository.findById(id).orElseThrow();
  }

  @Override
  public Role updateRole(Long id, Role role) {
    return null;
  }

  @Override
  public void deleteRole(Long id) {
    roleRepository.deleteById(id);
  }

  @Override
  public List<Role> getRoles() {
    return StreamSupport.stream(roleRepository.findAll().spliterator(), false)
            .collect(Collectors.toList());
  }
}
