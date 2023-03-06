package com.xoriant.XorFakeData.controller;

import com.xoriant.XorFakeData.models.Employee;
import com.xoriant.XorFakeData.models.RequestModel;
import com.xoriant.XorFakeData.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/employee")
public class RestController {

    @Autowired
    private DataService dataService;
    @GetMapping("/getData")
    public ResponseEntity<String> getMockData(@RequestBody RequestModel requestModel){


        System.out.println("-----");


        String jsonList = dataService.generateMockData(requestModel);

        return ResponseEntity.ok(jsonList);

    }
    @GetMapping("/search")
    public ResponseEntity<String> searchByName(@RequestParam String name){
        String jsonList1 = dataService.searchByName(name);

        return ResponseEntity.ok(jsonList1);
    }
}
