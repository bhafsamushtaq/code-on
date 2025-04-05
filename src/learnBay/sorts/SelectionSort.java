package learnBay.sorts;

public class SelectionSort {
    void selectionSort(int[] arr) {
        for(int i = 0; i< arr.length-1; i++){
            int min_index = i;
            for(int j = i+1; j< arr.length ; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        SelectionSort s = new SelectionSort();
        int[] arr = {1,200,3,4,5000,6,7,8,9};
        s.selectionSort(arr);
        System.out.println(arr[8]);
    }
}
