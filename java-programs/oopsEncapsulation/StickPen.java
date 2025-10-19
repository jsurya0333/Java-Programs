package oopsEncapsulation;
public class StickPen {
    // Fields
    private String brand;
    private int price;
    private String color;
    private boolean isPlastic;
    private double tipWidth;

    // Constructor
    public StickPen(String brand, int price, String color, boolean isPlastic, double tipWidth) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.isPlastic = isPlastic;
        this.tipWidth = tipWidth;
    }

    // Getters & Setters
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsPlastic() {
        return isPlastic;
    }
    public void setIsPlastic(boolean isPlastic) {
        this.isPlastic = isPlastic;
    }

    public double getTipWidth() {
        return tipWidth;
    }
    public void setTipWidth(double tipWidth) {
        this.tipWidth = tipWidth;
    }
}