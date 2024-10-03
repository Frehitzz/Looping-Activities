import java.util.Scanner;
public class looping_activity2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String pincode = "1234";
        String pukcode = "4321";
        pinEntry: // this where you gonna comback after the puk is accepted
        while (true) {
           int attempts = 0;
        
       while (attempts < 3){
        System.out.print("Enter your PIN Code: ");
         String numpin = input.next();
       
        
        if (numpin.equals(pincode)) {
            System.out.println("Welcome to Smart...Simply Amazing");
            return;
        }
        else{
            attempts++;
            System.out.println("Invalid PIN Number. Try again.");
        }
    }
        System.out.println("Invalid Pin Code");
        System.out.println("Please enter the PUK code");
       
    
        int attemptspuk = 0;
        while (attemptspuk < 3) {
            
        
        System.out.println("Enter your PUK code: ");
        String puknum = input.next();
        if (puknum.equals(pukcode)) {
            System.out.println("PUK code is Accepted. You can now enter your PIN code"); 
            continue pinEntry; //after the puk code it will go to the pin entry
        }
        else{
            attemptspuk++;
            System.out.println("Invalid PUK code, Please Try Again");
        }
        System.out.println("SIM BLOCKED");
        break; // exit on loop and end the progream
        }
    }
    }

}

