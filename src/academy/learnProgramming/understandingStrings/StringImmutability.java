package academy.learnProgramming.understandingStrings;

public class StringImmutability {

    public static void main(String[] args) {
        String salam = "Salam";
        String privet = salam + "World";
        privet = salam;

        System.out.println(privet + salam);

        salam = salam.toUpperCase();

        System.out.println(salam);

        // concat
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");

        System.out.println(s1); // 1
        System.out.println(s2); // 12
    }
}
