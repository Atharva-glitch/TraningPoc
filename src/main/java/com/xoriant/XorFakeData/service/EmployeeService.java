package com.xoriant.XorFakeData.service;

import com.xoriant.XorFakeData.models.RequestModel;

public interface EmployeeService {
    String generateMockData(RequestModel requestModel);
    String searchByName(String name);
}
