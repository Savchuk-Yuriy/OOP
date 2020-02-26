package abstr;

abstract class Car {
    // abstract methods
    abstract void made_in();
    abstract void car_class();
    abstract void cost();

    // concrete method
    void label() {
        System.out.println("abstr.Car's data:");
    }
}