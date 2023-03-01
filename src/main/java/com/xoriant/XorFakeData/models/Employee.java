package com.xoriant.XorFakeData.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {

    private Integer employeeId;
    private String employeeName;
    private String employeeAddress;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                '}';
    }
}
