package ro.usv;

public class Video extends Media{
    private Integer bitrate;
    private Integer Height;
    private Integer Width;
    private String format;

    public Video(String name,String author, Integer bitrate, Integer height, Integer width, String format) {
        super(name,author);
        this.bitrate = bitrate;
        Height = height;
        Width = width;
        this.format = format;
    }

    public Integer getBitrate() {
        return bitrate;
    }

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    public Integer getHeight() {
        return Height;
    }

    public void setHeight(Integer height) {
        Height = height;
    }

    public Integer getWidth() {
        return Width;
    }

    public void setWidth(Integer width) {
        Width = width;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name"+this.getName()+
                ", author"+this.getAuthor()+
                ", bitrate=" + bitrate +
                ", Height=" + Height +
                ", Width=" + Width +
                ", format='" + format + '\'' +
                '}';
    }
}
