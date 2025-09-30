package Model;

public class Book extends Manage {

@Override
public  String getName(){
return title;
}
    private String bookID;
    private String title;
    private String author;
    private String yearPublished;

    public Book(String title, String author, String yearPublished) {

        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
    }

    public String getBookId() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearPublished() {
        return yearPublished;
    }

 

}
