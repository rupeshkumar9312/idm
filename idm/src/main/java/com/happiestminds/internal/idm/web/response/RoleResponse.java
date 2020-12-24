package com.happiestminds.internal.idm.web.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.happiestminds.internal.idm.web.model.RoleDto;
import lombok.Data;

import java.util.List;

@Data
public class RoleResponse {

  @JsonProperty("roles")
  private List<RoleDto> roleDtos;

  public RoleResponse(List<RoleDto> roleDtos) {
    this.roleDtos = roleDtos;
  }

  public List<RoleDto> getRoleDtos() {
    return roleDtos;
  }

  public void setRoleDtos(List<RoleDto> roleDtos) {
    this.roleDtos = roleDtos;
  }
}
