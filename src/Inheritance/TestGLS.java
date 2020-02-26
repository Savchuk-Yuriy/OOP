package Inheritance;

class TestGLS {
    public static void main(String[] args) {
        GLS myGLS = new GLS();

        System.out.println("Name of model" + myGLS.name);
        System.out.println("Year of production: " + myGLS.yearOfProduction);
        System.out.println("Side of drive: " + myGLS.typeHandOfDrive);
        System.out.println("Clearance: " + myGLS.clearance = 18);
        myGLS.Engine();
        myGLS.Beeping();
    }
}
