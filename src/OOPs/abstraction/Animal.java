package OOPs.abstraction;
//Abstraction means hiding essential details and showing only limited details to the user.

//Any method which does not have body but only definition, is called abstract method

//Any method which has a body is called concrete method.

/*An abstract class can contain abstract method as well as concrete method*/

/*As shown below, Animal is an abstract class, fly is an abstract method
 * whereas eat is a concrete method*/

public abstract class Animal {
    public abstract void fly();

    public void eat() {
        System.out.println("Alfiya is eating biryani");
    }
}