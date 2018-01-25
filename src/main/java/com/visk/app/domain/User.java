package com.visk.app.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import javax.annotation.Generated;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class User {

    @Id
    private String id;

    @Field("uid")
    private Long uid;

    @NotNull(message = "用户名称不能为空")
    @Field("username")
    private Long username;

    @Field("delete")
    private String delete;

    @Field("ctime")
    private Long ctime;

    @Field("mtime")
    private Long mtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getUsername() {
        return username;
    }

    public void setUsername(Long username) {
        this.username = username;
    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }

    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    public Long getMtime() {
        return mtime;
    }

    public void setMtime(Long mtime) {
        this.mtime = mtime;
    }
}
