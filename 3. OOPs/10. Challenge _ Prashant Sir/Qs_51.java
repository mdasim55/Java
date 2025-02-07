/*
51. Create a book class for a library system.
    * Instance variable: title, author, isbn.
    * Static variable: totalBooks, a counter for the total number of book instances.
    * Instance methods: borrowBook(), returnBook().
    * Static method: getTotalBOOks(), to get the total number of books in the library.
 */
 class Book {
    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrow;
    static {
        totalBooks=0;
    }
    {
        totalBooks++;
    }
    Book(String title, String author, String isbn) {
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    static int getTotalBooks() {
        return totalBooks;
    }
    public void borrowBook() {
        if(isBorrow) {
            System.out.println("Book is already borrowed.");
        } else {
            this.isBorrow=true;
            System.out.println("Enjoy the book.");
        }
    }
    public void returnBook() {
        if(isBorrow) {
            this.isBorrow=false;
            System.out.println("Hope you enjoyed, please hope a review.");
        } else {
            System.out.println("This book already in the library.");
        }
    }

    public static void main(String[] args) {
       Book wimngsOfFire=new Book("fire", "apj", "1");
        
    }
 }