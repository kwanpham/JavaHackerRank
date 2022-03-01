package quandev.com.QuickSort;

import java.util.List;

public class QuickSort {

         static int partition(int[] arr, int low, int high) {
            int pivot = arr[high];
            int index = low - 1;

            for (int i = 0 ; i < high ; i++) {

                if (arr[i] <= pivot) {
                    index++;
                    swap(arr , i , index);
                }

            }

             // swap arr[i+1] và arr[high] (hoặc pivot)
             swap(arr , index+1 , high);

             return index + 1;

        }

        static void swap(int[] arr , int i, int j) {
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
        }


    static void quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {
        /* pi là chỉ số nơi phần tử này đã đứng đúng vị trí
         và là phần tử chia mảng làm 2 mảng con trái & phải */
            int pi = partition(arr, low, high);

            // Gọi đệ quy sắp xếp 2 mảng con trái và phải
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static void printArray(int arr[])
    {
        int i;
        for (i=0; i < arr.length; i++)
            System.out.println(arr[i]);
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int arr[] = {10, 80, 30, 90, 40, 50, 70};

        quickSort(arr, 0, arr.length-1);
        System.out.println("Sorted array: \n");
        printArray(arr);

    }



}
