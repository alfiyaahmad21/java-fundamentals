package ArmStrong;

import java.util.Scanner;


public class Question {
    public static void main(String[] args) {
        //FATHER
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date of the record for father");
        int f = sc.nextInt();
        System.out.println("Date of the record for father is  " + f);

        FamilyMember father = new FamilyMember("chunnu");
        father.setWeight(78.9);
        father.setWeight(5.8);
        father.setBmi(22.9);
        father.setBpUpperLimit(124);
        father.setBpLowerLimit(27);

        System.out.println("Weight of father is " + father.getWeight());
        System.out.println("Height of  father is " + father.getHeight());
        System.out.println("bmi of  father is " + father.getBMI());
        System.out.println("Upper limit BP of father is " + father.getBPUpperLimit());
        System.out.println("Lower limit BP of father is " + father.getBPLowerLimit());


        //MOTHER
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter date of the record for mother");
        int m = ab.nextInt();
        System.out.println("Date of the record for mother is " + m);

        FamilyMember Mother = new FamilyMember("Farhat");
        Mother.setWeight(74);
        Mother.setBmi(5.8);
        Mother.setBmi(23.3);
        Mother.setBpUpperLimit(150);
        Mother.setBpLowerLimit(78);

        System.out.println("Height of mother is " + Mother.getWeight());
        System.out.println("Height of mother is " + Mother.getHeight());
        System.out.println("bmi of mother is " + Mother.getBMI());
        System.out.println("Upper limit BP of mother is " + Mother.getBPUpperLimit());
        System.out.println("Lower limit BP of mother is " + Mother.getBPLowerLimit());


        //IMRAN
        Scanner im = new Scanner(System.in);
        System.out.println("Enter the date of the record for imran");
        int i = im.nextInt();
        System.out.println("Date of the record for imran is " + i);

        FamilyMember Imran = new FamilyMember("Imran");
        Imran.setWeight(52);
        Imran.setHeight(5.9);
        Imran.setBmi(18.5);
        Imran.setBpUpperLimit(119);
        Imran.setBpLowerLimit(70);

        System.out.println("Weight of imran is " + Imran.getWeight());
        System.out.println("Height of imran is " + Imran.getHeight());
        System.out.println("bmi of imran is " + Imran.getBMI());
        System.out.println("Upper limit BP of imran is " + Imran.getBPUpperLimit());
        System.out.println("Lower limit BP of imran is " + Imran.getBPLowerLimit());


        //ZOYA
        Scanner zo = new Scanner(System.in);
        System.out.println("Enter the date of the record for zoya");
        int z = zo.nextInt();
        System.out.println("Date of the record for zoya is " + z);

        FamilyMember Zoya = new FamilyMember("Zoya");
        Zoya.setWeight(55);
        Zoya.setHeight(5.5);
        Zoya.setBmi(19.6);
        Zoya.setBpUpperLimit(150);
        Zoya.setBpLowerLimit(77);

        System.out.println("Weight of zoya is " + Zoya.getWeight());
        System.out.println("Height of zoya is " + Zoya.getHeight());
        System.out.println("bmi of zoya is " + Zoya.getBMI());
        System.out.println("Upper limit BP for zoya is " + Zoya.getBPUpperLimit());
        System.out.println("Lower limit BP for zoya is " + Zoya.getBPLowerLimit());


        //FARHAN
        Scanner fr = new Scanner(System.in);
        System.out.println("Enter the date of the record for farhan");
        int r = fr.nextInt();
        System.out.println("Date of the record for farhan is " + r);

        FamilyMember Farhan = new FamilyMember("Farhan");
        Farhan.setWeight(75);
        Farhan.setHeight(5.6);
        Farhan.setBmi(22.4);
        Farhan.setBpUpperLimit(160);
        Farhan.setBpLowerLimit(72);

        System.out.println("Weight of farhan is " + Farhan.getWeight());
        System.out.println("Height of farhan is " + Farhan.getHeight());
        System.out.println("bmi of farhan is " + Farhan.getBMI());
        System.out.println("Upper limit BP for farhan is " + Farhan.getBPUpperLimit());
        System.out.println("Lower limit BP for farhan is " + Farhan.getBPLowerLimit());
    }
}

