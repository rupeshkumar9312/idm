package com.happiestminds.internal.idm.dataaccess.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class IdMapping implements Serializable {

    @JsonProperty("id")
    private Long id;

    public IdMapping() {
    }

    public IdMapping(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
