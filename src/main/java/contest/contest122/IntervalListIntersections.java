package contest.contest122;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {
    public Interval[] intervalIntersection(Interval[] A, Interval[] B) {
        List<Interval> answer = new ArrayList<>();

        for (Interval a : A) {
            for (Interval b : B) {
                Interval c = intersection(a, b);
                if (c != null)
                    answer.add(c);
            }
        }
        Interval[] answer0 = new Interval[answer.size()];
        answer.toArray(answer0);
        return answer0;
    }

    private Interval intersection(Interval a, Interval b) {
        Interval c = new Interval();
        if (b.start <= a.start) {
            c.start = a.start;
            if (b.end < a.start) {
                return null;
            } else if (b.end == a.start) {
                c.end = b.end;
                return c;
            } else if (b.end <= a.end) {
                c.end = b.end;
                return c;
            } else {
                c.end = a.end;
                return c;
            }
        } else if (b.start <= a.end) {
            c.start = b.start;
            if (b.end <= a.end) {
                c.end = b.end;
                return c;
            } else {
                c.end = a.end;
                return c;
            }
        } else {
            return null;
        }
    }

    static class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }
}
