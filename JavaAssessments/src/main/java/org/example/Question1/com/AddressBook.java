package org.example.Question1.com;

import java.util.HashMap;
import java.util.Map;

public class AddressBook {
    private Map<Employee, Address> employeeAddressMap;

    public AddressBook() {
        this.employeeAddressMap = new HashMap<>();
    }

    public void addEmployeeAddress(Employee employee, Address address) {
        employeeAddressMap.put(employee, address);
    }

    public void getAddress(Employee employee) {
        Address address = employeeAddressMap.get(employee);
        if (address != null) {
            System.out.println("Address for " + employee + ": " + address);
        } else {
            System.out.println("Employee " + employee + " does not exist.");
        }
    }

    public void printDistinctCities() {
        System.out.println("Distinct cities in ascending order:");
        employeeAddressMap.values().stream()
                .map(Address::toString)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}

