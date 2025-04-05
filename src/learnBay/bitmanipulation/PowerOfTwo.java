package learnBay.bitmanipulation;

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        }
        if((n & (n-1)) == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PowerOfTwo p = new PowerOfTwo();
        System.out.println(p.isPowerOfTwo(1));
        System.out.println(p.isPowerOfTwo(2));
        System.out.println(p.isPowerOfTwo(3));
    }
}
