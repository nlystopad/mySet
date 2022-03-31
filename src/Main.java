import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        mySet<String> set = new myHashSet();
        set.add("asd");
        System.out.println(Arrays.toString(set.toArray()));
        System.out.println(set.contains("asd"));
        System.out.println(set.size());
        set.remove("asd");
        System.out.println(set.size());
        set.add("asdf");
        set.add("asdf");
        set.add("asd1");
        set.add("asdq");
        set.add("asdw");
        System.out.println(Arrays.toString(set.toArray()));
        System.out.println(set.size());
        set.clear();
        System.out.println(Arrays.toString(set.toArray()));



    }
}
