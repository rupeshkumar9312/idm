package com.happiestminds.internal.idm.web.response;

import org.springframework.http.HttpStatus;

public enum SuccessMessage {
  ROLE_UPDATE("Role updated successfully", HttpStatus.OK, 0),
  ROLE_CREATE("Role created successfully", HttpStatus.CREATED, 0),
  ROLE_DELETE("Role deleted successfully", HttpStatus.OK, 0);

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
