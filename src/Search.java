public class Search {
    // Метод для выполнения бинарного поиска
    public static int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        // Продолжаем, пока левый индекс не станет больше правого
        while (l <= r) {
            // Находим средний элемент
            int m = l + (r - l) / 2;

            // Если средний элемент равен искомому, возвращаем его индекс
            if (arr[m] == x)
                return m;

            // Если средний элемент меньше искомого, сдвигаем левую границу
            if (arr[m] < x)
                l = m + 1;
                // В противном случае сдвигаем правую границу
            else
                r = m - 1;
        }
        // Если элемент не найден, возвращаем -1
        return -1;
    }

    // Метод для выполнения линейного поиска
    public static int linearSearch(int arr[], int x) {
        // Проходим по всему массиву
        for(int i = 0; i < arr.length; i++) {
            // Если текущий элемент равен искомому, возвращаем его индекс
            if(arr[i] == x)
                return i;
        }
        // Если элемент не найден, возвращаем -1
        return -1;
    }
}