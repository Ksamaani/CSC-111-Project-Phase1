//This Project Is Done By:
// Khalid ALSamaani     446100885

import java.util.Scanner;
public class LibrarySimulator {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        //user Variables
        String uesr1name = "Ahmad";
        int user1Id = 101;
        int user1BorrowedBook = 0;
        String uesr2name = "Mohamad";
        int user2Id = 202;
        int user2BorrowedBook = 0;
        String uesr3name = "Nasser";
        int user3Id = 303;
        int user3BorrowedBook = 0;
        //Session Variables
        int SessionBorrowedBooks = 0;
        int SessionReturnedBooks = 0;
        //golbal Variables
        double totalRevenue = 0.0;
        int totalBorrowedOperations = 0;
        int totalReturnedOperations = 0;
        //Choice Variables
        int mainMenuChoiceNum = 0;
        int subMenuChoiceNum = 0;

        //main menu
        do{
            System.out.println("---- Welcome To The library ----");
            System.out.printf("\t 1. %s  %d %n",uesr1name,user1Id);
            System.out.printf("\t 2. %s  %d %n",uesr2name,user2Id);
            System.out.printf("\t 3. %s  %d %n",uesr3name,user3Id);
            System.out.printf("\t 4. Administrator %n");
            System.out.printf("\t 5. Exit %n %n");
            System.out.print("Enter Your Choice :");
            mainMenuChoiceNum = input.nextInt();

            switch(mainMenuChoiceNum){
                case 1 -> {
                    do {
                        //Add user menu
                        System.out.println("welcome user1");
                        subMenuChoiceNum = input.nextInt();
                    } while (subMenuChoiceNum != 5);
                }
                case 2 ->{
                    do {
                        //Add user menu
                        System.out.println("welcome user2");
                        subMenuChoiceNum = input.nextInt();
                    } while (subMenuChoiceNum != 5);
                }
                case 3 -> {
                    do {
                        //Add user menu
                        System.out.println("welcome user3");
                        subMenuChoiceNum = input.nextInt();
                    } while (subMenuChoiceNum != 5);
                }
                case 4 -> {do {
                    //Add Admin menu
                    System.out.println("welcome Admin");
                    subMenuChoiceNum = input.nextInt();
                    }while (subMenuChoiceNum != 4);
                }

            }
        }while (mainMenuChoiceNum != 5);
        System.out.println("Thank You For Using The Library Simulator. ");


    }
}
