import java.util.Scanner;

public class WhiteBelt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //this software has as an aim to facilitate the learning of bjj
        System.out.print("Type the belt that you would like to check ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("white")) {
            printWhiteBeltTechniques();
        } else {
            System.out.println("Invalid input");
        }
    }

            public static void printWhiteBeltTechniques() {
                System.out.println("White Belt Brazilian Jiu-Jitsu Techniques:");

                // Positioning
                System.out.println("   - Positioning:");
                System.out.println("      - Guard: Closed Guard, Open Guard (e.g., Butterfly Guard, De La Riva Guard)");
                System.out.println("      - Mount: Full Mount, Back Mount (Hooks In)");
                System.out.println("      - Side Control: Top and Bottom");
                System.out.println("      - Knee-on-Belly (KOB)");
                System.out.println("      - Turtle Position");

                // Submissions
                System.out.println("   - Submissions:");
                System.out.println("      - Armbar from Guard");
                System.out.println("      - Triangle Choke from Guard");
                System.out.println("      - Cross Collar Choke from Mount");
                System.out.println("      - Rear Naked Choke (RNC) from Back Mount");
                System.out.println("      - Americana Lock");
                System.out.println("      - Kimura Lock");
                System.out.println("      - Straight Armbar from Mount");
                System.out.println("      - Guillotine Choke");

                // Escapes and Defenses
                System.out.println("   - Escapes and Defenses:");
                System.out.println("      - Shrimping (Hip Escape)");
                System.out.println("      - Bridge and Roll Escape from Mount");
                System.out.println("      - Technical Stand-Up from Bottom");
                System.out.println("      - Posture Control in Guard");
                System.out.println("      - Defending the Rear Naked Choke (RNC)");
                System.out.println("      - Defending the Armbar");


            }
        }


