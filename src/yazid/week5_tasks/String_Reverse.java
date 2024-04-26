package yazid.week5_tasks;

public class String_Reverse {
    public static String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        char[] charArray = str.toCharArray();
        int length = charArray.length;
        char[] reversedArray = new char[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = charArray[length - i - 1];
        }

        return new String(reversedArray);
    }

    public static void main(String[] args) {
        String original = "ABCD";
        String reversed = reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
    /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */




