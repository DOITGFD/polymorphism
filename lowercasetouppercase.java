import java.util.*;
public class lowercasetouppercase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("");
        String password = scan.nextLine();
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialchar = false;
        for(char c:password.toCharArray()){
            if(Character.isUpperCase(c)){
                hasUppercase = true;
            }
            else if(Character.isLowerCase(c)){
                hasLowercase = true;
            }
            else if(Character.isDigit(c)){
                hasDigit = true;
            }
            else if("!@#$%^&*()-_+=?<>/".contains(Character.toString(c))){
                hasSpecialchar = true;
            }
        }
        if(password.length()>=8 && hasUppercase && hasLowercase && hasDigit && hasSpecialchar){
            System.out.print("Strong");
        }
        else if(password.length()>=6 && ((hasUppercase && hasLowercase) || (hasDigit && hasSpecialchar))){
            System.out.print("Moderate");
        }
        else{
            System.out.print("Weak");
        }
    }
}