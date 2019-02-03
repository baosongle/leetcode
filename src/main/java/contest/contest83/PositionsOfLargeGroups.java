package contest.contest83;

import java.util.ArrayList;
import java.util.List;

public class PositionsOfLargeGroups {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result = new ArrayList<>();

        int position = 0;
        char[] array = S.toCharArray();
        char c = array[0];
        for (int i = 1; i < array.length; i++) {
            char current = array[i];
            if (current == c) {
                if (i != array.length - 1)
                    continue;
                i++;
            }
            if (i - position >= 3) {
                List<Integer> pl = new ArrayList<>();
                pl.add(position);
                pl.add(i - 1);
                result.add(pl);
            }
            position = i;
            if (i <= array.length - 1)
                c = array[i];
        }
        return result;
    }
}
