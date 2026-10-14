import java.util.Scanner;

public class StudiKasus206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Student name : ");
        String name = sc.nextLine();
        System.out.print("Activity type (BELMAWA/BAKORMA/MANDIRI/PKM/OTHER) : ");
        String type = sc.nextLine().trim();

        if (type.equalsIgnoreCase("BELMAWA") ||
                type.equalsIgnoreCase("BAKORMA") ||
                type.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Number of documents : ");
            int NumDocs = sc.nextInt();
            System.out.print("Achievement rank : ");
            int Rank = sc.nextInt();

            if (Rank >= 1 && Rank <= 3) {
                if (NumDocs == 4) {
                    System.out.println("Funding is granted.");
                } else {
                    int shortage = 4 - NumDocs;
                    System.out.println("Funding is not granted. (less " + shortage
                            + " documents).");
                }
            } else {
                System.out.println("Not ranked 1, 2, or 3. Funding is not granted.");
            }

        } else if (type.equalsIgnoreCase("PKM")) {
            System.out.print("Number of documents : ");
            int NumDocs = sc.nextInt();
            System.out.print("PKM funding status (1 = funded, 0 = not funded) : ");
            int statusFunding = sc.nextInt();

            if (statusFunding == 1) {
                if (NumDocs == 4) {
                    System.out.println("Funding is granted.");
                } else {
                    int shortage = 4 - NumDocs;
                    System.out.println("Funding is not granted. (less " + shortage
                            + " documents).");
                }
            } else {
                System.out.println("Proposal is not funded. Funding is not granted.");
            }

        } else if (type.equalsIgnoreCase("LAINNYA")) {
            System.out.println("Funding is not granted.");
        } else {
            System.out.println("Funding not granted.");
        }
    }
}
