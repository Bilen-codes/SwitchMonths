/*1, prompet user to enter a number for the month
* 2, Read the number and save it into a variable
* 3, enter the number into a switch statment and so the approptiate out put is decided.
* 4, Display the option to exit.
* 4, exit the switch statment and print good bye!
* */
import java.util.Scanner;
public class SwitchMonths {
    public static void main(String [] ags){
        Scanner sc = new Scanner(System.in);
        int days ;

        do{
            System.out.println("Please enter a number: ");
            System.out.println("Enter -1 to exit");
            days = sc.nextInt();
            if(days == -1){
                System.out.println("Good bye");
                System.exit(1);
            }
        switch (days) {
            case 28:
                System.out.println("February");
                break;
            case 31:
                System.out.println("January, March, May, July, Agusut, October, Decemeber");
                break;
            case 30:
                System.out.println("April, June, Sepetember, Novermeber");
                break;
            default:
                System.out.println("Unknown month");
               break;

        }}while (days != -1);


    }
}
