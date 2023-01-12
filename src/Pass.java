import java.util.*;
public class Pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of password = ");
        int length_of_password = sc.nextInt();
        String lower_cases = "abcdefghijklmnopqrstuvwxyz";
        String upper_cases = lower_cases.toUpperCase();
        String special_characters = "!@#$%^&*(){}|:<>?,.;'`~\\";
        String password = "";
        for(int i=0;i<length_of_password;i++)
        {
            int rand = (int) ( 3 * Math.random());
            switch (rand)
            {
                case 0 :
                    password += String.valueOf((int)(9 * Math.random()));
                    break;
                case 1 :
                    rand = (int) (lower_cases.length() * Math.random());
                    password += String.valueOf(lower_cases.charAt(rand));
                    break;
                case 2 :
                    rand = (int) (upper_cases.length() * Math.random());
                    password += String.valueOf(upper_cases.charAt(rand));
                    break;
                case 3 :
                    rand = (int) (special_characters.length() * Math.random());
                    password += String.valueOf(special_characters.charAt(rand));
                    break;
            }
            System.out.println(password);
        }
        System.out.println("The generated password for you is = " + password);
    }
}