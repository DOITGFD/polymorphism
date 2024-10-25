import java.util.Scanner;

interface Payment{
    void processpayment(double amt);
}

class Creditcard implements Payment{
    public void processpayment(double amt){
        System.out.println("Payment of $"+amt+" processed via Credit Card.");
    }
}

class Paypal implements Payment{
    
    public void processpayment(double amt){    
        System.out.println("Payment of $"+amt+" processed via PayPal.");
    }
}
public class paymentmethon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amt = input.nextDouble();
        int choice = input.nextInt();
        
        Payment payment = null;

        switch(choice){
            case 1:
                payment = new Creditcard();
                payment.processpayment(amt);
                break;

            case 2:
                payment = new Paypal();
                payment.processpayment(amt);
                break;
        }
        
    }
}