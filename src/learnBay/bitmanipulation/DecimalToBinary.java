package learnBay.bitmanipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class DecimalToBinary {

    static String decToBinary(int n) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        while(n > 0){
            arr.add(n%2);
            n = n/2;
        }
        Collections.reverse(arr);
        return arr.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(decToBinary(7));
    }
}
