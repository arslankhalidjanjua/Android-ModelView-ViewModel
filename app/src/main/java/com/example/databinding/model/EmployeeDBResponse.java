package com.example.databinding.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class EmployeeDBResponse {

  @SerializedName("status")
  @Expose
  private String status;
  @SerializedName("data")
  @Expose
  private List<Employee> data = null;
  @SerializedName("message")
  @Expose
  private String message;

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public List<Employee> getData() {
    return data;
  }

  public void setData(List<Employee> data) {
    this.data = data;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /*
  @SerializedName("data")
  @Expose
  private List<Employee> employee = null;

  public List<Employee> getEmployee() {
    return employee;
  }
  public void setEmployee(List<Employee> employee) {
    this.employee = employee;
  }*/
}
