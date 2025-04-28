package Homework1.Task3;

public class Mail {
    private String senderAddress;
    private String subject;
    private String message;
    private String dateTime;
    private boolean status = false;

    public Mail(String senderAddress, String subject, String message, String dateTime, boolean status) {
        this.senderAddress = senderAddress;
        this.subject = subject;
        this.message = message;
        this.dateTime = dateTime;
        this.status = status;
        Inbox.addMail(this);

    }

    public void EmailIsRead(){
        this.status = true;
        Inbox.refreshHeaders();

    }

    public String showEmail() {
        return getSubject() + " from " + getSenderAddress() + " on " + getDateTime() + ":\n " + getMessage(); //:\n -> Zeilenumbruch
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
