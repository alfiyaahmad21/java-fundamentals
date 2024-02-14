package OOPs.polymorphism;

/*When two or more classes extend and override the same method,
 it is called method/function Overriding*/

//Method Overriding is also called Dynamic Polymorphism

public abstract class DynamicPolymorphism {
    abstract void printName();
}

class Alfiya extends DynamicPolymorphism {
    @Override
    void printName() {
        System.out.println("Name is Alfiya");
    }

    public static void main(String[] args) {
        Alfiya alfiya = new Alfiya();
        alfiya.printName();
    }
}

class Zoya extends DynamicPolymorphism {
    @Override
    void printName() {
        System.out.println("Name is Zoya");
    }

    public static void main(String[] args) {
        Zoya zoya = new Zoya();
        zoya.printName();
    }
}