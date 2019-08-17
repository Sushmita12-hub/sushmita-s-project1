package Constructor;

public class car {
    public String brand;
    public String model;
    public int year;
    public double price;
    public boolean isUsed;

    // constructor;
    public car () {
        this.brand = "Honda";
        this.model = "Civic";
        this.year = 2014;
        this.price = 15000.00;
        this.isUsed = true;

    }

    public car(String brand, String model, int year, double price, boolean isUsed){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isUsed = isUsed;

    }

    public car(String brand, int year,double price){
        this.brand = brand;
        this.year = year;
        this.price =price;

    }
    public void setbrand(String brand){
        this.brand = brand;

    }
    public String getBrand(){
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }
}
