package academy.learnProgramming.javaBasics;

public class WholeNumericPrimitives {

    public static void main(String[] args) {
        long max = 32123456789L;
        long n = 2_300;

        // octal (0-7)
        int oct = 07;
        int firstOct = 010;
        int secondOct = 022;
        int sumOct = firstOct + secondOct; //26 decimal, 32 octal
        System.out.println("first = " + firstOct + ", second = " + secondOct);
        System.out.println("decimalSum = " + sumOct + ", octSum = " + Integer.toOctalString(sumOct));

        // hexadecimal (0-9 and A-F)
        int firstHex = 0xF; // 15 decimal
        int secondHex = 0x1E; // 30 decimal
        int sumHex = firstHex + secondHex; // 45 decimal, 2d hex
        System.out.println("first = " + firstHex + ", second = " + secondHex);
        System.out.println("decimalSum = " + sumHex + ", hexSum = " + Integer.toHexString(sumHex));

        // binary
        int firstBin = 0b1001; // 9 decimal
        int secondBin = 0b0111; // 7 decimal
        int sumBin = firstBin + secondBin; // 16 decimal, 10000 binary
        System.out.println("firstBin = " + firstBin + ", secondBin = " + secondBin);
        System.out.println("decimalSum = " + sumBin + ", binSum = " + Integer.toBinaryString(sumBin));
    }
}
