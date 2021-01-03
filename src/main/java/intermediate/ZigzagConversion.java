package intermediate;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    public String convert(String s, int n) {
        List<StringBuilder> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(new StringBuilder());
        }
        int i = 0;
        boolean add = true;
        for (int j = 0; j < s.length(); j++) {
            list.get(i).append(s.charAt(j));
            if (n != 1) {
                if (add) {
                    i++;
                } else {
                    i--;
                }
                if (i == 0 || i == n - 1) {
                    add = !add;
                }
            }
        }
        StringBuilder r = new StringBuilder();
        for (StringBuilder sb : list) {
            r.append(sb.toString());
        }
        return r.toString();
    }
}
