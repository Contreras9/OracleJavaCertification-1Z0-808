package academy.learnProgramming.basicControlFlow;

public class TernaryOperator {

    public static void main(String[] args) {
        int x = 10;
        int y;

        if (x > 5) y = 2 * x;
        else y = 4 * x;

        System.out.println("y= " + y);

        // ternary operator
        // y = x > 5 ? 2 * x : 4 * x;
        y = (x > 5) ? (2 * x) : (4 * x); // nicer to read
        System.out.println("y= " + y);

        // not same data type example
        y = 1;
        System.out.println(y > 5 ? 10 : "Test");
        // int myInt = y < 10 ? 5 : "Test"; // does not compile

        int a = 1;
        int b = 1;
        int c = a < 10 ? a++ : b++;
        // c = a = 1;
        // a = 2;
        System.out.println(a + ", " + b + ", " + c);

        int d = 1;
        int e = 2;
        int f = 3;

        if (d < 10) {
            f = d++ < 1 ? e++ : f++;
            // d = 2;
            // e = 2;
            // f = 3; -> f = f
        } else {
            f = (d + e) < 2 ? d++ : e++;
        }
        System.out.println(d + ", " + e + ", " + f);
    }
}
