/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;

public class FrontDesk {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(
                "Book Name: " + book.getBookName() + ", " +
                        "Author Name: " + book.getAuthorName() + ", " +
                        "ISBN Number: " + book.getIsbnNumber()
        );

    }
}
