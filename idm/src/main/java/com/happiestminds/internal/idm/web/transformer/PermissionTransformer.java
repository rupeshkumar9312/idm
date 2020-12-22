package com.happiestminds.internal.idm.web.transformer;

import com.happiestminds.internal.idm.dataaccess.entities.Permission;
import com.happiestminds.internal.idm.web.model.PermissionDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PermissionTransformer {

  PermissionTransformer INSTANCE = Mappers.getMapper(PermissionTransformer.class);

  PermissionDto toDto(Permission permission);

  List<PermissionDto> toDto(List<Permission> permissions);
}
