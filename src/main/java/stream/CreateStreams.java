package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams {

    // Creating a Stream from Array
    String[] courses = {"Java", "Algo", "DS", "Spring"};
    Stream<String> courseBackend = Arrays.stream(courses);

    // Creating Stream from Collection
    List<String> courseList = Arrays.asList("React", "Angular", "JS");
    Stream<String> courseFrontend = courseList.stream();

    List<Course> myCourses = Arrays.asList(
            new Course("Java", 101),
            new Course("DS", 100),
            new Course("Spring", 102),
            new Course("Microservices", 103)
    );
    Stream<Course> myCourseStream = myCourses.stream();

    // Creating Stream from Values
    Stream<Integer> stream = Stream.of(1,2,3,4,5);

}
















