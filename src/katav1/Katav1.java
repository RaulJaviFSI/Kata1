package katav1;

import java.util.Date;

public class Katav1 {

    public static void main(String[] args) {
        Person person = new Person("Raúl","Santana","Cabrera",new Date(95,1,24));
        System.out.println(person.getName() +" "+ person.getSurname1() +" "+ person.getSurname2() + " tiene " + person.getAge() + " años.");
    }
    
}
