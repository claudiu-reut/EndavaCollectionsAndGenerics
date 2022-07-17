package ro.usv;

public abstract class Media {
  private String name;
    private String author;
    public Media(String name,String author) {
        this.name = name;
        this.author=author;
    };

    public Media() {
        name="";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Media{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
