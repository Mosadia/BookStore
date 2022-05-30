package org.example;

import java.util.Scanner;

public class user {


    String userName;
    String regNum;

    book borrowedBooks[] = new book[3];
    public int booksCount = 0;

    Scanner input = new Scanner(System.in);



    public user(){

        System.out.println("Enter Account Balance:");
        int credit = input.nextInt();

        input.nextLine();

            if(credit >= 50){


        System.out.println("Enter User Name:");
        this.userName = input.nextLine();


                System.out.println("Enter Reg Number:");
                this.regNum = input.nextLine();

            }

            else{
                System.out.println("Please add money in your account");
            }

    }
}