public class CarFactory {
    String name;

    CarFactory(String name) {
        this.name = name;
    }

    Car createCar(String engineType) {
        Car car = New Car(engineType);
    }
}