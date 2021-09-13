public class Book
{
    private String title;
    private String author;
    private String iSBN;
    // constructor that passes in a title author and isbn 
    public Book(String myTitle, String myAuthor, String myISBN) {
        title = myTitle;
        author = myAuthor;
        iSBN = myISBN;
        
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getISBN() {
        return iSBN;
    }
    
}

