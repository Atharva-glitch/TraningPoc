package com.xoriant.XorFakeData;

import com.xoriant.XorFakeData.models.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class XorFakeDataApplication {

	public static void main(String[] args) {

		SpringApplication.run(XorFakeDataApplication.class, args);
		List<Field> collect = Arrays.stream(Employee.class.getDeclaredFields()).collect(Collectors.toList());
		for (Field field: collect){
			System.out.println(field);
		}
	}

}
