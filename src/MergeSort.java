public class MergeSort {
    // Метод для сортировки массива с использованием алгоритма MergeSort
    public static void sort(int[] arr, int l, int r) {
        // Проверяем, что левая граница меньше правой
        if (l < r) {
            // Находим середину массива
            int m = (l + r) / 2;
            // Рекурсивно сортируем левую и правую половины
            sort(arr, l, m);
            sort(arr, m + 1, r);
            // Соединяем отсортированные половины
            merge(arr, l, m, r);
        }
    }

    // Метод для слияния двух отсортированных половин
    private static void merge(int[] arr, int l, int m, int r) {
        // Вычисляем размеры двух половин
        int n1 = m - l + 1;
        int n2 = r - m;
        // Создаем временные массивы
        int[] L = new int[n1];
        int[] R = new int[n2];
        // Копируем данные во временные массивы
        System.arraycopy(arr, l, L, 0, n1);
        System.arraycopy(arr, m + 1, R, 0, n2);
        // Индексы первого и второго подмассива
        int i = 0, j = 0;
        // Индекс объединенного подмассива
        int k = l;
        // Слияние временных массивов обратно в исходный
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // Копирование оставшихся элементов L[], если есть
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        // Копирование оставшихся элементов R[], если есть
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}