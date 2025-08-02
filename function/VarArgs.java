// VarArgs means Variable length argument .(...) declare by three dot
import java.util.Arrays;
public class VarArgs{
    public static void main(String[] args) {
        fun("vansh","shresth","rahul","kishore","vikas","ketan","vibhor","suyash");
    }
    static void fun(String...val){
       System.out.println(Arrays.toString(val));
    }
}