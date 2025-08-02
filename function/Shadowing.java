public class Shadowing{
    static int x=10; // this will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x); // ans =10

        int x =40;// the class variable at line 2 will be shadowed by this
        System.out.println(x);// ans =40;
        fun();
    }
    static void fun(){
        System.out.println(x);// ans =10;
    }
}
// MAIN EXPLANATION
// "Shadowing in simple terms means the variable which is initialized in class(line 2) will be use by all function in that class but only if we 
// have not redeclared again that variable in any class like (line 6) in line 6 as we see we have redeclared the variable so thatwhy variable value is change in that class only.."