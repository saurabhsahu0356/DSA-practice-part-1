
import java.util.*;

public class positiveORnegative{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:=");
    int Num = sc.nextInt();
    if(Num >0){
        System.out.println("this is a positive number:=" + Num);
    }
    
    else{
        System.out.println("this is a negative number:=" + Num);
    }

}
}