public class QuickSort {
    // Метод для сортировки массива с использованием алгоритма QuickSort
    public static void sort(int[] arr, int low, int high) {
        // Проверяем, что левая граница меньше правой
        if (low < high) {
            // Выполняем разбиение массива
            int pi = partition(arr, low, high);
            // Рекурсивно сортируем элементы перед разделителем и после
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    // Метод для разбиения массива
    private static int partition(int[] arr, int low, int high) {
        // Выбираем элемент для разбиения
        int pivot = arr[high];
        // Индекс меньшего элемента
        int i = (low - 1);
        // Проходим по массиву
        for (int j = low; j < high; j++) {
            // Если текущий элемент меньше разделителя
            if (arr[j] < pivot) {
                // Увеличиваем индекс меньшего элемента
                i++;
                // И выполняем обмен элементов
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Обмен элементов
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        // Возвращаем индекс разделителя
        return i + 1;
    }
}