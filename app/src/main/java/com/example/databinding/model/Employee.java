package com.example.databinding.model;

import com.google.gson.annotations.SerializedName;

public class Employee {

    @SerializedName("employee_name")
    private String employee_name;

    @SerializedName("employee_salary")
    private String employee_salary;

    @SerializedName("employee_age")
    private String employee_age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @SerializedName("id")
    private String id;

    @SerializedName("profile_image")
    private String profile_image;

    public String getEmployee_name() {
        return employee_name;
    }
    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_salary() {
        return employee_salary;
    }
    public void setEmployee_salary(String employee_salary) {
        this.employee_salary = employee_salary;
    }

    public String getEmployee_age() {
        return employee_age;
    }
    public void setEmployee_age(String employee_age) {
        this.employee_age = employee_age;
    }



    public String getProfile_image() {
        return profile_image;
    }
    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }
}
