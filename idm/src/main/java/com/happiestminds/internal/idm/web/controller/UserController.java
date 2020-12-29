package com.happiestminds.internal.idm.web.controller;

import com.happiestminds.internal.idm.business.UserService;
import com.happiestminds.internal.idm.dataaccess.dto.UserCreateRequest;
import com.happiestminds.internal.idm.dataaccess.entities.User;
import com.happiestminds.internal.idm.exception.RecordAlreadyExistsException;
import com.happiestminds.internal.idm.web.response.ErrorMessage;
import com.happiestminds.internal.idm.web.response.SuccessMessage;
import com.happiestminds.internal.idm.web.response.SuccessResponse;
import com.happiestminds.internal.idm.web.transformer.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping
  public ResponseEntity<?> getAllUsers() {
    var userDtos = UserTransformer.INSTANCE.toDto(userService.getAllUsers());
    return new ResponseEntity<>(userDtos, HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<SuccessResponse> createUser(
          @RequestBody UserCreateRequest userCreateRequest) {
    try {
      var user = UserTransformer.INSTANCE.toEntity(userCreateRequest);
      var response = userService.saveUser(user);
      return new ResponseEntity<>(new SuccessResponse(SuccessMessage.USER_CREATED), HttpStatus.OK);
    } catch (Exception ex) {
      return null;
    }
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteUser(@PathVariable Long id) {
    userService.deleteUser(id);
    return new ResponseEntity<>(new SuccessResponse(SuccessMessage.USER_DELETED), HttpStatus.OK);
  }
}
