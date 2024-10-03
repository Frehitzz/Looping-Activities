import java.util.Scanner;
public class looping_activity1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int numint = input.nextInt();

        String convertedNUmString = String.valueOf(numint);
        int sum = 0;
        System.out.print("Individual digits: ");
        int i = 0;
        while (i < convertedNUmString.length()) {
            char digits = convertedNUmString.charAt(i);
            System.out.print(digits + " ");
            sum += digits - '0';
            i++;
        }
        System.out.println();
        System.out.println("Sum of individual digits: "+ sum);
    }
}
