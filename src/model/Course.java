package model;

public class Course {

    private int id;
    private String title;
    private String teacher;

    public Course() {
    }

    public Course(int id, String title, String teacher) {
        this.id = id;
        this.title = title;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
