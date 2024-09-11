package academy.learnProgramming.basicControlFlow;

public class ForLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); // prints new line sign

        int j;
        for (j = 0; j < 10; j++) {
            System.out.print(j + " ");
        }

        System.out.println();
        System.out.println("after for loop j= " + j);

        int x = 0;
        for (int y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.println("y= " + y);
        }

        System.out.println("x= " + x);
    }
}
