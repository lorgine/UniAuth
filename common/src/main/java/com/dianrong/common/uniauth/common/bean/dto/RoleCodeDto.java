package com.dianrong.common.uniauth.common.bean.dto;

/**
 * Created by Arc on 15/1/16.
 */
public class RoleCodeDto {

    private Integer id;
    private String code;
    private String description;

    public String getDescription() {
        return description;
    }

    public RoleCodeDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public RoleCodeDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getCode() {
        return code;
    }

    public RoleCodeDto setCode(String code) {
        this.code = code;
        return this;
    }
}
