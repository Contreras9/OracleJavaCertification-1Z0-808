package academy.learnProgramming.understandingStrings;

public class StringBuilderMethods {

    public static void main(String[] args) {
        // charAt, indexOf, length, substring
        // 0 1 2 3 4 5 6 7 8 9 10
        // p r o g r a m m i n g
        StringBuilder sb = new StringBuilder("programming");
        String sub = sb.substring(sb.indexOf("g"), sb.indexOf("mi"));
        int len = sb.length();
        char ch = sb.charAt(5);
        System.out.println(sub + " " + len + " " + ch);

        // append
        StringBuilder b = new StringBuilder().append(1).append("L");
        b.append("-").append(true);
        System.out.println(b);

        StringBuilder builder = new StringBuilder("programming");
        builder.insert(7, "-");
        builder.insert(2, 2);
        System.out.println(builder);

        builder.delete(4, 9);
        System.out.println(builder);
        builder.deleteCharAt(2);
        System.out.println(builder);

        builder.delete(1, 1);
        System.out.println(builder);

        StringBuilder sb1 = new StringBuilder("ABC123");
        sb1.reverse();
        System.out.println(sb1);

        String myString = sb1.toString();
        myString = myString.toLowerCase();
        System.out.println(myString);
    }
}
