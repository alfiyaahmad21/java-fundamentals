package OOPs.inheritance;

import OOPs.abstraction.Animal;

/*Inheritance is a concept in which one class inherits the property of another class*/

/*The class which is extended is called Super/Parent class.
 * which is Animal in our case*/

/*The class which extends is called Sub/Child class.
 * which is Kofta in our case*/

class Kofta extends Animal {
    @Override
    public void fly() {
        System.out.println("Kofta cannot fly");
    }
}

class Person extends Kofta {
    void run() {
        System.out.println("Person is running");
    }
}

class Main {
    public static void main(String[] args) {
        //here we have created an object called kofta, which is of type Kofta
        Kofta kofta = new Kofta();
        kofta.eat();
        kofta.fly();

        Person person = new Person();
        person.run();
        person.fly();
        person.eat();
    }
}