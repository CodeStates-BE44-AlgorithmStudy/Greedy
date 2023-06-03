import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 사람 수 입력받음 (5)

        // 각 사람들이 돈을 인출하는데 걸리는 시간 (3, 1, 4, 3, 2)
        int[] time = new int[n];
        for (int i = 0; i < n; i++) {
            time[i] = scanner.nextInt();
        }

        Arrays.sort(time); // 오름차순으로 정렬

        int total = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += time[i];
            total += sum;
        }

        System.out.println(total);
    }
}
