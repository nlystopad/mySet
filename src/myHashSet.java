public class myHashSet implements mySet<String> {

    public static class Entry {
        String string;
        int hashCode;

        public Entry(String string, int hashCode) {
            this.string = string;
            this.hashCode = hashCode;
        }
    }

    private int size = 0;
    private int capacity = 1;
    private Entry[] arr = new Entry[capacity];

    @Override
    public boolean add(String e) throws Exception {
        if (contains(e)) {
            return false;
        }
        checkNull(e);
        if (size == capacity - 1) {
            int newCapacity = capacity + 1;
            Entry[] arrToRewrite = new Entry[newCapacity];
            if (size + 1 >= 0) System.arraycopy(arr, 0, arrToRewrite, 0, size + 1);
            capacity = newCapacity;
            arr = arrToRewrite;
        }
        arr[size] = new Entry(e, e.hashCode());
        size++;

        return true;
    }

    @Override
    public void clear() throws Exception {
        for (int i = size; i > 0; i--) {
            remove(arr[i - 1].string);
        }
    }

    @Override
    public boolean contains(String o) throws Exception {
        checkNull(o);
        if (size > 0) {
            for (Entry e : arr) {
                if (e != null) {
                    if (e.string.equals(o)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean remove(String o) throws Exception {
        checkNull(o);
        if (contains(o)) {
            for (Entry e : arr) {
                if (e != null && e.string != null) {
                    if (e.string.equals(o)) {
                        e.string = null;
                        e.hashCode = 0;
                        size--;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String[] toArray() {
        String[] returnArr = new String[size];
        for (int i = 0; i < size; i++) {
            returnArr[i] = arr[i].string;
        }
        return returnArr;
    }

    // technical method
    private void checkNull(String e) throws Exception {
        if (e == null) {
            throw new Exception("expected to get String type value");
        }
    }
}
