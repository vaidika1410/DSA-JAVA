public class Loops {
    public static void main(String[] args) {
        //for loop
        // for(int i=0; i<10; i++){
        //     System.out.println(i+1);
        // }

        //while loop
        int i=0;
        while(i<10){
            System.out.println(i+1);
            i++;  //if the condition of any operation is not specified then the loop will keep on printing the same value and will eventually become an infinite loop 
            //as the value of i+1 = 0+1 = 1 < 10, => true  
        }
    }
}
