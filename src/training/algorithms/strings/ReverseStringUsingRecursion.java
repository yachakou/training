package training.algorithms.strings;

public class ReverseStringUsingRecursion {
    public static void main(String[] args) {
        String s1 = "hello";
        String s = reverseStringUsingRecursion(s1);
        System.out.println(s);
    }

    public static String reverseStringUsingRecursion(String str) {
        if (str.length() < 2) {
            return str;
        }
        return reverseStringUsingRecursion(str.substring(1)) + str.charAt(0);
    }
}
