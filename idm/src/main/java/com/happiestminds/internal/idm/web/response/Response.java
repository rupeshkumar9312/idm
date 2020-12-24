package com.happiestminds.internal.idm.web.response;

import org.springframework.http.HttpStatus;

public class Response {

  private int code;

  private String message;

  private String applicationErrorCode;

  public Response() {
  }

  public Response(int code, String message, String applicationErrorCode) {
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

  public String getApplicationErrorCode() {
    return applicationErrorCode;
  }

  public void setApplicationErrorCode(String applicationErrorCode) {
    this.applicationErrorCode = applicationErrorCode;
  }
}
