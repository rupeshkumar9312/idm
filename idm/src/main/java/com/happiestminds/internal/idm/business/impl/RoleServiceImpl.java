package com.happiestminds.internal.idm.business.impl;

import com.happiestminds.internal.idm.business.RoleService;
import com.happiestminds.internal.idm.dataaccess.entities.Role;
import com.happiestminds.internal.idm.dataaccess.entities.RolePermission;
import com.happiestminds.internal.idm.dataaccess.repository.PermissionRepository;
import com.happiestminds.internal.idm.dataaccess.repository.RolePermissionRepository;
import com.happiestminds.internal.idm.dataaccess.repository.RoleRepository;
import com.happiestminds.internal.idm.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static com.happiestminds.internal.idm.web.response.ErrorMessage.ROLE_NOT_FOUND;

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
    return roleRepository
            .findById(id)
            .orElseThrow(() -> new ResourceNotFoundException(ROLE_NOT_FOUND));
  }

  @Override
  public Role updateRole(Long id, Role role) {
    var dbRole = getRole(id);
    dbRole.setDescription(role.getDescription());
    dbRole.setPermissions(role.getPermissions());
    dbRole.setEnterpriseCode(role.getEnterpriseCode());
    dbRole.setStatus(role.getStatus());
    dbRole.setUserRoles(role.getUserRoles());
    dbRole.setName(role.getName());
    return roleRepository.save(dbRole);
  }

  @Override
  public void deleteRole(Long id) {
    try {
      roleRepository.deleteById(id);
    } catch (EmptyResultDataAccessException ex) {
      throw new ResourceNotFoundException(ROLE_NOT_FOUND);
    }
  }

  @Override
  public List<Role> getRoles() {
    return StreamSupport.stream(roleRepository.findAll().spliterator(), false)
            .collect(Collectors.toList());
  }
}
