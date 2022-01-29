public class Main {
    public static void main(String[] args) {
        Person person = new Person("Mateusz", "Byczkowski", 152392);
        System.out.println(person.all());
        Student student = new Student();
        student.setPerson(person);
        student.setWydzial(WydzialEnum.INFORMATYKA);
        System.out.println(student.toString());
    }

}

