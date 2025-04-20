package Homework1.Task1;

public class Textbook extends Book {
    private String subject;

    public Textbook(String title, int year, String author, String subject) {
        super(title, year, author);
        this.subject = subject;
    }


    public String getInfo() {
        return getTitle() + ", " + "published in " + getYear() + " by " + getAuthor() + " Subject: " + subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
