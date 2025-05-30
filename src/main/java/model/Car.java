package model;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public Car() {
    }

    public Car(String carBrand, String carModel, int horsePower) {
        this.brand = carBrand;
        this.model = carModel;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return brand + "  " + model + "  " + horsePower + "\n";
    }
}
