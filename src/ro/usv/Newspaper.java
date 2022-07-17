package ro.usv;

public class Newspaper extends Media{
    private String publisher;
    private String date;

    public Newspaper(String name, String author, String publisher, String date) {
        super(name, author);
        this.publisher = publisher;
        this.date = date;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "name"+this.getName()+
                ", author"+this.getAuthor()+
                ", publisher='" + publisher + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
