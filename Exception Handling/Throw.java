import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if (age<18) {
                throw new RuntimeException("You are Not Eligible");
            }
            else{
                System.out.println("You are Eligible");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
