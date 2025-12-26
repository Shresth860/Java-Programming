import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HotelBookingProblem {
    public static void main(String[] args) {
        ArrayList<Integer> arrive = new ArrayList<>(Arrays.asList(1,3,5));  // time of arrival
        ArrayList<Integer> depart = new ArrayList<>(Arrays.asList(2,6,8));   // time of depart
        int k =2; // no. of rooms
        System.out.println(hotelBooking(arrive,depart,k));
    }
    static Boolean hotelBooking(ArrayList<Integer> arrive , ArrayList<Integer> depart , int k ){
        // Technique => 2-POINTER PATTERN

        Collections.sort(arrive);
        Collections.sort(depart);
        int MaintainRoom =0;
        int i=0,j=0;
        while(i< arrive.size() && j< depart.size()){
            if(arrive.get(i)<=depart.get(j)){
                MaintainRoom++;
                if(MaintainRoom>k){
                    return false;
                }
                i++;
            }else{
                MaintainRoom--;
                j++;
            }
        }
        return true;
    }
}
