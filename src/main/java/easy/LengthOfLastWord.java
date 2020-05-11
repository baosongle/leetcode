package easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int index = s.lastIndexOf(" ");
        if (index == -1) {
            return s.length();
        }
        return s.substring(index + 1).length();
    }
}
