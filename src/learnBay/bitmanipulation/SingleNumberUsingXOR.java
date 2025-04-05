package learnBay.bitmanipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class SingleNumberUsingXOR {

    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0; i<nums.length; i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new SingleNumberUsingXOR().singleNumber(new int[]{1,2,3,4,1,3,2,1}));
    }


}
