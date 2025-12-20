import java.util.LinkedList;
//import java.util.List;

public class RemoveDuplicateFromSortedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addLast(1);
        list.addLast(2);
        System.out.println(dupliFromSortList(list));
    }
    static LinkedList<Integer> dupliFromSortList(LinkedList<Integer> head){
     if(head==null || head.size()<=1){
         return head;
     }

     int i=0;
     while(i<head.size()-1){
         if(head.get(i).equals(head.get(i+1))){
             head.remove(i+1);
         }else{
             i++;
         }
     }
return head;
    }
}