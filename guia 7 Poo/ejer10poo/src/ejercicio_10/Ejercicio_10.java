package ejercicio_10;

import java.util.Arrays;

public class Ejercicio_10 {

    public static void main(String[] args) {
        double[] arrayA = new double[50];
        double[] arrayB = new double[20];
        for (int i = 0; i < 50; i++) {
            arrayA[i] = Math.floor(Math.random() * 11);
        }
        System.out.println(Arrays.toString(arrayA));
        Arrays.sort(arrayA);

        for (int i = 0; i < 10; i++) {
            arrayB[i] = arrayA[i];
        }
        Arrays.fill(arrayB, 10, 20, 0.5);
        System.out.println("-----------------");
        System.out.println(Arrays.toString(arrayA));
        System.out.println("-----------------");
        System.out.println(Arrays.toString(arrayB));

    }

}
