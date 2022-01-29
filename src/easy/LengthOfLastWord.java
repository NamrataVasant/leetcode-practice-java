package easy;

public class LengthOfLastWord {

    private static int lengthOfLastWord(String s) {
        int lengthOfLastWord = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ' ' && lengthOfLastWord != 0)
                break;
            if (ch != ' ')
                lengthOfLastWord++;
        }

        return lengthOfLastWord;
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
