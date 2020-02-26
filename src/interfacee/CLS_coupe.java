package interfacee;

class CLS_coupe implements Car, Mercedes {
    public void made_in() {
        System.out.println("CLS coupe model is made in USA.");
    }
    public void car_class() {
        System.out.println("It's a business or comfort car class");
    }
    public void cost() {
        System.out.println("CLS coupe cost about 35000 euros");
    }
}
