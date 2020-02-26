package polymorphism;

class TestMercedes {
    public static void main(String[] args) {
        Mercedes myMercedes = new Mercedes();

        myMercedes.move();
        myMercedes.speed(15);
        myMercedes.move("eagle", 15);
    }
}
