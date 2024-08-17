package academy.learnProgramming.javaBasics;

import static academy.learnProgramming.javaBasics.Config.*;
import static java.lang.Math.PI;
import static java.lang.Math.min;

public class StaticImportsExample {

    public static void main(String[] args) {
        int min = min(5, 7);
        System.out.println("min: " + min);
        System.out.println(PI);

        printConfig();
    }
}
