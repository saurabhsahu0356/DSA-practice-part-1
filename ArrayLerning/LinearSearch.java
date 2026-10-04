public class LinearSearch{
    public static int Linear(int num[],int key){
         for(int i=0; i<num.length;i++){
            if(num[i] == key){
               return i;
            }
         }
         return -1;
    }
    public static void main(String[] args) {
        int num [] = {10,2,9,4,8,6,5,34,};
       int key = 5;  
       int index = Linear(num,key);
       if(index != -1){
           System.out.println("Key exists at index: " + index);
       }
       else{
        System.out.println("Key does not exist");
       }
    }
}