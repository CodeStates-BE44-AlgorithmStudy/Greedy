import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int people = 0;
        int[] arr = {};
        Scanner sc = new Scanner(System.in);
        System.out.print("대기 중인 사람 수를 입력해 주세요: ");
        people = sc.nextInt();
        System.out.println();

        arr = IntStream.range(0, people)
                .map(i -> {
                    System.out.println("각 사람당 대기 하는 시간을 작성해 주세요(index: " + i + ") :");
                    return sc.nextInt();
                })
                .sorted()
                .toArray();

        sc.close();

        System.out.println("배열 길이 : " + arr.length);

        int sum = arr[0];
        int accumulate = sum;

        for(int i = 1; i < arr.length; i++) {
            sum += arr[i] + accumulate;
            accumulate += arr[i];
        }
        System.out.println("총 소요 시간: " + sum);
    }
}