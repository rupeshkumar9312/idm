package com.happiestminds.internal.idm.business;

import com.happiestminds.internal.idm.dataaccess.entities.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {

  Role createRole(Role role);

  Role getRole(Long id);

  Role updateRole(Long id, Role role);

  void deleteRole(Long id);

  List<Role> getRoles();
}
