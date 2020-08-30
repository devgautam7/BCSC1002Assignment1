/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;
import java.util.Arrays;
public class Library {

private static final int MAXIMUM_BOOKS_IN_LIBRARY = 5;
    private Book[] booksThatAreCurrentlyAvailable;

    // Parameterized Constructor
    public Library(Book[] booksThatAreCurrentlyAvailable) {
        this.booksThatAreCurrentlyAvailable = booksThatAreCurrentlyAvailable;
    }

    // Non-Parameterized Constructor
    public Library() {
        this.booksThatAreCurrentlyAvailable = new Book[MAXIMUM_BOOKS_IN_LIBRARY];
        for (int libraryIndex = 0; libraryIndex < MAXIMUM_BOOKS_IN_LIBRARY; libraryIndex++) {
            this.booksThatAreCurrentlyAvailable[libraryIndex] = new Book();
        }
    }
public Book[] getBooksThatAreCurrentlyAvailable() {
        return booksThatAreCurrentlyAvailable;
    }

    public void setBooksThatAreCurrentlyAvailable(Book[] booksThatAreCurrentlyAvailable) {
        this.booksThatAreCurrentlyAvailable = booksThatAreCurrentlyAvailable;
    }
Override
    public String toString() {
        return Arrays.toString(booksThatAreCurrentlyAvailable);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getBooksThatAreCurrentlyAvailable(), library.getBooksThatAreCurrentlyAvailable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooksThatAreCurrentlyAvailable());
    }

    /**

     * This method will set the Information of books available in Library.
     */
    public void setBooksInLibrary() {
        booksThatAreCurrentlyAvailable[0].setNameOfTheBook(" Harry Potter and the chamber of secrets");
        booksThatAreCurrentlyAvailable[0].setNameOfTheAuthorOfTheBook("J.K. Rowling");
        booksThatAreCurrentlyAvailable[0].setThirteenDigitISBNNumberOfTheBook("6822945789728");
        booksThatAreCurrentlyAvailable[1].setNameOfTheBook("Life and Death");
        booksThatAreCurrentlyAvailable[1].setNameOfTheAuthorOfTheBook("By Stephenie Meyer");
        booksThatAreCurrentlyAvailable[1].setThirteenDigitISBNNumberOfTheBook("2456899076538");
        booksThatAreCurrentlyAvailable[2].setNameOfTheBook("A Passage to India");
        booksThatAreCurrentlyAvailable[2].setNameOfTheAuthorOfTheBook("By E.M. Froster");
        booksThatAreCurrentlyAvailable[2].setThirteenDigitISBNNumberOfTheBook("7996424689125");
        booksThatAreCurrentlyAvailable[3].setNameOfTheBook("Midnight's Children");
        booksThatAreCurrentlyAvailable[3].setNameOfTheAuthorOfTheBook("By Salman Rushdie");
        booksThatAreCurrentlyAvailable[3].setThirteenDigitISBNNumberOfTheBook("4667990876547");
        booksThatAreCurrentlyAvailable[4].setNameOfTheBook("The Good Soldier");
        booksThatAreCurrentlyAvailable[4].setNameOfTheAuthorOfTheBook("By Ford Madox Ford");
        booksThatAreCurrentlyAvailable[4].setThirteenDigitISBNNumberOfTheBook("34566781345599");
    }

    /**
