// Base class for all library items
class LibraryItem {
    protected String title;
    protected boolean isCheckedOut;

    // Method to check out an item
    public void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is already checked out.");}}

    // Method to return an item
    public void returnItem() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not checked out.");}}}

// Book class extends LibraryItem
class Book extends LibraryItem {
    public Book(String title) {
        this.title = title;
        this.isCheckedOut = false;}}

// DVD class extends LibraryItem
class DVD extends LibraryItem {
    public DVD(String title) {
        this.title = title;
        this.isCheckedOut = false;}}

// Journal class extends LibraryItem
class Journal extends LibraryItem {
    public Journal(String title) {
        this.title = title;
        this.isCheckedOut = false;}}

public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("To kill a mocking bird");
        DVD dvd = new DVD("Forrest Gump");
        Journal journal = new Journal(" IT journal ");

        book.checkOut(); // Checking out the book
        dvd.checkOut();  // Checking out the DVD
        journal.checkOut();  // Checking out the journal

        book.returnItem(); // Returning the book
        dvd.returnItem();  // Returning the DVD
        journal.returnItem();  // Returning the journal
    }}
