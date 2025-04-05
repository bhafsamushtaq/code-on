package learnBay.sorts;

public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        for(int i = 0;i <arr.length; i++) {
            for(int j = 0; j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int [] arr = {1,2,300,4,5,76,7,8,9};
        bubbleSort.bubbleSort(arr);
        System.out.println(arr[8]);
    }
}
