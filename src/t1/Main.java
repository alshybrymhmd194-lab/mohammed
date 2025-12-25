package t1;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // استنساخ
        int[] clone = ArrayOps.cloneArray(arr);
        System.out.print("Cloned: ");
        ArrayOps.printArray(clone);

        // إزالة عشوائي
        int[] removedRandom = ArrayOps.removeRandom(arr);
        System.out.print("After remove random: ");
        ArrayOps.printArray(removedRandom);

        // إزالة عنصر محدد
        int[] removedSpecific = ArrayOps.removeElement(arr, 3);
        System.out.print("After remove element 3: ");
        ArrayOps.printArray(removedSpecific);

        // عكس المصفوفة
        ArrayOps.reverseArray(arr);
        System.out.print("Reversed: ");
        ArrayOps.printArray(arr);
    }
}

