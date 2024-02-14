package test1;

public class Book {
    private String Title;
    private String Author;
    private String Year;

    public Book() { }

    public Book(String title, String author, String year) {
        Title = title;
        Author = author;
        Year = year;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public  void displayInfo(String Title, String Author, String Year) {
        System.out.println("Title:"+getTitle()+","+"Author:"+getAuthor()+","+"Year:"+getYear() );
    }

}
