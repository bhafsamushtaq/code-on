import java.util.Arrays;

public class StringFunctions {
    public static void main(String[] args) {
        String str1 = "Hello there";
        String str2 = "hello there";
        System.out.println(str1.length());
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        char []charArray = str1.toCharArray();
        System.out.println(Arrays.toString(charArray) + "   "+ charArray.length);
    }
}
