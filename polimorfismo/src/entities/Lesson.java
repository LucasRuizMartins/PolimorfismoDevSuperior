package entities;

public abstract class Lesson {

    private String title;
    private int time;

    public int getTime() {
        return time;
    }

    public abstract int duration(int number);

}
