package encapsulation;

public class TestCar {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setModelName("Mercedes C180 Sedan");
        myCar.BortComputer(true);
        myCar.setNumberOfDoors(5);
        myCar.AverageCarMileage(180000);

        System.out.println("Model name: " + myCar.get_ModelName());
        System.out.println("Bort Computer in salon: " + myCar.getBortComputer());
        System.out.println("Number of doors: " + myCar.NumberOfDoors());
        System.out.println("Average Mileage: " + myCar.AverageCarMileage() + " km");
    }
}