package com.happiestminds.internal.idm.dataaccess.repository;

import com.happiestminds.internal.idm.dataaccess.entities.RolePermission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolePermissionRepository extends CrudRepository<RolePermission, Long> {
}
