package easy;

public class ReverseWordsInAStringIII {

    private static String reverseWords(String s) {
        String[] strings = s.split(" ");

        for (int i = 0; i < strings.length; i++) {
            char[] char_array = strings[i].toCharArray();
            int j = 0, k = char_array.length - 1;
            while (j < k) {
                char ch = char_array[j];
                char_array[j++] = char_array[k];
                char_array[k--] = ch;
            }
            strings[i] = new String(char_array);
        }

        return String.join(" ", strings);
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
