package com.happiestminds.internal.idm.web.controller;

import com.happiestminds.internal.idm.business.RoleService;
import com.happiestminds.internal.idm.dataaccess.dto.RoleCreateRequest;
import com.happiestminds.internal.idm.dataaccess.dto.RoleUpdateRequest;
import com.happiestminds.internal.idm.web.response.RoleResponse;
import com.happiestminds.internal.idm.web.response.Response;
import com.happiestminds.internal.idm.web.response.SuccessMessage;
import com.happiestminds.internal.idm.web.transformer.RoleTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    return new ResponseEntity<Response>(
            new Response(SuccessMessage.ROLE_CREATE), HttpStatus.CREATED);
  }

  @GetMapping("/{id}")
  public ResponseEntity<?> getRole(@PathVariable Long id) throws Exception {
    var roleDto = RoleTransformer.INSTANCE.toDto(roleService.getRole(id));
    return new ResponseEntity<>(roleDto, HttpStatus.OK);
  }

  @GetMapping
  public ResponseEntity<?> getRoles() {
    var roleDtos = RoleTransformer.INSTANCE.toDto(roleService.getRoles());
    return new ResponseEntity<>(new RoleResponse(roleDtos), HttpStatus.OK);
  }

  @PutMapping("/{id}")
  public ResponseEntity<?> updateRole(
          @RequestBody RoleUpdateRequest roleUpdateRequest, @PathVariable Long id) {
    var roleEntity = RoleTransformer.INSTANCE.toEntity(roleUpdateRequest);
    roleService.updateRole(id, roleEntity);
    return new ResponseEntity<>(new Response(SuccessMessage.ROLE_UPDATE), HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteRole(@PathVariable Long id) {
    roleService.deleteRole(id);
    return new ResponseEntity<>(new Response(SuccessMessage.ROLE_DELETE), HttpStatus.OK);
  }
}
