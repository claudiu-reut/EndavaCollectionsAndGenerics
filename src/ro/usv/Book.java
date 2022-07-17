package ro.usv;

public class Book extends Media{
    private String date;
    private Integer pages;
    private Integer chapters;
    private String genre;
    private String publisher;

    public Book(String name, String author, String date, Integer pages, Integer chapters, String genre, String publisher) {
        super(name, author);
        this.date = date;
        this.pages = pages;
        this.chapters = chapters;
        this.genre = genre;
        this.publisher = publisher;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getChapters() {
        return chapters;
    }

    public void setChapters(Integer chapters) {
        this.chapters = chapters;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                " name"+this.getName()+
                ", author"+this.getAuthor()+
                ", date='" + date + '\'' +
                ", pages=" + pages +
                ", chapters=" + chapters +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
