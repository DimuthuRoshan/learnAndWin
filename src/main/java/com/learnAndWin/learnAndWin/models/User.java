package com.learnAndWin.learnAndWin.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name="master_user")
public class User {

    @Id
    private int user_code;
    private String user_id;

    public int getUser_code() {
        return user_code;
    }

    public void setUser_code(int user_code) {
        this.user_code = user_code;
    }

    private String user_full_name;
    private String password;
    private String user_email;
    private Boolean user_status;
    private Date created_date;
    private Date modified_date;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_full_name() {
        return user_full_name;
    }

    public void setUser_full_name(String user_full_name) {
        this.user_full_name = user_full_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public Boolean getUser_status() {
        return user_status;
    }

    public void setUser_status(Boolean user_status) {
        this.user_status = user_status;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Date getModified_date() {
        return modified_date;
    }

    public void setModified_date(Date modified_date) {
        this.modified_date = modified_date;
    }
}
