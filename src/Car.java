public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    void presentation() {
        System.out.println(brand + " " + model + ", " + year + " года выпуска," + " сборка в " + country + ", "
                + color + " цвета, объем двигателя — " + engineVolume + " л.");
    }
}
