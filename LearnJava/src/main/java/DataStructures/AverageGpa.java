/**
 * Exercise
 */

package DataStructures;

public class AverageGpa {
    public double getAverageGpa(){
        double[] gpas = {4.0, 3.4, 2.5, 1.0, 3.0};

        double gpaSum = 0;
        double avgGpa = 0;

        for (int i = 0; i < gpas.length; i++) {
            gpaSum += gpas[i];
        }

        avgGpa = gpaSum / gpas.length;
        return avgGpa;
    }
}
