package com.happiestminds.internal.idm.exception;

import com.happiestminds.internal.idm.web.response.ErrorMessage;

public class ResourceNotFoundException extends RuntimeException {

  private ErrorMessage errorMessage;

  public ResourceNotFoundException(ErrorMessage errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ErrorMessage getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(ErrorMessage errorMessage) {
    this.errorMessage = errorMessage;
  }
}
