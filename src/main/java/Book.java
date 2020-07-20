

public class Book {

    private  String author ;
    private  String title ;
public static Book of(String author,String title){
    return new Book(author,title);
}


    private Book(String author, String title) {
        this.author = author;
        this.title = title;
    }



    public  String getAuthor() {

    return author;
    }

    public  void setAuthor(String author) {

    this.author = author;
    }

    public  String getTitle() {

    return title;
    }

    public void setTitle(String title) {

    this.title = title;
    }
}