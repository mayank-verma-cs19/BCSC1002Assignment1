/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private String isbnNumber;

    public Book() {
        this.bookName = "";
        this.authorName = "";
        this.isbnNumber = "";
    }

    public Book(String bookName, String authorName, String isbnNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbnNumber = isbnNumber;


    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String toString() {
        return String.format(
                "Book Name: %s , Author Name: %s , ISBN Number: %s",
                getBookName(), getAuthorName(), getIsbnNumber()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getBookName().equals(book.getBookName()) &&
                getAuthorName().equals(book.getAuthorName()) &&
                getIsbnNumber().equals(book.getIsbnNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorName(), getIsbnNumber());
    }
}
