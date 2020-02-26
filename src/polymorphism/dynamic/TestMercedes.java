package polymorphism.dynamic;

class TestMercedes {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.made_in();

        Mercedes myMercedes = new Mercedes();
        myMercedes.made_in();
    }
}
