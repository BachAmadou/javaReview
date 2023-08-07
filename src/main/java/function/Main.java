package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Users> user = new ArrayList<>();
        user.add(Users.builder().firstName("Bob").lastName("Mike").age(32).build());
        user.add(Users.builder().firstName("Mich").lastName("Smith").age(21).build());
        user.add(Users.builder().firstName("Bach").lastName("Marley").age(41).build());
        user.add(Users.builder().firstName("Jean").lastName("Tyler").age(28).build());

        printName(user, person -> true);
        printName(user, person -> person.getLastName().startsWith("M"));
    }
    private static void printName(List<Users> user, Predicate<Users> person) {
        for(Users per : user) {
            if(person.test(per)) {
                System.out.println(per.toString());
            }
        }
    }
}
