package t1;

import java.util.Arrays;
import java.util.Random;

class ArrayOps {

    // 1. استنساخ مصفوفة
    public static int[] cloneArray(int[] arr) {
        return arr.clone();
    }

    // 2. إزالة عنصر عشوائي
    public static int[] removeRandom(int[] arr) {
        if (arr.length == 0) return arr;
        Random rand = new Random();
        int index = rand.nextInt(arr.length);

        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) newArr[j++] = arr[i];
        }
        return newArr;
    }

    // 3. إزالة عنصر محدد
    public static int[] removeElement(int[] arr, int value) {
        int count = 0;
        for (int num : arr) if (num == value) count++;
        int[] newArr = new int[arr.length - count];
        int j = 0;
        for (int num : arr) {
            if (num != value) newArr[j++] = num;
        }
        return newArr;
    }

    // 4. عكس المصفوفة
    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    // 5. طباعة المصفوفة
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
