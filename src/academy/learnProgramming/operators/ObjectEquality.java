package academy.learnProgramming.operators;

public class ObjectEquality {

    public static void main(String[] args) {
        // comparing objects
        Integer myInteger = 127;
        Integer myOtherInteger = 127;

        System.out.println(myInteger == myOtherInteger); // true

        System.out.println("128 == 128: " + (128 == 128)); // true
        System.out.println("myInteger hash= " + System.identityHashCode(myInteger));
        System.out.println("myOtherInteger hash= " + System.identityHashCode(myOtherInteger));

        myInteger = 128;
        myOtherInteger = 128;

        System.out.println("myInteger hash= " + System.identityHashCode(myInteger));
        System.out.println("myOtherInteger hash= " + System.identityHashCode(myOtherInteger));
        System.out.println(myInteger == myOtherInteger); // false

        Integer int1 = new Integer(1);
        Integer int2 = new Integer(1);
        Integer int3 = 1;

        System.out.println("int1 == int2: " + (int1 == int2));
        System.out.println("int1 == int3: " + (int1 == int3));
        System.out.println("int2 == int3: " + (int2 == int3));

        System.out.println("int1.equals(int2): " + (int1.equals(int2)));
        System.out.println("int1.equals(int3): " + (int1.equals(int3)));
        System.out.println("int2.equals(int3): " + (int1.equals(int3)));

        System.out.println("int1 hash= " + System.identityHashCode(int1));
        System.out.println("int2 hash= " + System.identityHashCode(int2));
        System.out.println("int3 hash= " + System.identityHashCode(int3));
    }
}
