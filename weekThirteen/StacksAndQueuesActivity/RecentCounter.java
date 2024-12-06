package weekThirteen.StacksAndQueuesActivity;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    private Queue<Integer> requestTimes;

    public RecentCounter() {
        requestTimes = new LinkedList<>();
    }

    public int ping(int t) {
        requestTimes.add(t);

        while (requestTimes.peek() < t - 3000) {
            requestTimes.poll();
        }

        return requestTimes.size();
    }
}
