import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] meetings = new int[n][2];

        for (int i = 0; i < n; i++) {
            meetings[i][0] = sc.nextInt(); // 회의 시작 시간
            meetings[i][1] = sc.nextInt(); // 회의 끝나는 시간
        }

        /**
         * 6
         * 3, 6
         * 1, 5
         * 3, 4
         * 2, 4
         * 4, 6
         * 6, 8
         */
        // 종료 시간을 기준으로 오름차순으로 정렬
        Arrays.sort(meetings, (o1, o2) ->
                o1[1] == o2[1]
                        ? Integer.compare(o1[0], o2[0])
                        : Integer.compare(o1[1], o2[1]));

        /**
         * 2, 4
         * 3, 4
         * 1, 5
         * 3, 6
         * 4, 6
         * 6, 8
         */
        int count = 0;
        int endTime = 0;

        for (int i = 0; i < n; i++) {
            if (meetings[i][0] >= endTime) { // 현재 회의의 시작 시간이 이전 회의의 종료 시간보다 크거나 같으면
                count++; // 회의 개수 증가
                endTime = meetings[i][1]; // 종료 시간 기준
            }
        }

        System.out.println(count);
    }
}
