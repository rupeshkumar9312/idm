package com.happiestminds.internal.idm.web.transformer;

import com.happiestminds.internal.idm.dataaccess.dto.RoleCreateRequest;
import com.happiestminds.internal.idm.dataaccess.dto.RoleUpdateRequest;
import com.happiestminds.internal.idm.dataaccess.entities.Role;
import com.happiestminds.internal.idm.web.model.RoleDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RoleTransformer {

  RoleTransformer INSTANCE = Mappers.getMapper(RoleTransformer.class);

  RoleDto toDto(Role role);

  List<RoleDto> toDto(List<Role> roles);

  //  @Mapping(source = "permissions",target = "rolePermissions")
  Role toEntity(RoleCreateRequest roleCreateRequest);

  Role toEntity(RoleUpdateRequest roleUpdateRequest);
}
