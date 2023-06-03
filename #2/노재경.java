import java.util.*;

class Meeting implements Comparable<Meeting> {
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

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
