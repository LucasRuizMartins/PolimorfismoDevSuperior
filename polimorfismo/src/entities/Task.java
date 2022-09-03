package entities;

public class Task extends Lesson{

    private String title; 
    private String description; 
    private Integer questionCount;


    public Task() {
    }

    public Task(String title, String description, Integer questionCount) {
        this.title = title;
        this.description = description;
        this.questionCount = questionCount;
    }

 
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   
    
    @Override
    public int duration(int questionCount) {
       return questionCount * 300;
    }

    @Override
    public int getTime() {
        return questionCount;
    }
    
}
