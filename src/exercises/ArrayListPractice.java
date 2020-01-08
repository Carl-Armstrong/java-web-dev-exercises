package exercises;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListPractice {
    public static void main (String[] args) {
        Random randomInt = new Random();
        int maxRandom = 10;
        int minRandom = 1;

        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        randomNumbers.add(randomInt.nextInt((maxRandom - minRandom) +1) + minRandom); // code found online
        randomNumbers.add(randomInt.nextInt((maxRandom - minRandom) +1) + minRandom);
        randomNumbers.add(randomInt.nextInt((maxRandom - minRandom) +1) + minRandom);
        randomNumbers.add(randomInt.nextInt((maxRandom - minRandom) +1) + minRandom);
        randomNumbers.add(randomInt.nextInt((maxRandom - minRandom) +1) + minRandom);
        randomNumbers.add(randomInt.nextInt((maxRandom - minRandom) +1) + minRandom);
        randomNumbers.add(randomInt.nextInt((maxRandom - minRandom) +1) + minRandom);
        randomNumbers.add(randomInt.nextInt((maxRandom - minRandom) +1) + minRandom);
        randomNumbers.add(randomInt.nextInt((maxRandom - minRandom) +1) + minRandom);
        randomNumbers.add(randomInt.nextInt((maxRandom - minRandom) +1) + minRandom);
        System.out.println(randomNumbers);

        Integer sumOfEvens = 0;
        for (Integer randomNumber: randomNumbers
             ) {
            if (randomNumber % 2 == 0) {
                sumOfEvens += randomNumber;
            }
        }
        System.out.println("The sum of the evens is: " + sumOfEvens);
    }
}
