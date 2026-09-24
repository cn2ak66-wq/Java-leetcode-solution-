class RecentCounter {
    private int[] queue = new int[10001];
    private int front = 0;
    private int rear = 0;

    public RecentCounter() {
    }

    public int ping(int t) {
        queue[rear] = t;
        rear++;

        while (queue[front] < t - 3000) {
            front++;
        }

        return rear - front;
    }
}
/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */