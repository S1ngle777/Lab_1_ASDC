import java.util.Arrays;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        int n = 10000;
        int[] arr = new int[n];
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(n);
        }
        Arrays.sort(arr);
        int x = rand.nextInt(n);

        long startTime = System.nanoTime();
        int result = Search.linearSearch(arr, x);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Время выполнения линейного поиска: " + duration + " наносекунд");
        System.out.println("Индекс элемента: " + result + "\n");

        startTime = System.nanoTime();
        result = Search.binarySearch(arr, x);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Время выполнения бинарного поиска: " + duration + " наносекунд");
        System.out.println("Индекс элемента: " + result);
    }
}