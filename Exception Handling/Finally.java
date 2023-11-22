public class Finally {
    public static void main(String[] args) {
        try {
            int a = 10/02;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("This was to demondtrate finally block");
        }
    }
}
