package function;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Users {

    private String firstName;
    private String lastName;
    private int age;

}
