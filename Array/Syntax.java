package Array;

class Syntax{
    public static void main(String[] args){
        int[] rollno = {23, 24, 25, 26};

        // int is the data type of the values that are going to be stored in the array
        // rollno is a variable in the stack memory that will point to the objects in the heap memory

        // datatype[] variable_name = new datatype[size]

        // int[] rollno; -> memory is getting allocated for rollno in the stack memory => declaring
        // rollno = new int[5]; -> memory is getting allocated in the heap memory for the objects of variable rollno => initialization : defining an array  (actual memory creation)
    }
}