package behaviourParam;

public class CarNewPredicate implements CarPredicate {
    @Override
    public boolean test(Car car) {
        return car.getYear() > 2000;
    }
}
