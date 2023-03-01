package com.xoriant.XorFakeData.controller;

import com.xoriant.XorFakeData.models.RequestModel;
import com.xoriant.XorFakeData.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/getData")
    public ResponseEntity<String> getMockData(@RequestBody RequestModel requestModel){

        String jsonList = employeeService.generateMockData(requestModel);

        return ResponseEntity.ok(jsonList);

    }
    @GetMapping("/search")
    public ResponseEntity<String> searchByName(@RequestParam String name){
        String jsonList1 = employeeService.searchByName(name);

        return ResponseEntity.ok(jsonList1);
    }
}
