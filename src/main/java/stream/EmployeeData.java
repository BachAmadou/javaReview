package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employees> readAll() {
        return Stream.of(
                new Employees(100, "Mike", "mike@email.com", Arrays.asList("1234567809",
                        "9876654321")),
                new Employees(100, "Bob", "Bob@email.com", Arrays.asList("1206956389",
                        "9876054321")),
                new Employees(100, "Tyler", "Tyler@email.com", Arrays.asList("1234424689",
                        "9872028321"))
        );
    }
}
