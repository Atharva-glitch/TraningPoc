package com.xoriant.XorFakeData.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {

    private Integer employeeId;
    private String employeeName;

    private Address address;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }


    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", address=" + address +
                '}';
    }
}
