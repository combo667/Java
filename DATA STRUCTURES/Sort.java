import java.util.Scanner;

class bubble_sort {
    public static void sort(int[] array) {
        int i, j, length = array.length;
        int temp;
        for (i = 0; i < length; ++i) {
            for (j = 0; j < length - 1; ++j) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int k = 0; k < length; ++k)
            System.out.print(array[k] + "  ");
    }
}

public class Sort {
    public static void main(String[] args) {
        int elements_size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of values you wanna sort");
        elements_size = sc.nextInt();
        int[] array = new int[elements_size];
        System.out.println("Input the values 1 by 1");
        for (int i = 0; i < elements_size; ++i)
            array[i] = sc.nextInt();
        selection_sort.sort(array);
        sc.close();
    }
}

class selection_sort {
    public static void sort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; ++i) {
            array = swap(array, i, lowest(array, i + 1));
        }

        for (int j = 0; j < length; ++j)
            System.out.print(array[j] + " ");

    }

    public static int lowest(int[] array, int start) {
        int length = array.length;
        int min = Integer.MAX_VALUE;
        int index = start;
        for (int i = start; i < length; ++i) {
            if (array[i] < min)
                index = i;

        }

        return index;
    }

    public static int[] swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

        return array;
    }

}