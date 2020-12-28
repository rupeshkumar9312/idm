package com.happiestminds.internal.idm.exception;

import com.happiestminds.internal.idm.web.response.ErrorMessage;

public class RecordAlreadyExistsException extends RuntimeException {
    private ErrorMessage errorMessage;

    public RecordAlreadyExistsException(ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ErrorMessage getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }
}
