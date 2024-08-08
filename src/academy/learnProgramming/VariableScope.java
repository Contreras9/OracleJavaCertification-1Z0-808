package academy.learnProgramming;

public class VariableScope {

    static int myNewInt = 5;
    public static void main(String[] args) {
        int myLocalInt = 9;

        {
            int myOtherInt = 20;
            int anotherInt = 30;
            System.out.println("myOtherInt= " + myOtherInt);
            System.out.println("inCodeBlock myLocalInt= " + myLocalInt);
        }

        System.out.println("myLocalInt= " + myLocalInt);
        System.out.println("myNewInt= " + myNewInt);

        int myOtherInt = 30;
        int anotherInt = 40;

        System.out.println("myOtherInt= " + myOtherInt);
        System.out.println("anotherInt= " + anotherInt);
    }
}
