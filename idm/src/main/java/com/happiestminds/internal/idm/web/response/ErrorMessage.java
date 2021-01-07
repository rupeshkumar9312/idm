package com.happiestminds.internal.idm.web.response;

import org.springframework.http.HttpStatus;

public enum ErrorMessage {
  ROLE_NOT_FOUND(HttpStatus.NOT_FOUND.value(), "Role not found", 1),
  PERMISSION_NOT_FOUND(HttpStatus.NOT_FOUND.value(), "Permission not found", 1),
  ENTERPRISE_NOT_FOUND(HttpStatus.NOT_FOUND.value(), "Enterprise not found", 1),
  USER_NOT_FOUND(HttpStatus.NOT_FOUND.value(), "User not found", 1);
  private int code;

  private String message;

  private int applicationErrorCode;

  ErrorMessage(int code, String message, int applicationErrorCode) {
    this.code = code;
    this.message = message;
    this.applicationErrorCode = applicationErrorCode;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public int getApplicationErrorCode() {
    return applicationErrorCode;
  }

  public void setApplicationErrorCode(int applicationErrorCode) {
    this.applicationErrorCode = applicationErrorCode;
  }
}
