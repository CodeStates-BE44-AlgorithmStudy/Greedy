import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int [] result = new int[n];
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<=i;j++){
                sum+=arr[j];
            }
            result[i]=sum;
        }
        System.out.println(Arrays.stream(result).sum());
    }
}
