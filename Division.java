public class Division {
    public static void main(String[] args) {
        int a =10;
        int b= 5;
        try{
            int div = a/ b;
            System.out.println("Division:"+div);
        }
        catch(ArithmeticException e){
            System.out.println("error:cannot divisible by zero");
        }
    }
}