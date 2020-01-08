package exercises;

public class ArrayPractice {
    public static void main (String[] args) {
        int[] someNumbers = new int [] {1, 1, 2, 3, 5, 8};
        System.out.println("Entire array:");
        for (int someNumber: someNumbers
             ) {
            System.out.println(someNumber);
        }
        System.out.println("\nNow just the odd numbers:");
        for (int someNumber : someNumbers
                ) {
            if (someNumber % 2 != 0) {
                System.out.println(someNumber);
            }
        }
    }
}
