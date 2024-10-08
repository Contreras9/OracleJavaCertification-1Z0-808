package academy.learnProgramming.understandingStrings;

public class StringConcatenation {

    public static void main(String[] args) {
        String text = "Salam";
        String anotherText = new String("Salam");

        System.out.println(2 + 3); // 5
        System.out.println("a" + "b"); // ab
        System.out.println(1 + 2 + "d"); // 3d

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); // 64

        int number = 10;
        int anotherNumber = 20;
        System.out.println("result= " + (number + anotherNumber));

        String str = "";
        for (int i = 0; i < 10; i++) {
            str += i + ", ";
        }

        System.out.println(str);

        String salam = "Salam";
        String world = "world";
        String slamWorld = salam + world;

        System.out.println(salam);
    }
}
