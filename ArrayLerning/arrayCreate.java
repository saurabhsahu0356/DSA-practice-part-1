import java.util.*;
public class arrayCreate{
       
    public static void main(String[] args) {

        // Creating an Array

   /*
           int arr[] = new int [50];
            arr[2]=10;
            int number[]={1,2,3,};
            System.out.println(number[1]);
           System.out.println(arr[2]);

           */

    


        // input an output array


        int marks[]=new int[10];
         Scanner sc=new Scanner(System.in);

        marks[0]= sc.nextInt();// math
        marks[1]= sc.nextInt();//hindi
        marks[2]= sc.nextInt();//english
        marks[3]= sc.nextInt();//phy
        marks[4]= sc.nextInt();//che

        System.out.println("math:="+marks[0]+ "phy:="+marks[1] +"che:="+marks[2]+  "hindi:="+marks[3]+"english:="+marks[4]);



       }
}


