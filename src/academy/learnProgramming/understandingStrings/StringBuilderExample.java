package academy.learnProgramming.understandingStrings;

public class StringBuilderExample {

    public static void main(String[] args) {
        String myString = "";

        for (char c = 'a'; c <= 'z'; c++) {
            myString += c; // every iteration this will create new String object
        }

        System.out.println(myString);

        // with StringBuilder

        StringBuilder sb = new StringBuilder();

        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(c);
        }

        System.out.println(sb);

        //
        StringBuilder builder = new StringBuilder("start");
        builder.append("-middle");
        StringBuilder anotherBuild = builder.append("-end");

        System.out.println(builder);
        System.out.println(anotherBuild);

        System.out.println(builder == anotherBuild);
        System.out.println(System.identityHashCode(builder));
        System.out.println(System.identityHashCode(anotherBuild));

        StringBuilder myBuilder = new StringBuilder();
        System.out.println("size= " + myBuilder.length());
        System.out.println("capacity= " + myBuilder.capacity());

        myBuilder = new StringBuilder(100);
        System.out.println("size= " + myBuilder.length());
        System.out.println("capacity= " + myBuilder.capacity());

        myBuilder.append("MyNewTest");
        System.out.println("size= " + myBuilder.length());
        System.out.println("capacity= " + myBuilder.capacity());

        StringBuilder a = new StringBuilder("This ");
        StringBuilder b = a.append("Java ");
        b = b.append("is").append(" so ").append("Cool");
        System.out.println(a);
        System.out.println(b);
    }
}
