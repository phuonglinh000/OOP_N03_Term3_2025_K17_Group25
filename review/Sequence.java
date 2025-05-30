package review;

public class Sequence {
    private Object[] objects;
    private int next = 0;

    public Sequence(int size) {
        objects = new Object[size];
    }

    public void add(Object x) {
        if (next < objects.length) {
            objects[next] = x;
            next++;
        }
    }

    // Inner class SSelector
    private class SSelector implements Selector {
        int i = 0;

        public boolean end() {
            return i == next; // Chú ý: chỉ chạy tới phần tử được add, không phải full mảng
        }

        public Object current() {
            return objects[i];
        }

        public void next() {
            if (i < next) i++;
        }
    }

    // Method to get Selector
    public Selector getSelector() {
        return new SSelector();
    }
}
