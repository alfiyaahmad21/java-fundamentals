package OOPs.encapsulation;

/*In Encapsulation, we make the variables of a Class private,
 so that it can't be accessed from outside the  Class*/

/*We can create a fully encapsulated class in Java by making all the data members of the class private.
 We can use setter and getter methods to set and get the data in it.*/

/*We use getter and setters here to set and get the value of the variable*/

public class Student {
    //private data member
    private String name;

    //getter method for name
    String getName() {
        return name;
    }

    //setter method for name
    void setName(String name) {
        this.name = name;
    }
}

class EncapsulationDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alfiya");
        System.out.println(student.getName());
    }
}

