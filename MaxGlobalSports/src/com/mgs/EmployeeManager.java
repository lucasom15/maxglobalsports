package com.mgs;

     import java.util.HashMap;
     import java.util.Map;

     public class EmployeeManager {
         private Map<String, Employee> employeeMap;

         public EmployeeManager() {
             employeeMap = new HashMap<>();
         }

         public void addEmployee(Employee employee) {
             employeeMap.put(employee.getId(), employee);
         }

         public Employee getEmployee(String id) {
             return employeeMap.get(id);
         }

         public void displayEmployee(String id) {
             Employee employee = getEmployee(id);
             if (employee != null) {
                 System.out.println(employee);
             } else {
                 System.out.println("Employee not found.");
             }
         }
     }