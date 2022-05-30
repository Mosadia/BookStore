package org.example;


import java.util.InputMismatchException;
import java.util.Scanner;



public class book {

    public int sNo;
    public String bookName;
    public String authorName;
    public int bookQty;
    public int bookQtyCopy;

    Scanner input = new Scanner(System.in);

    public book(){

        System.out.println("Enter Serial No of Book:");
        if(input.hasNextInt()){
            this.sNo = input.nextInt();
            input.nextLine();
        }else{
            throw new InputMismatchException("Expected i1nt but got something else");
        }
        System.out.println("Enter Book Name:");
        this.bookName = input.nextLine();
        System.out.println("Enter Author Name:");
        this.authorName = input.nextLine();
        System.out.println("Enter Quantity of Books:");
        this.bookQty = input.nextInt();
        bookQtyCopy = this.bookQty;

    }

}
