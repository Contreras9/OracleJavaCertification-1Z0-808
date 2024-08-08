package academy.learnProgramming;

public class DecimalNumericPrimitives {

    public static void main(String[] args) {
        float myNumber = 25.4F;

        double myDouble = 2.54;
        double myDouble2 = 2.54F;
        double anotherDouble = 2.45D; // d can be used for double, it is optional

        double scientific = 5.000125E03;
        double scientific2 = 5.000125E3;
        double myDouble3 = 5000.125;

        System.out.println("scientific= " + scientific);
        System.out.println("scientific= " + scientific2);
        System.out.println("myDouble3= " + myDouble3);

        double hexPi = 0x1.91eb851eb851fp1; // p indicates hexadecimal floating point number
        System.out.println("hexPi= " + hexPi);
    }
}
