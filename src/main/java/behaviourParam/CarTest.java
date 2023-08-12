package behaviourParam;

import java.util.ArrayList;
import java.util.List;

public class CarTest {

    public static void main(String[] args) {

//        Car car = Car.builder().make("Ford").topSpeed(200).year(2021).build();
//        Car car2 = Car.builder().make("Toyota").build();
//        System.out.println(car);
//        System.out.println(car2);

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Toyoto", 140, 2000));
        carList.add(new Car("Audi", 200, 2008));
        carList.add(new Car("BMW", 210, 2020));
        carList.add(new Car("Nissan", 150, 2018));

//        System.out.println(filterFastCars(carList));
        List<Car> carFast = filter(carList, new CarFastPredicate());
        System.out.println(carFast);

        List<Car> carYear = filter(carFast, new CarNewPredicate());
        System.out.println(carYear);

    }

//    private static List<Car> filterFastCars(List<Car> cars) {
//        List<Car> filteredCars = new ArrayList<>();
//        for (Car car : cars) {
//            if(car.getTopSpeed() > 160) {
//                filteredCars.add(car);
//            }
//        }
//        return filteredCars;
//    }

//    private static List<Car> filterNewCars(List<Car> cars) {
//        List<Car> filteredCars = new ArrayList<>();
//        for (Car car : cars) {
//            if(car.getTopSpeed() > 160) {
//                filteredCars.add(car);
//            }
//        }
//        return filteredCars;
//    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if(carPredicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
































