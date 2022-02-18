package quandev.com.QuickSort;

import java.util.List;

public class QuickSort {

         int partition(List<Integer> arr , int low  , int high) {
            int pivot = arr.get(high);
            int index = low - 1;

            for (int i = 0 ; i < high ; i++) {

                if (arr.get(i) <= pivot) {
                    index++;
                    int temp = arr.get(index);
                    arr.set(index , arr.get(i));
                    arr.set(i , temp);
                }

            }

             // swap arr[i+1] và arr[high] (hoặc pivot)
             int temp = arr.get(index+1);
             arr.set(index+1 , arr.get(high));
             arr.set(high , temp);

             return index + 1;

        }

}
