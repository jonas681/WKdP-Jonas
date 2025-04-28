package Homework1.Task3;

import static Homework1.Task3.Inbox.*;

public class Main {
    public static void main(String[] args) {
        Mail mail1 = new Mail("jonas@mail.com","Homework","Hello, my friend","20.04.2025",false);
        //mail1.EmailIsRead();
        Mail mail2 = new Mail("stephan@mail.com","Gehalt","Hello, Mr. P","21.04.2025",false);
        Inbox inbox1 = new Inbox();
        System.out.println(showAllEmails());
        System.out.println(open(1));
        System.out.println(open(3));
        System.out.println(mail1.showEmail());
        System.out.println(countUnreadEmails());



    }
}
