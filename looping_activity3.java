import java.util.Scanner;
public class looping_activity3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int noynoy = 0;
        int manny = 0;
        int gibo = 0;
        System.out.println("PRESEDENTIAL ELECTIONS");
        System.out.println("CANDIDATES:");
        System.out.println("A. NOYNOY");
        System.out.println("B. MANNY");
        System.out.println("C. GIBO");

        while (true) {
            System.out.println("[Type 'V'-vote, 'R'-result and 'Q'-quit]");
            System.out.print("Enter your choice: ");
            char choice = input.next().toUpperCase().charAt(0);

            if (choice == 'V') {
                System.out.println("Enter your Vote: ");
                char vote = input.next().toUpperCase().charAt(0);
                
                switch (vote) {
                    case 'A': noynoy++;
                    break;
                    case 'B': manny++;
                    break;
                    case 'C': gibo++;
                    default: System.out.println("Invalid input please try again...");
                        break;
                }
            } else if (choice == 'R'){
                int totalVotes = noynoy + manny + gibo;
                System.out.println("PRESEDENTIAL ELECTIONS");
                System.out.println("Candidates:     Result     % of Total Votes");
                System.out.printf("  NOYNOY         %d             %.2f\n   ", noynoy, ((double) noynoy / totalVotes) * 100);
                System.out.printf("MANNY         %d             %.2f\n   ", manny, ((double) manny / totalVotes) * 100);
                System.out.printf(" GIBO         %d             %.2f\n   ", gibo, ((double) gibo / totalVotes) * 100);
                System.out.println("TOTAL VOTES: "+ totalVotes);

                if (noynoy > manny && noynoy > gibo) {
                    System.out.println("And the winner is: NOYNOY");
                }
                else if (manny > noynoy && manny > gibo){
                    System.out.println("And the winner is: NOYNOY");
                }
                else if (gibo > noynoy && gibo > manny){
                    System.out.println("And the winner is: MANNY");
                }   else{
                    System.out.println("It's a Tie!!");
                }
            } else if (choice == 'Q') {
                System.out.println("Exiting program... .. ...");
                break;
            }else{
                System.out.println("Your input is invalid please try again");
            }
        }
        input.close();
    }
}
