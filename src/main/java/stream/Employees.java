package stream;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Employees {
    private int empId;
    private String empName;
    private String empEmail;
    private List<String> empPhoneNumber;
}
