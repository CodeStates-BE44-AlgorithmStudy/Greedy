import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("회의의 수를 입력해 주세요: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
            System.out.println("시작 시간과 종료 시간을 입력해 주세요(index: " + (i+1) + ")");
            // 회의 시작 시간
            arr[i][0] = sc.nextInt();
            // 회의 종료 시간
            arr[i][1] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr, (o1, o2) -> {
            if(o1[1] == o2[1]) {
                return Integer.compare(o1[0], o2[0]);
            } else {
                return Integer.compare(o1[1], o2[1]);
            }
        });
        int meetingCount = 0;
        int endTime = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i][0] > endTime) {
                endTime = arr[i][1];
                meetingCount++;
            }
        }
        System.out.println(meetingCount);
    }
}
