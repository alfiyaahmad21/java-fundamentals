package OOPs.inheritance;

import OOPs.abstraction.Human;

class Alfiya implements Human {
    @Override
    public void cook() {
        System.out.println("Alfiya can cook");
    }

    @Override
    public void code() {
        System.out.println("Alfiya can code");
    }

    @Override
    public void play(){
        System.out.println("Alfiya is playing");
    }
}

class InterfaceDemo{
    public static void main(String[] args) {
        Alfiya alfiya = new Alfiya();
        alfiya.cook();
        alfiya.code();
        alfiya.play();
    }
}
