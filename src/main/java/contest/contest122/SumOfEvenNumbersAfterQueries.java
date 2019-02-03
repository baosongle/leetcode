package contest.contest122;

public class SumOfEvenNumbersAfterQueries {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int[] q = queries[i];
            int val = q[0];
            int index = q[1];
            doQuery(A, val, index);
            answer[i] = sumOfEvenNumbers(A);
        }
        return answer;
    }

    private int sumOfEvenNumbers(int[] A) {
        int result = 0;
        for (int a : A) {
            if (a % 2 == 0)
                result += a;
        }
        return result;
    }

    private void doQuery(int[] A, int val, int index) {
        A[index] = A[index] + val;
    }
}
