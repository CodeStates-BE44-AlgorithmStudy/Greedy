import java.util.*;

class Meeting implements Comparable<Meeting> {
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    /*
    * 각 회의를 종료 시간 기준으로 정렬
    * 종료시간이 같으면 시작 시간이 더 빠른 회의의 순서를 앞에 둠
    */
 
    @Override
    public int compareTo(Meeting o) {
        if(this.end == o.end){
            return this.start - o.start;
        }
        return this.end - o.end;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<Meeting> meetingList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            meetingList.add(new Meeting(start, end));
        }

        Collections.sort(meetingList);

        int answer = 1;
        int end = meetingList.remove(0).end;

        for(Meeting meeting : meetingList){
            if(meeting.start>=end){
                answer++;
                end = meeting.end;
            }
        }

        System.out.println(answer);
    }
}
