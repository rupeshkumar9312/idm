package com.happiestminds.internal.idm.dataaccess.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RoleMapping {

    @JsonProperty("name")
    private String name;

    public RoleMapping() {
    }

    public RoleMapping(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
