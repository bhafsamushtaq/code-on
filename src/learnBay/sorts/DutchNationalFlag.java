package learnBay.sorts;

public class DutchNationalFlag {
    public void sortColors(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, low, mid) ;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        DutchNationalFlag obj = new DutchNationalFlag();
        int[] arr = {1,0,1,1,2,2,0,0,0};
        obj.sortColors(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
