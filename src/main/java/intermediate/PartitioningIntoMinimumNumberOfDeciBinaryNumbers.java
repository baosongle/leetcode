package intermediate;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public int minPartitions(String n) {
        int i = 0;
        while (!n.equals("0") && !n.equals("")) {
            i++;
            n = subtract(n);
        }
        return i;
    }

    private String subtract(String n) {
        StringBuilder sb = new StringBuilder();
        char[] array = n.toCharArray();
        for (char c : array) {
            if (c == '0' || c == '1') {
                if (sb.length() > 0) {
                    sb.append('0');
                }
            } else if (c > '1') {
                sb.append(c - '1');
            }
        }
        return sb.toString();
    }
}
