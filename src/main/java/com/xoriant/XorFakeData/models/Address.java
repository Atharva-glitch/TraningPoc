package com.xoriant.XorFakeData.models;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Address {

    private String streetName;
    private String cityName;
    private String country;
}
