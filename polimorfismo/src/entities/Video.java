package entities;

public class Video extends Lesson {

    private String title;
    private String url;
    private Integer duration;

    public Video() {
    }

    public Video(String title, String url, Integer duration) {
        this.title = title;
        this.url = url;
        this.duration = duration;
    }

    @Override
    public int duration(int duration) {
        return duration;
    }

    @Override
    public int getTime() {
        return duration;
    }
}
