package Homework1.Task3;

import java.util.ArrayList;
import java.util.List;

public class Inbox {
    private static List<Mail> mails = new ArrayList<>();
    private static List<String> headers = new ArrayList<>();
    private static int unreadCounter = 0;



    public static void addMail(Mail mail) {
        if (mail.isStatus() == false) {
            unreadCounter++;
        }
        mails.add(mail);
        headers.add(mail.isStatus() +  "|" + mail.getSubject() + "|" + mail.getSenderAddress() + "|" + mail.getDateTime());
    }

    public static String showAllEmails(){
   return headers.toString();

    }
    public static String countUnreadEmails(){
        return "Unread Emails: " + unreadCounter;
    }

    public static String open(int index){
        if (index < 0 || index > headers.size()) {
            return "Invalid index";
        } else return headers.get(index);
    }
    public static void refreshHeaders() {
        unreadCounter--;
        headers.clear();
        for (Mail mail : mails) {
            headers.add(mail.isStatus() +  "|" + mail.getSubject() + "|" + mail.getSenderAddress() + "|" + mail.getDateTime());
        }
    }

    public static List<String> getHeaders() {
        return headers;
    }

    public static void setHeaders(List<String> headers) {
        Inbox.headers = headers;
    }

    public static List<Mail> getMails() {
        return mails;
    }

    public static void setMails(List<Mail> mails) {
        Inbox.mails = mails;
    }
}
