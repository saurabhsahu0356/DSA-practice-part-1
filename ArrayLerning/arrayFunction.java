
public class arrayFunction{

    public static void update(int marks[]){

       for(int i=0;i<marks.length;i++){
           marks[i] = marks[i]+5;
       }
    }
    public static void main(String[] args) {

        int marks[]={93,45,76};
        update(marks);

        for(int i=0;i<marks.length;i++){
          System.out.println(marks[i]+ "");
       }
       System.out.println();
    }
}