package com.happiestminds.internal.idm.web.response;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ErrorResponse {

  private int code;

  private String message;

  private int applicationErrorCode;

  @JsonIgnore
  private ErrorMessage errorMessage;

  public ErrorResponse(ErrorMessage errorMessage) {
    code = errorMessage.getCode();
    message = errorMessage.getMessage();
    applicationErrorCode = errorMessage.getApplicationErrorCode();
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

  public ErrorMessage getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(ErrorMessage errorMessage) {
    this.errorMessage = errorMessage;
  }
}
