package stream;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {
        // Print all emails - one employee has one email - One to One
        System.out.println("*********************");
        EmployeeData.readAll()
                .map(Employees::getEmpEmail)
                .forEach(System.out::println);

        // Pint all phone numbers
        System.out.println("*********************");
        EmployeeData.readAll()
                .map(Employees::getEmpPhoneNumber)
                .forEach(System.out::println);

        // Method 1 - flatMap
        System.out.println("*********************");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumber().stream())
                .forEach(System.out::println);

        // Method 2 - flatMap
        System.out.println("*********************");
        EmployeeData.readAll()
                .map(Employees::getEmpPhoneNumber)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}












