package OOPs;

public class Fish {
    String type = "Goldfish";
    String age = "Two months";

    boolean canSwim() {
        return true;
    }

    void printColor(){
        System.out.println("Yellow");
    }

    public static void main(String[] args) {
        Fish fish = new Fish();
        System.out.println(fish.type);
        System.out.println(fish.age);
        fish.printColor();
    }
}
