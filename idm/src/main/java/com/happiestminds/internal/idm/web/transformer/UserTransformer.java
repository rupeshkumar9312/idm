package com.happiestminds.internal.idm.web.transformer;

import com.happiestminds.internal.idm.dataaccess.dto.UserCreateRequest;
import com.happiestminds.internal.idm.dataaccess.entities.User;
import com.happiestminds.internal.idm.web.model.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserTransformer {

  UserTransformer INSTANCE = Mappers.getMapper(UserTransformer.class);

  User toEntity(UserCreateRequest userCreateRequest);

  UserDto toDto(User user);

  List<UserDto> toDto(List<User> users);
}
