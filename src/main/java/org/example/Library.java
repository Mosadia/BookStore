package org.example;



import java.util.Scanner;


public class Library {


    public static
     void main(String[] args) {




            Scanner input = new Scanner(System.in);

            System.out.println("********************Welcome to the MoSan Book Library!********************");
            System.out.println("                  Please Select From The Following Options:               ");
            System.out.println("**********************************************************************");
            books ob = new books();
            users obUser = new users();
            int choice = -1;
            int searchChoice;

            do {
                try {
                    ob.dispMenu();
                    choice = input.nextInt();

                    switch (choice) {

                        case 1:
                            book b = new book();
                            ob.addBook(b);
                            break;

                        case 2:
                            ob.upgradeBookQty();
                            break;

                        case 3:
                            System.out.println("Enter 1 to Search with Serial No.");
                            System.out.println("Enter 2 to Search with Author Name(Full Name).");
                            searchChoice = input.nextInt();

                            switch (searchChoice) {

                                case 1:
                                    ob.searchBySno();
                                    break;
                                case 2:
                                    ob.searchByAuthorName();

                            }
                            break;

                        case 4:
                            ob.showAllBooks();
                            break;
                        case 5:
                            user s = new user();
                            obUser.addUser(s);
                            break;
                        case 6:
                            obUser.showAllUsers();
                            break;
                        case 7:
                            obUser.checkOutBook(ob);
                            break;
                        case 8:
                            obUser.checkInBook(ob);
                            break;
                        default:
                            System.out.println("CHOICE SHOULD BE BETWEEN 0 TO 8.");

                    }

                } catch (Exception N) {
                    System.err.println(N.getMessage());

                }
            }
            while (choice != 0);







    }
    



}


























