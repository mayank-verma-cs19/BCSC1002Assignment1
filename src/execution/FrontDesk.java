/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {

    public static final int ISSUE_A_NEW_BOOK = 1;
    public static final int RETURN_A_BOOK = 2;
    public static final int NO_OF_BOOK_ISSUED = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        int studentInput;

        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            studentInput = scanner.nextInt();

            String isbnNuber;
            switch (studentInput) {
                case ISSUE_A_NEW_BOOK:
                    System.out.println("Please enter the Book name : ");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    System.out.println("Enter the Author name : ");
                    String authorName = scanner.nextLine();
                    System.out.println("Enterthe ISBN Number of the book");
                    String isbnNumber = scanner.nextLine();
                    Book book = new Book(bookName, authorName, isbnNumber);
                    student.doCheckout(book);
                    break;
                case RETURN_A_BOOK:
                    System.out.println("Enter the name of the book you want to return");
                    String returnBook = scanner.nextLine();
                    student.doReturn(returnBook);
                case NO_OF_BOOK_ISSUED:
                    student.showAllBooks();
                    break;
                default:
            }
        }
        while (studentInput != 4);
    }
}
