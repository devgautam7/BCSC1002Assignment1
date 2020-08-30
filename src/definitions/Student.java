/*  Created by IntelliJ IDEA.
 *  User: Dev Gautam
 *  Date: 29/08/20
 *  Time: 10:43 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private static final int MAXIMUM_BOOKS_STUDENT_CAN_ISSUE = 5;
    private String nameOfTheStudent;
    private long universityRollNumberOfTheStudent;
    private int numberOfBooksIssuedByTheStudent;
    private Book[] namesOfTheBooksIssuedByTheStudent;

    // Parameterized Constructor
    public Student(String nameOfTheStudent, long universityRollNumberOfTheStudent, int numberOfBooksIssuedByTheStudent, Book[] namesOfTheBooksIssuedByTheStudent) {
        this.nameOfTheStudent = nameOfTheStudent;
        this.universityRollNumberOfTheStudent = universityRollNumberOfTheStudent;
        this.numberOfBooksIssuedByTheStudent = numberOfBooksIssuedByTheStudent;
        this.namesOfTheBooksIssuedByTheStudent = namesOfTheBooksIssuedByTheStudent;
    }

    // Non-Parameterized Constructor
    public Student() {
        this.nameOfTheStudent = "";
        this.universityRollNumberOfTheStudent = 0L;
        this.numberOfBooksIssuedByTheStudent = 0;
        this.namesOfTheBooksIssuedByTheStudent = new Book[MAXIMUM_BOOKS_STUDENT_CAN_ISSUE];
        for (int initializingBook = 0; initializingBook < MAXIMUM_BOOKS_STUDENT_CAN_ISSUE; initializingBook++) {
            this.namesOfTheBooksIssuedByTheStudent[initializingBook] = new Book();
        }
    }
