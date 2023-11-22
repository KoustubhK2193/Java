public class Throws {
    static int divide() throws ArithmeticException{
        int result = 10/0;
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        try {
            divide();
        } catch (Exception e) {
            System.out.println("Divide by Zero!!!");
        }
    }
}
