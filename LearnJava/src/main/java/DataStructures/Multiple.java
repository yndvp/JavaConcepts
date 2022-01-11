/**
 * Exercise
 */

package DataStructures;

public class Multiple {
    public void getMultipleOfThree(int[] numbers){

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 3 == 0){
                System.out.println(numbers[i]);
            }
        }

    }
}
