
public class Student {
    private Person person;

    private WydzialEnum wydzial;

    public Student() {
        person = new Person("Marek", "Mostowiak", 123342);
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public Person getPerson() {
        return person;
    }
    public void setWydzial(WydzialEnum wydzialEnum) {
        this.wydzial = wydzialEnum;
    }
    public WydzialEnum getWydzial() {
        return wydzial;
    }

    public String toString() {
        return "Student " +
                "person = " + person.getName() +
                " " + person.getSurname() +
                " Index " + person.getIndex() +
                ", wydzial = " + wydzial
                ;
    }
}


