package prac;

public class q {
    public static void main(String[] args) {
        // Car c = new Car();
        // c.print();
        Rectangle rec = new Rectangle(23, 32);
        rec.printArea();
    }
}

class Car {
    int year;
    String model;

    Car() {
        model = "unknown";
        year = 0;
    }

    void print() {
        System.out.println("model: " + model + "\nyear: " + year);

    }
}

class Rectangle {
    int width;
    int len;

    Rectangle(int w, int length) {
        len = length;
        width = w;
    }

    void printArea() {
        System.out.println("Area is " + len * width);
    }
}