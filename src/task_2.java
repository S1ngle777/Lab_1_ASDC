import java.util.Random;

public class task_2 {
    public static void main(String[] args) {
        int size = 10000;
        int[] arr = new int[size];
        int[] arr1;
        int[] arr2;
        int[] arr3;
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            int randomNum = rand.nextInt(10000);
            arr[i] = randomNum;
        }
        arr1 = arr.clone();
        arr2 = arr.clone();
        arr3 = arr.clone();

        long startTime = System.nanoTime();
        QuickSort.sort(arr1, 0, arr1.length - 1);
        long endTime = System.nanoTime();
        System.out.println("Время выполнения QuickSort: " + (endTime - startTime) + " наносекунд");

        startTime = System.nanoTime();
        MergeSort.sort(arr2, 0, arr2.length - 1);
        endTime = System.nanoTime();
        System.out.println("Время выполнения MergeSort: " + (endTime - startTime) + " наносекунд");

        startTime = System.nanoTime();
        HeapSort.sort(arr3);
        endTime = System.nanoTime();
        System.out.println("Время выполнения HeapSort: " + (endTime - startTime) + " наносекунд");



    }
}
