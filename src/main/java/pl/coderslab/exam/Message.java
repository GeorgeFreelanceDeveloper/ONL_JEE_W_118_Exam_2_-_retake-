package pl.coderslab.exam;

public class Message {
    private String title;
    private String author;
    private int age;
    private String message;

    public Message() {}

    public Message(String title, String author, int age, String message) {
        this.title = title;
        this.author = author;
        this.age = age;
        this.message = message;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
