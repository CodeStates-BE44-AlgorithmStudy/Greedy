import java.util.*;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt()
        }

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
            answer += count;
        }

        return answer;
    }
}
