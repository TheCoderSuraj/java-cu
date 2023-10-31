class SuperParent {
    int age = 10;
}

class Parent extends SuperParent { // this is simple inheritance
    int child = 2;

}

// below this is hirerachial inheritance
class Child extends Parent {
    String name = "Suraj";
}

class A extends Child {
    int friends = 5;
}

class B extends Child {
    int colleges = 4;
}

public class InheritanceTypes {
    public static void main(String[] args) {
        Child c = new Child(); // multi level inheritance
        System.out.println("age:" + c.age + "\nchild: " + c.child + "\nname: " + c.name);

        A a = new A();
        B b = new B();
        System.out.println("A");
        System.out.println("age:" + a.age + "\nchild: " + a.child + "\nname: " + a.name + "\nfriends: " + a.friends);
        System.out.println("B");
        System.out.println("age:" + a.age + "\nchild: " + a.child + "\nname: " + a.name + "\ncolleges: " + b.colleges);
    }

}
