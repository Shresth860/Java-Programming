// in this file we are using arraylist

import java.util.Scanner;
import java.util.ArrayList;
public class MultiDim{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // declaring the arraylist
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // now initialize the array list using for loop 
        for(int i=0;i<4;i++){
           list.add(new ArrayList<>());
        }


        // Adding element in arraylist
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        // printing the array list
        System.out.println(list);
        
    }
}