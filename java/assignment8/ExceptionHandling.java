package assignment.assignment8;

public class ExceptionHandling {

    static void divideTwoNumber(int val1,int val2) throws ArithmeticException{

        if(val2 == 0)
        throw new ArithmeticException("can not divide by zero");

    }
    static void convertStringToInt(String str) {

        //number format Exception
        try{
            int val = Integer.parseInt(str);
        }
        finally {
            System.out.println("convert string to Int method");
        }
    }
    static void fillValueAtIndex(int arr[],int index,int val){

        // may be happen array out of bound exception
        try {
            arr[index] = val;
        }
        finally {
            System.out.println("fill Value At Index method");
        }
    }
    public static void main(String[] args) {

        int len = 5;
        int arr[] = new int[len];
        try{
            divideTwoNumber(5,2);
            convertStringToInt("5");
            fillValueAtIndex(arr,6,5);
        }
        catch (Exception msg){
            System.out.println(msg);
        }

        finally {

            System.out.println("End of Code");
        }
    }
}
