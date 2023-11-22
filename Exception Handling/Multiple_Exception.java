public class Multiple_Exception {
    public static void main(String[] args) {
        // Multiple Catch for single try block exceptions
        // int a [] = new int[5];
        // try {
        //     a[6] = 10/0;
        // } catch (ArithmeticException e) {
        //     System.out.println(e.getMessage());            
        // }
        // catch(IndexOutOfBoundsException e){
        //     System.out.println(e.getMessage());
        // }
        //Collaped One 
        int[] a = new int[5];
        try {
            a[6] = 10/2;
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
