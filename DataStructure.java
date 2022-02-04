public class DataStructure {
    int n = 100, start = 0, end = 0;
    int[] buf = new int[n];

    public void put(int item) {
        buf[end] = item;
        end = end + 1;
        end = end % n;
    }

    public int get() {
        int item = buf[start];
        start = start + 1;
        start = start % n;

        return item;
    }
}
