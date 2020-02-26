package polymorphism;

class Mercedes {
    public void move() {
        System.out.println("The car is moving fast");
    }
    public void move(double speed) {
        System.out.println("The car is moving " + speed + " meters/sec");
    }
    public void move(String name, double speed) {
        System.out.println("The " + name + " is moving with " + speed + " meters/sec.");
    }
}
