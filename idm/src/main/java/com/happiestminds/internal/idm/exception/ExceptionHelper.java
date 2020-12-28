package com.happiestminds.internal.idm.exception;

import com.happiestminds.internal.idm.web.response.ErrorMessage;
import com.happiestminds.internal.idm.web.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHelper {

  @ExceptionHandler(value = ResourceNotFoundException.class)
  public static ResponseEntity<Object> handleException(ResourceNotFoundException exception) {
    return new ResponseEntity<>(
            new ErrorResponse(exception.getErrorMessage()), HttpStatus.NOT_FOUND);
  }
}
