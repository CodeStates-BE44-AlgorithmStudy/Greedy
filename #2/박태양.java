import java.util.*;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        int count;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][2];
        for (int i = 0; i < num; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        SortedMap<Integer,Integer> map = new TreeMap<>();
        for (int[] ints : arr) {
            if (map.containsKey(ints[0])) {
                map.put(ints[0], Math.min(ints[1], map.get(ints[0])));
            } else map.put(ints[0], ints[1]);
        }

        answer = max(map,0);
        System.out.println(answer);
    }
    public static int max(SortedMap<Integer,Integer> tail,int count) {
        count++;

        SortedSet<Integer> ss = new TreeSet<>();
        Iterator<Integer> iter = tail.keySet().iterator();
        while (iter.hasNext()) {
            ss.add(tail.get(iter));
        }
        if(tail.lastKey() <= ss.first()) {
            return count;
        }

        tail = tail.tailMap(ss.first());
        return max(tail, count);
    }
}
