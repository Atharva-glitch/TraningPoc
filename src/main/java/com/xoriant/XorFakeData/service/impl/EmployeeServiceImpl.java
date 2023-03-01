package com.xoriant.XorFakeData.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import com.xoriant.XorFakeData.models.Employee;
import com.xoriant.XorFakeData.models.RequestModel;
import com.xoriant.XorFakeData.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    Faker faker = new Faker();
    ObjectMapper objectMapper = new ObjectMapper();
    List<Object> jsonList = new ArrayList<>();

    @Override
    public String generateMockData(RequestModel requestModel) {

        String jsonObject;
        jsonList = generateEmployeeData(jsonList, faker, objectMapper,requestModel);

        try {
            jsonObject = objectMapper.writeValueAsString(jsonList);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return jsonObject;
    }

    @Override
    public String searchByName(String name) {

        String jsonObject;
        List<Employee> employeeList = returnObjectList(jsonList);
        List<Object> searchList = new ArrayList<>();
       // System.out.println(jsonList);
        for(Employee employee:employeeList){
            System.out.println(employee.getEmployeeName()+"  "+ name.toLowerCase());
            if(employee.getEmployeeName().toLowerCase().replace(" ","").contains(name.toLowerCase())){
                searchList.add(employee);
            }
        }

        try {
            jsonObject = objectMapper.writeValueAsString(searchList);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        //System.out.println("HI"+jsonObject);
        return jsonObject;
    }

    private List<Object> generateEmployeeData(List<Object> jsonList, Faker faker, ObjectMapper objectMapper, RequestModel requestModel){

        for(int i=0;i< requestModel.getCount();i++) {
            Employee employeeBuilder = Employee.builder()
                    .employeeId(faker.number().randomDigit())
                    .employeeName(faker.name().fullName())
                    .employeeAddress(faker.address().fullAddress())
                    .build();

            jsonList.add(employeeBuilder);

        }
        return jsonList;
    }

    public List<Employee> returnObjectList( List<Object> jsonList){
        List<? extends Object> list = jsonList;
        return (List<Employee>) list;
    }

}
