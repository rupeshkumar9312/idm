package com.happiestminds.internal.idm.web.controller;

import com.happiestminds.internal.idm.business.RoleService;
import com.happiestminds.internal.idm.dataaccess.dto.RoleCreateRequest;
import com.happiestminds.internal.idm.dataaccess.dto.RoleUpdateRequest;
import com.happiestminds.internal.idm.web.response.RoleResponse;
import com.happiestminds.internal.idm.web.response.Response;
import com.happiestminds.internal.idm.web.transformer.RoleTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roles")
public class RoleController {

  @Autowired
  private RoleService roleService;

  @PostMapping
  public ResponseEntity<?> createRole(@RequestBody RoleCreateRequest roleCreateRequest) {
    var role = RoleTransformer.INSTANCE.toEntity(roleCreateRequest);
    roleService.createRole(role);
    return new ResponseEntity<>(
            new Response(HttpStatus.CREATED.value(), "success", "0"), HttpStatus.CREATED);
  }

  @GetMapping("/{id}")
  public ResponseEntity<?> getRole(@PathVariable Long id) {
    var roleDto = RoleTransformer.INSTANCE.toDto(roleService.getRole(id));
    return new ResponseEntity<>(roleDto, HttpStatus.OK);
  }

  @GetMapping
  public ResponseEntity<?> getRoles() {
    var roleDtos = RoleTransformer.INSTANCE.toDto(roleService.getRoles());
    return new ResponseEntity<>(new RoleResponse(roleDtos), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<?> updateRole(@RequestBody RoleUpdateRequest roleUpdateRequest) {
    // TODO: implement update role endpoint
    return new ResponseEntity<>("To be implemented", HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Response> deleteRole(@PathVariable Long id) {
    roleService.deleteRole(id);
    return new ResponseEntity<>(
            new Response(HttpStatus.OK.value(), "Role deleted successfully", "0"), HttpStatus.OK);
  }
}
