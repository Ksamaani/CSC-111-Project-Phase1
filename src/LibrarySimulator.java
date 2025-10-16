//This Project Is Done By:
// Khalid ALSamaani     446100885

import java.util.Scanner;
public class LibrarySimulator {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        //user Variables
        String uesrName1 = "Ahmad";
        int user1Id = 101;
        int user1BorrowedBook = 0;
        String uesrName2 = "Mohamad";
        int user2Id = 202;
        int user2BorrowedBook = 0;
        String uesrName3 = "Nasser";
        int user3Id = 303;
        int user3BorrowedBook = 0;
        //Session Variables
        int SessionBorrowedBooks = 0;
        int SessionReturnedBooks = 0;
        double SessionFees = 0.0;
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
            System.out.printf("\t 1. %s  %d %n",uesrName1,user1Id);
            System.out.printf("\t 2. %s  %d %n",uesrName2,user2Id);
            System.out.printf("\t 3. %s  %d %n",uesrName3,user3Id);
            System.out.printf("\t 4. Administrator %n");
            System.out.printf("\t 5. Exit %n %n");
            System.out.print("Enter Your Choice : ");
            mainMenuChoiceNum = input.nextInt();

            switch(mainMenuChoiceNum){
                case 1 -> {
                    // Reset The Session
                    SessionBorrowedBooks = 0;
                    SessionReturnedBooks = 0;
                    SessionFees = 0.0;
                    do {
                        //Add user1 menu

                        System.out.printf("%n-----------------------------%n \t \t Welcome %s %n-----------------------------%n",uesrName1);
                        System.out.println("1.Borrow a Book");
                        System.out.println("2.View Borrowed Books");
                        System.out.println("3.Return Book");
                        System.out.println("4.View Session Summary");
                        System.out.printf("5.Exit to Main Menu: %n%n");
                        System.out.print("Enter Your Choice : ");
                        subMenuChoiceNum = input.nextInt();
                        switch(subMenuChoiceNum){
                            case 1 -> {
                                if (user1BorrowedBook < 5) {
                                    user1BorrowedBook ++;
                                    SessionBorrowedBooks ++;
                                    SessionFees += 0.5;
                                    totalRevenue += 0.5;
                                    totalBorrowedOperations ++;
                                    System.out.printf("You have borrowed Book!");
                                }
                                else {
                                    System.out.printf("You have 5 books borrowed %nYou Can not borrow more Books!");
                                }
                            }
                            case 2 ->{
                                System.out.printf("%nYou borrowed %d books%n",user1BorrowedBook);
                            }
                            case 3 ->{
                                if (user1BorrowedBook >= 1) {
                                    user1BorrowedBook--;
                                    SessionReturnedBooks++;
                                    totalReturnedOperations ++;
                                    System.out.printf("%nYou have Returned Book!");
                                }
                                else {
                                    System.out.printf("%n You have No Books to Return");
                                }
                            }
                            case 4 ->{
                                System.out.printf("%nThe Session Summary Is :%n");
                                System.out.printf("Number of books borrowed %d%n",SessionBorrowedBooks);
                                System.out.printf("Number of books returned %d%n",SessionReturnedBooks);
                                System.out.printf("Total fees incurred during the session: %.2f $",SessionFees);
                            }
                            default -> System.out.println("Invalid Choice Please Try Again !");
                        }
                    } while (subMenuChoiceNum != 5);
                }
                case 2 ->{
                    // Reset The Session
                    SessionBorrowedBooks = 0;
                    SessionReturnedBooks = 0;
                    SessionFees = 0.0;

                    do {
                        //Add user2 menu

                        System.out.printf("%n-----------------------------%n \t \t Welcome %s %n-----------------------------%n",uesrName2);
                        System.out.println("1.Borrow a Book");
                        System.out.println("2.View Borrowed Books");
                        System.out.println("3.Return Book");
                        System.out.println("4.View Session Summary");
                        System.out.printf("5.Exit to Main Menu: %n%n");
                        System.out.print("Enter Your Choice : ");
                        subMenuChoiceNum = input.nextInt();
                        switch(subMenuChoiceNum){
                            case 1 -> {
                                if (user2BorrowedBook < 5) {
                                    user2BorrowedBook ++;
                                    SessionBorrowedBooks ++;
                                    SessionFees += 0.5;
                                    totalRevenue += 0.5;
                                    totalBorrowedOperations ++;
                                    System.out.printf("You have borrowed Book!");
                                }
                                else {
                                    System.out.printf("You have 5 books borrowed %nYou Can not borrow more Books!");
                                }
                            }
                            case 2 ->{
                                System.out.printf("%nYou borrowed %d books%n",user2BorrowedBook);
                            }
                            case 3 ->{
                                if (user2BorrowedBook >= 1) {
                                    user2BorrowedBook--;
                                    SessionReturnedBooks++;
                                    totalReturnedOperations ++;
                                    System.out.printf("%nYou have Returned Book!");
                                }
                                else {
                                    System.out.printf("%n You have No Books to Return");
                                }
                            }
                            case 4 ->{
                                System.out.printf("%nThe Session Summary Is :%n");
                                System.out.printf("Number of books borrowed %d%n",SessionBorrowedBooks);
                                System.out.printf("Number of books returned %d%n",SessionReturnedBooks);
                                System.out.printf("Total fees incurred during the session: %.2f $",SessionFees);
                            }
                            default -> System.out.println("Invalid Choice Please Try Again !");
                        }
                    } while (subMenuChoiceNum != 5);
                }
                case 3 -> {
                    // Reset The Session
                    SessionBorrowedBooks = 0;
                    SessionReturnedBooks = 0;
                    SessionFees = 0.0;

                    do {
                        //Add user2 menu

                        System.out.printf("%n-----------------------------%n \t \t Welcome %s %n-----------------------------%n",uesrName3);
                        System.out.println("1.Borrow a Book");
                        System.out.println("2.View Borrowed Books");
                        System.out.println("3.Return Book");
                        System.out.println("4.View Session Summary");
                        System.out.printf("5.Exit to Main Menu: %n%n");
                        System.out.print("Enter Your Choice : ");
                        subMenuChoiceNum = input.nextInt();
                        switch(subMenuChoiceNum){
                            case 1 -> {
                                if (user3BorrowedBook < 5) {
                                    user3BorrowedBook ++;
                                    SessionBorrowedBooks ++;
                                    SessionFees += 0.5;
                                    totalRevenue += 0.5;
                                    totalBorrowedOperations ++;
                                    System.out.printf("You have borrowed Book!");
                                }
                                else {
                                    System.out.printf("You have 5 books borrowed %nYou Can not borrow more Books!");
                                }
                            }
                            case 2 ->{
                                System.out.printf("%nYou borrowed %d books%n",user3BorrowedBook);
                            }
                            case 3 ->{
                                if (user3BorrowedBook >= 1) {
                                    user3BorrowedBook--;
                                    SessionReturnedBooks++;
                                    totalReturnedOperations ++;
                                    System.out.printf("%nYou have Returned Book!");
                                }
                                else {
                                    System.out.printf("%n You have No Books to Return");
                                }
                            }
                            case 4 ->{
                                System.out.printf("%nThe Session Summary Is :%n");
                                System.out.printf("Number of books borrowed %d%n",SessionBorrowedBooks);
                                System.out.printf("Number of books returned %d%n",SessionReturnedBooks);
                                System.out.printf("Total fees incurred during the session: %.2f $",SessionFees);
                            }
                            default -> System.out.println("Invalid Choice Please Try Again !");
                        }
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
