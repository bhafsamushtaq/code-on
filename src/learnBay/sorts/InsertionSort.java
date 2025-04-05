package learnBay.sorts;

public class InsertionSort {
    public void insertionSort(int arr[]) {
        for(int i = 1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        InsertionSort s = new InsertionSort();
        int[] arr = {1,2,3,4,5000,6,7,8,9};
        s.insertionSort(arr);
        System.out.println(arr[8]);
    }
}
