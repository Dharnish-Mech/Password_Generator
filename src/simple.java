import java.util.*;
public class simple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many passwords you need");
        int no_of_passwords = sc.nextInt();
        while(no_of_passwords-->0)
        {
            System.out.println("Please enter the length of the password to be generated = ");
            int length = sc.nextInt();
            for(int i=0;i<length;i++)
            {
                int pass_word = (int) (Math.random() * 93 + 33);
                char password = (char) pass_word;
                System.out.print(password);
            }
            System.out.println();
        }
    }
}
