package learnBay.arrays;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int temp = 0;
        int answer = 0;
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] == 1){
                temp++;
                if(temp>answer){
                    answer = temp;
                }
            }else{
                temp = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes m = new MaxConsecutiveOnes();
        System.out.println(m.findMaxConsecutiveOnes(new int[]{1,0,1,1,1,1,1,1}));

    }

}
