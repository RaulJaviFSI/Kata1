package katav1;

import java.util.Date;


public class Person {
    private final String name;
    private final String surname1;
    private final String surname2;

    public Person(String name, String surname1, String surname2, Date birthdate) {
        this.name = name;
        this.surname1 = surname1;
        this.surname2 = surname2;
        this.birthdate = birthdate;
    }
    private final Date birthdate;

    public String getName() {
        return name;
    }

    public String getSurname1() {
        return surname1;
    }

    public String getSurname2() {
        return surname2;
    }

    public Date getBirthdate() {
        return birthdate;
    }
    public int getAge(){
        return (int) ((new Date().getTime() - birthdate.getTime())/31536000000L);
    }
}
