package pt6;

public class OverridingVsOverLoading {
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Parent();

        c.sayHello();
        System.out.println("---------------------");
        p.sayHello();
        System.out.println("---------------------");
        p.process(2.0);
        c.process(2.0);
        p.process(2);
        c.process(2);
    }
}

class Parent {
    void process(double i) {
        System.out.println(i * 2);
    }

    void sayHello() {
        System.out.println("Hello from parent class");
    }
}

class Child extends Parent {
    // @Override
    void process(int i) {
        System.out.println(i * 3);
    }

    @Override
    void sayHello() {
        super.sayHello();
        System.out.println("Hello From Child Class");
    }
}
