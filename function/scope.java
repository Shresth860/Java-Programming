public class scope{
    public static void main(String[] args) {
        // Value initialized in the function once afterward u can use that value aur change that value but can't reinitialized that value.
      int a =10;
      int b=20;
      int c=0;

        // BLOCK SCOPE:- Value initialized in this block will use aur access only in this block..
        {
             c=45;
        }
        System.out.println(c);

        // FOR SCOPE :- Value initialized in this loop will use aur access only in this loop only.
        for(int d=10;d<20;d++)
        {
            System.out.println(d);
        }
        // System.out.println(d); we can't access here the value of d due to loop scope
    }
}
// MAIN EXPLANATION
// "Anything initialized outside will be use inside aswell but anything initialized inside can't use outside but reinitialized  outside the block."