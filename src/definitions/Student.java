/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String firstName;
    private String middlename;
    private String lastName;
    private long universityRollNumber;
    private int numberOfBookIssued;
    private Book[] issuedBooks;

    public Student(String firstName, String middlename, String lastName, long universityRollNumber, int numberOfBookIssued, Book[] issuedBooks) {
        this.firstName = firstName;
        this.middlename = middlename;
        this.lastName = lastName;
        this.universityRollNumber = universityRollNumber;
        this.numberOfBookIssued = numberOfBookIssued;
        this.issuedBooks = issuedBooks;
    }

    public Student() {
    }

    public Student(String firstName, String lastName, long universityRollNumber, int numberOfBookIssued, Book[] issuedBooks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.universityRollNumber = universityRollNumber;
        this.numberOfBookIssued = numberOfBookIssued;
        this.issuedBooks = issuedBooks;
    }

    public Student(String firstName, long universityRollNumber, int numberOfBookIssued, Book[] issuedBooks) {
        this.firstName = firstName;
        this.universityRollNumber = universityRollNumber;
        this.numberOfBookIssued = numberOfBookIssued;
        this.issuedBooks = issuedBooks;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBookIssued() {
        return numberOfBookIssued;
    }

    public void setNumberOfBookIssued(int numberOfBookIssued) {
        this.numberOfBookIssued = numberOfBookIssued;
    }

    public Book[] getIssuedBooks() {
        return issuedBooks;
    }

    public void setIssuedBooks(Book[] issuedBooks) {
        this.issuedBooks = issuedBooks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", middlename='" + middlename + '\'' +
                ", lastName='" + lastName + '\'' +
                ", universityRollNumber=" + universityRollNumber +
                ", numberOfBookIssued=" + numberOfBookIssued +
                ", issuedBooks=" + Arrays.toString(issuedBooks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getUniversityRollNumber() == student.getUniversityRollNumber() &&
                getNumberOfBookIssued() == student.getNumberOfBookIssued() &&
                getFirstName().equals(student.getFirstName()) &&
                getMiddlename().equals(student.getMiddlename()) &&
                getLastName().equals(student.getLastName()) &&
                Arrays.equals(getIssuedBooks(), student.getIssuedBooks());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFirstName(), getMiddlename(), getLastName(), getUniversityRollNumber(), getNumberOfBookIssued());
        result = 31 * result + Arrays.hashCode(getIssuedBooks());
        return result;
    }
}
