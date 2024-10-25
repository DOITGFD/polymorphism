import java.util.Scanner;

public class argument {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        try{
            if(num<0){
                throw new IllegalArgumentException("Negative numbers are not allowed");
            
            }
            System.out.println("The number is: "+num);
        }catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}