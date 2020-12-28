package com.happiestminds.internal.idm.web.response;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Response {

  private int code;

  private String message;

  private int applicationErrorCode;

  @JsonIgnore
  private SuccessMessage successMessage;

  public Response(SuccessMessage successMessage) {
    code = successMessage.getStatus().value();
    message = successMessage.getMessage();
    applicationErrorCode = successMessage.getApplicationErrorCode();
  }

  public Response(int code, String message, int applicationErrorCode) {
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
