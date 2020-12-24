package com.happiestminds.internal.idm.dataaccess.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import java.util.ArrayList;
import java.util.List;

public class RoleCreateRequest {

    private Long id;

    private String name;

    private String description;

    private char status;

    private String enterpriseCode;

    @JsonProperty("permissionIds")
    private List<IdMapping> permissions = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public List<IdMapping> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<IdMapping> permissions) {
        this.permissions = permissions;
    }
}
