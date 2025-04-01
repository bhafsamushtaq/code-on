package learnBay.arrays;

public class SecondLargestElement {
    public int getSecondLargest(int[] arr) {
        int maxValue = -1;
        int secondMaxValue = -1;
        for(int i= 0; i< arr.length; i++){
            if(arr[i] > maxValue){
                secondMaxValue = maxValue;
                maxValue = arr[i];
            }else if(arr[i] < maxValue && arr[i] > secondMaxValue){
                secondMaxValue = arr[i];
            }
        }
        return secondMaxValue;
    }

    public static void main(String[] args) {
        SecondLargestElement secondLargestElement = new SecondLargestElement();
        System.out.println(secondLargestElement.getSecondLargest(new int[]{1,2,3}));
    }
}
