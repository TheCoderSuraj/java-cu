/*
 * Suppose you have been assigned a task to create an application for a billing counter at a nearby shopping mart. The application should be able to perform all sort of calculative tasks. Formulate a java code to implement the above said task using objects for the primitive data types so used.
 */

import java.util.Scanner;

public class JavaEval2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.println("Enter the length of items: ");
        len = sc.nextInt();

        Item[] items = new Item[len];
        for (int i = 0; i < len; i++) {
            Item it = new Item();
            it.getInput();
            items[i] = it;
        }

        display(items);
    }

    public static double calculateTotalPrice(Item[] items) {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            total += items[i].calculatePrice();
        }
        return total;
    }

    public static void display(Item[] items) {
        String header = "Item\tQty\tprice\ttotal";
        double total = calculateTotalPrice(items);
        System.out.println(header);
        for (int i = 0; i < items.length; i++) {
            items[i].display();
        }
        System.out.println("\t\tTotal: " + total);
    }
}

class Item {
    String name;
    int quantity;
    double price = 0.0f;

    // Item(String nam, int quan, double pric) {
    // this.name = nam;
    // this.price = pric;
    // this.quantity = quan;
    // }

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of Item: ");
        name = sc.nextLine();
        System.out.println("Enter quantity of item: ");
        quantity = sc.nextInt();
        System.out.println("Enter unit price: ");
        price = sc.nextDouble();
    }

    double calculatePrice() {
        return price * quantity;
    }

    void display() {
        String res = name + "\t" + quantity + "\t" + price + "\t" + price * quantity;
        System.out.println(res);
    }
}
