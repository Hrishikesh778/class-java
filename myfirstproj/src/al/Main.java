package al;

public class Main {
    public static void main(String[] args) {
        // Creating String objects using new keyword
        String str1 = new String("Hello");
        String str2 = str1;  // str2 points to the same object as str1

        System.out.println("Before modification:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // Changing str1 - this creates a new String object
        str1 = new String("World");

        System.out.println("\nAfter modification:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}