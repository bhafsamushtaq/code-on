package learnBay.bitmanipulation;

public class HamingWeight {
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        HamingWeight h = new HamingWeight();
        System.out.println(h.hammingWeight(3));
        System.out.println(h.hammingWeight(5));
        System.out.println(h.hammingWeight(10));
        System.out.println(h.hammingWeight(8));
    }
}
