//Реализовать алгоритм сортировки слиянием

package WORK;

/**
 * program1
 */
public class program1 {

    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 10 };
        mergeSort(array);

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i] + " ");
    }

    private static void mergeSort(int[] array) {
        int n = array.length;
        if (n == 1) return;
          

        int middle = n / 2;
        int[] l = new int[middle];
        int[] r = new int[n - middle];

        for (int i = 0; i < middle; i++)
            l[i] = array[i];

        for (int i = 0; i < n - middle; i++)
            r[i] = array[i + middle];

        mergeSort(r);
        mergeSort(r);
        merge(array, l, r);

    }

    private static void merge(int[] array, int[] l, int[] r) {
        int left = l.length;
        int right = r.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left && j < right) {
            if (l[i] < r[j]) {
                array[k] = l[i];
                i++;
                k++;

            } else {
                array[k] = r[j];
                j++;
                k++;
            }
        }
        for (int ll = i; ll < left; ll++)
            array[k++] = l[ll];

        for (int rr = i; rr < left; rr++)
            array[k++] = r[rr];

    }

}




//------------------------------------------------------------------------------------

/* 
ОТВЕТ:
1 
2 
3
4
5
6
7
8
9
10
*/