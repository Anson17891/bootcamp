//Create a Java class called Book that has the following properties:
// title (String)
// author (String)
// yearPublished (int)
// Then, write a program that:
// Creates three Book objects.
// Stores them in an array.
// Uses a for-each loop to print the details of each book in the format:
// "Title by Author (Year)"
// Expected Output:
// Harry Potter by J.K. Rowling (1997)
// The Hobbit by J.R.R. Tolkien (1937)
// 1984 by George Orwell (1949)

public class Book {
      private String title;
    private String author;
    private int yearPublished;

public Book(String title, String author, int yearPublished){
    this.title = title;
    this.author = author;
    this.yearPublished = yearPublished;
}
    
public String getTitle(){
    return this.title;
}
public String getAuthor(){
    return this.author;
}
public int getYearPublished(){
    return this.yearPublished;
}

public String toString(){
    return this.title + " by "+this.author + " (" + this.yearPublished + ")";
}

public static void main(String[] args){
    Book HP = new Book("Harry Potter", "J.K. Rowling", 1997);
    Book TH = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
    Book onef = new Book("1984", "George Orwell", 1949);
    Book[] books = {HP,TH, onef};
    for(Book book : books){
        System.out.println(book.toString());
    }
}

}
