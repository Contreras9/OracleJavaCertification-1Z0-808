package academy.learnProgramming.basicControlFlow;

public class WhileLoop {
    public static void main(String[] args) {
        int spaceNoHdd = 5;

        while (spaceNoHdd > 0) {
            spaceNoHdd--;
            System.out.println("spaceNoHdd= " + spaceNoHdd);
        }

        int x = 2;
        int y = 5;

        while (x < 10) {
            y++;
            x++;
        }
        System.out.println("x= " + x + ", y= " + y);

        int a = 5;
        int b = 7;

        // a is < 6, while will not execute
        while (a > 6) {
            b += 2;
            a++;
        }

        a = a > 6 ? a++ : b--;
        // false
        // a = b -> 7
        // b-- -> b = b-1 -> b=6
        // a = 6
        // 7 + 6 = 13

        System.out.println(a + ", " + b + ", " + (a + b)); // 7. 6, 13
    }
}
