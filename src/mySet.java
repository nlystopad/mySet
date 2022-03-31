public interface mySet<E> {

    boolean add(String e) throws Exception; // Returns true if this set did not already contain the specified element

    void clear() throws Exception;

    boolean contains(String o) throws Exception;

    boolean isEmpty();

    boolean remove(String o) throws Exception; // Returns true if this set contained the specified element

    int size();

    String[] toArray();


}
