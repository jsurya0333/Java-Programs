package oopsEncapsulation;
public class UseStickPen {
    public static void main(String[] args) {
        // Bulk initialization of objects into an array
        StickPen[] pens = {
            new StickPen("Reynolds", 10, "Blue", true, 0.7),
            new StickPen("Cello", 15, "Black", true, 0.5),
            new StickPen("Parker", 100, "Silver", false, 0.6)
        };

        int totalPrice = 0;

        // Print details using for loop
        for (int i = 0; i < pens.length; i++) {
            System.out.println("Brand: " + pens[i].getBrand() +
                               ", Price: " + pens[i].getPrice() +
                               ", Color: " + pens[i].getColor() +
                               ", IsPlastic: " + pens[i].getIsPlastic() +
                               ", TipWidth: " + pens[i].getTipWidth());

            // Add to total price
            totalPrice += pens[i].getPrice();
        }

        System.out.println("Total Price of all StickPens: " + totalPrice);
    }
}