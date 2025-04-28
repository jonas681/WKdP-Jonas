package Homework3.Exercise2;

public class Main {
    public static void main(String[] args) {
        Message m1 = new Email(); //statischer Typ: Message && dynamischer Typ: Email
        Message m2 = new SMS();  ////statischer Typ: Message && dynamischer Typ: SMS
        System.out.println(m1.getType()); //zurückgegeben wird Email.
        // getType() ist in Message(Oberklasse) vorhanden, so ist der Aufruf auf jeden Fall schon mal kompilierfähig.
        // Da der dynamische Typ von m1 Email ist, wird dann demtentsprechend auch Email zurückgegeben und nicht Gerneric
        System.out.println(m2.getType()); //zurückgegeben wird SMS gleiche Erklärung wie bei m1
        //m1.send(); //Kann nicht direkt aufgerufen werden, da send() nicht in Message vorhanden ist.
        // m1 ist vom statischen Typ ein Message-Objekt, so ist dieser Aufruf nicht kompilierfähig.
        // Direkter Aufruf ist nur möglich wenn send() in Message vorhanden wäre oder für m1 gilt staischer Typ=dynamischer Typ=Email
        //Lösung send() trotzdem aufrufen können, aber dafür nicht direkt: Downcasting anwenden:

        if(m1 instanceof Email){ //instanceof prüft ob m1 vom dynamischen Typ wirklich ein Email-Objekt ist
            String castEmail = ((Email)m1).send(); //Brauchen "doppelte Klammer", da sonst wir wieder das Problem hätten
            // ,dass m1.send() zuerst aufgerufen wird bevor wir casten. D.h. (Email)m1.send() -> funktioniert nicht;
            System.out.println(castEmail);
        }




    }
}
