package secondMinAndMax;

import java.util.Arrays;

public class SecondMinSecondMax {
    public static void main(String[] args) {
        int[] array = {3, 90, 1, 5, 6, 7, 9, 15, 3, -4, 7, 10};
        System.out.println(secondMin(array));
        System.out.println(secondMax(array));
    }

    public static int secondMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        int finalMin = min;
        int[] array2 = Arrays.stream(array)
                .filter(i -> i > finalMin)
                .toArray();


        min = array2[0];
        for (int i = 1; i < array2.length; i++) {
            if (array2[i] < min) {
                min = array2[i];
            }
        }
        return min;
    }
    public static int secondMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        int finalMax = max;
        int[] array2 = Arrays.stream(array)
                .filter(i -> i < finalMax)
                .toArray();


        max = array2[0];
        for (int i = 1; i < array2.length; i++) {
            if (array2[i] > max) {
                max = array2[i];
            }
        }
        return max;
    }
}
