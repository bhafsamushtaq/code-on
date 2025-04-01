package learnBay.arrays;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[count] = nums[i];
                count++;
            }
        }
        while(count < nums.length){
            nums[count] = 0;
            count++;
        }
    }

    public static void main(String[] args) {
        MoveZeros m = new MoveZeros();
        m.moveZeroes(new int[]{0,1,0,3,12});
    }
}
