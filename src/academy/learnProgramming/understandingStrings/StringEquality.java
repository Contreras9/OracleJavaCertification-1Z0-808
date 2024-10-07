package academy.learnProgramming.understandingStrings;

public class StringEquality {

    public static void main(String[] args) {
        String name = "Yared";
        String anotherName = "Yared";
        String yared = "Ya" + "red";
        String newName = new String("Yared");

        System.out.println("name == anotherName -> " + (name == anotherName));
        System.out.println("name == yared -> " + (name == yared));
        System.out.println("name == newName -> " + (name == newName));

        System.out.println("name.equals(anotherName) -> " + name.equals(anotherName));
        System.out.println("name.equals(yared) -> " + name.equals(yared));
        System.out.println("name.equals(newName) -> " + name.equals(newName));

        System.out.println("name - identityHashCode -> " + System.identityHashCode(name));
        System.out.println("anotherName - identityHashCode -> " + System.identityHashCode(anotherName));
        System.out.println("yared - identityHashCode -> " + System.identityHashCode(yared));
        System.out.println("newName - identityHashCode -> " + System.identityHashCode(newName));

        String str1 = "abc";
        String str2 = "ab";
        String str3 = "ab" + "c";
        String str4 = str2 + "c";

        System.out.println("str1 - identityHashCode ->" + System.identityHashCode(str1));
        System.out.println("str2 - identityHashCode ->" + System.identityHashCode(str2));
        System.out.println("str3 - identityHashCode ->" + System.identityHashCode(str3));
        System.out.println("str4 - identityHashCode ->" + System.identityHashCode(str4));

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
    }
}