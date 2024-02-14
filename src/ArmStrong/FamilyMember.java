package ArmStrong;

//this keyword represents the class
//get function is used to access the variable's value
//set function is used to set the variable's value
//we followed encapsulation


public class FamilyMember {

    FamilyMember(String name) {
        this.name  = name;
    }

    private String name;
    private double weight;
    private double height;
    private double bmi;
    private int bpLowerLimit;
    private int bpUpperLimit;

    double getWeight() {
        return weight;
    }

    double getHeight() {
        return height;
    }

    double getBMI() {
        return bmi;
    }

    double getBPLowerLimit() {
        return bpLowerLimit;
    }

    double getBPUpperLimit() {
        return bpUpperLimit;
    }

    void setWeight(double weight){
        if(weight > 0) {
            this.weight = weight;
        }
    }

    void setHeight(double height){
        this.height = height;
    }

    void  setBmi(double bmi){
        this.bmi = bmi;
    }

    void setBpLowerLimit(int bpLowerLimit){
        this.bpLowerLimit = bpLowerLimit;
    }

    void setBpUpperLimit(int bpUpperLimit){
        this.bpUpperLimit = bpUpperLimit;
    }
}
