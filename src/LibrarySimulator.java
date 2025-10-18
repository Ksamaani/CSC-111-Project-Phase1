//This Project Is Done By:
// Khalid ALSamaani     446100885
// Nasser ALOthman      446103585
// Abdullah ALFrayan    446105689

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
        // admin username&Pass
        final String AdminUsername = "admin";
        final String AdminPassword = "1234"  ;

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

                        System.out.printf("%n-----------------------------%n \t    Welcome %s %n-----------------------------%n",uesrName1);
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
                            case 5 -> {
                                System.out.println("Returning to main menu...\n");
                            }
                            default -> System.out.printf("%nInvalid Choice Please Try Again !");
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

                        System.out.printf("%n-----------------------------%n \t   Welcome %s %n-----------------------------%n",uesrName2);
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
                            case 5 -> {
                                System.out.println("Returning to main menu...\n");
                            }
                            default -> System.out.printf("%nInvalid Choice Please Try Again !");
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
                        System.out.printf("%n-----------------------------%n \t    Welcome %s %n-----------------------------%n",uesrName3);
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
                            case 5 -> {
                                System.out.println("Returning to main menu...\n");
                            }
                            default -> System.out.printf("%nInvalid Choice Please Try Again !");
                        }
                    } while (subMenuChoiceNum != 5);
                }
                case 4 -> {
                        //Asking for Username and Password
                        System.out.println("Enter Username and Password");
                        System.out.print("Username -> ");
                        String UserInputUsername = input.next();
                        System.out.printf("Password -> ");
                        String UserInputPassword = input.next();
                        if (AdminUsername.equals(UserInputUsername) && AdminPassword.equals(UserInputPassword))
                        {
                            do {
                            //Add Admin menu
                            System.out.printf("%n-----------------------------%n \t    Welcome Admin %n-----------------------------%n");
                            System.out.println("1.View Total Revenue");
                            System.out.println("2.Most Frequent Operation");
                            System.out.printf("3.Exit to Main Menu %n%n");
                            System.out.print("Enter your choice: ");
                            subMenuChoiceNum = input.nextInt();

                            switch(subMenuChoiceNum) {
                                case 1 -> {
                                    System.out.printf("The total revenue is: %.2f $", totalRevenue);
                                }
                                case 2 -> {
                                    if (totalBorrowedOperations > totalReturnedOperations) {
                                        System.out.printf("Total Borrowed books %d is greater than Total Returned books %d ", totalBorrowedOperations, totalReturnedOperations);
                                    }
                                    else if (totalReturnedOperations > totalBorrowedOperations) {
                                        System.out.printf("Total Returned books %d is greater than Total Borrowed books %d ", totalReturnedOperations ,totalBorrowedOperations);
                                    }
                                    else {
                                        System.out.printf("Total Borrowed books %d is equal to the Total Returned books %d ", totalBorrowedOperations, totalReturnedOperations);
                                    }
                                }
                                case 3 -> {
                                    System.out.println("Returning to main menu...\n");
                                }
                                default -> {
                                    System.out.println("Invalid Choice Please Try Again !");
                                }
                            }
                        }while (subMenuChoiceNum != 3);
                        }
                        else {System.out.println("Either Username or Password is incorrect !");}

                }
            }
        }while (mainMenuChoiceNum != 5);
        System.out.println("Thank You For Using The Library Simulator. ");


    }
}
