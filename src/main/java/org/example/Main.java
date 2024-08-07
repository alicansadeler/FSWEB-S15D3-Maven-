package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {

     //   System.out.println("Hello World!");

        List<Employee> employees = new LinkedList<>();

        employees.add(new Employee(1, "Ali Can", "Sadeler"));
        employees.add(new Employee(2, "Osman", "Korkmaz"));
        employees.add(new Employee(3, "Ömer", "Öztürk"));
        employees.add(new Employee(4, "Akın", "Sadeler"));
        employees.add(new Employee(5, "Emre", "Çil"));
        employees.add(new Employee(4, "Hebele", "Hübele"));
        System.out.println(employees);

    }

    public static List<Employee> findDuplicates(List<Employee> employees) {
        Set<Employee> unique = new HashSet<>();
        List<Employee> nonUnique = new ArrayList<>();

        for (Employee employee : employees) {
            if (!unique.add(employee)) {
                nonUnique.add(employee);
            }
        }

        return nonUnique;
    }

    public static Map<Integer, Employee> findUniques(List<Employee> employees) {
        if (employees == null) return Collections.emptyMap();

        Map<Integer, Employee> employeeMap = new HashMap<>();
        for (Employee employee : employees) {
            if (employee != null) {
                employeeMap.put(employee.getId(), employee);
            }
        }
        return employeeMap;
    }

    public static List<Employee> removeDuplicates(List<Employee> employees) {
            if (employees == null) return Collections.emptyList();
            List<Employee> employees1 = new LinkedList<>();
            List<Employee> nonUnique1 = new LinkedList<>();

            for (Employee employee: employees) {
                if(employee != null) {
                    int tekrarSayisi = Collections.frequency(employees, employee);
                    if (tekrarSayisi == 1) {
                        employees1.add(employee);
                    } else {
                        nonUnique1.add(employee);
                    }
                }
            }

            return employees1;
    }
}