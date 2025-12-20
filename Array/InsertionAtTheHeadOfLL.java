import java.util.LinkedList;

public class InsertionAtTheHeadOfLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        int x =7;
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(x);
        System.out.println(ll);
    }

}
