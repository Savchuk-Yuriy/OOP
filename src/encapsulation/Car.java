package encapsulation;

class Car {
    private String modelName;
    private boolean bortComputer;
    private int numberOfDoors;
    private double averageCarMileage;

    // Getter methods
    public String getModelName() {
        return modelName;
    }
    public boolean getBortComputer() {return bortComputer;}
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public double getAverageCarMileage() { return averageCarMileage; }

    // Setter methods
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public void setBortComputer(boolean bortComputer) {this.bortComputer = bortComputer;}
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    public void setAverageCarMileage(double averageCarMileage) { this.averageCarMileage = averageCarMileage; }
}
