package com.xoriant.XorFakeData.service;

import com.xoriant.XorFakeData.models.RequestModel;

public interface DataService {
   // String generateMockData(RequestModel requestModel);
   String generateMockData(RequestModel requestModel);



    String searchByName(String name);
}
