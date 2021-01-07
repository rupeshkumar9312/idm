package com.happiestminds.internal.idm.web.response;

import org.springframework.http.HttpStatus;

public enum SuccessMessage {
  ROLE_UPDATED("Role updated successfully", HttpStatus.OK, 0),
  ROLE_CREATED("Role created successfully", HttpStatus.CREATED, 0),
  ROLE_DELETED("Role deleted successfully", HttpStatus.OK, 0),
  USER_CREATED("User created successfully", HttpStatus.CREATED, 0),
  USER_DELETED("User deleted successfully", HttpStatus.OK, 0);
  private String message;

  private HttpStatus status;

  private int applicationErrorCode;

  SuccessMessage(String message, HttpStatus status, int applicationErrorCode) {
    this.message = message;
    this.status = status;
    this.applicationErrorCode = applicationErrorCode;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public HttpStatus getStatus() {
    return status;
  }

  public void setStatus(HttpStatus status) {
    this.status = status;
  }

  public int getApplicationErrorCode() {
    return applicationErrorCode;
  }

  public void setApplicationErrorCode(int applicationErrorCode) {
    this.applicationErrorCode = applicationErrorCode;
  }
}
