class Animal {
    void breathe() {
        System.out.print("Breathing");
    }
}

class Fish extends Animal {

    @Override
    void breathe() {
        super.breathe();
        System.out.print("via gills...");
    }

    void swim() {
        System.out.println("Swimming...");
    }

}

class Bird extends Animal {

    @Override
    void breathe() {
        super.breathe();
        System.out.print("via lungs...");
    }

    void fly() {
        System.out.println("flying...");
    }

}

class HummingBird extends Bird {
    void flyBackward() {
        System.out.println("flying backward...");

    }
}

class Ostrich extends Bird {
    void run() {
        System.out.println("running...");
    }

    @Override
    void fly() {
        System.out.println("Can't fly...");

    }

}

public class Example1 {
    public static void main(String[] args) {
        Ostrich o = new Ostrich();
        HummingBird h = new HummingBird();
        Fish f = new Fish();

        System.out.println("Ostrich");
        o.breathe();
        o.fly();
        o.run();
        h.breathe();

        System.out.println("Humming bird");
        h.flyBackward();
        h.fly();
        h.breathe();

        System.out.println("Fish");
        f.breathe();
        f.swim();
    }
}
