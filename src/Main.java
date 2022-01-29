public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();

        student.name1 = "Mateusz";
        student.name2 = "Byczkowski";
        student.int1 =   22;
        student.bool1 = true;

        student1.name1 = "Marek";
        student1.name2 = "Mostowiak";
        student1.int1 =   34;
        student1.bool1 = false;

        student2.name1 = "Piotr";
        student2.name2 = "Hajduk";
        student2.int1 =   28;
        student2.bool1 = true;

        Student [] students = new Student[3];
        students[0] = student;
        students[1] = student1;
        students[2] = student2;

        for(Student s : students )
        {
            System.out.println("Imie: " + s.name1);
            System.out.println("Nazwisko: " +s.name2);
            System.out.println("Wiek: " + s.int1);
            System.out.println("Postać fikcyjna: " +s.bool1);

            System.out.println();

        }

    }
}