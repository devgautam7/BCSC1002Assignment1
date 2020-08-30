/*  Created by IntelliJ IDEA.
 *  User: Dev Gautam
 *  Date: 29/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;
import java.util.Objects;
public class Book {
private String nameOfTheBook;
    private String nameOfTheAuthorOfTheBook;
    private String thirteenDigitISBNNumberOfTheBook;

    // Parameterized Constructor
    public Book(String nameOfTheBook, String nameOfTheAuthorOfTheBook, String thirteenDigitISBNNumberOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
        this.nameOfTheAuthorOfTheBook = nameOfTheAuthorOfTheBook;
        this.thirteenDigitISBNNumberOfTheBook = thirteenDigitISBNNumberOfTheBook;
    }

    // Non-Parameterized Constructor
    public Book() {
        this.nameOfTheBook = null;
        this.nameOfTheAuthorOfTheBook = null;
        this.thirteenDigitISBNNumberOfTheBook = null;
    }
