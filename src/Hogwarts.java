public class Hogwarts {
    public static void main(String[] args) {
        Student student1 = new Student("Harry Potter", 95, 45);
        Gryffindor gryffindorStudent1 = new Gryffindor(student1, 90, 80, 90);
        Student student2 = new Student("Hermione Granger", 100, 65);
        Gryffindor gryffindorStudent2 = new Gryffindor(student2, 70, 70, 60);
        Student student3 = new Student("Ron Weasley", 40, 85);
        Gryffindor gryffindorStudent3 = new Gryffindor(student3, 80, 90, 70);

        Student student4 = new Student("Zachary Smith", 70, 50);
        Hufflepuff hufflepuffStudent1 = new Hufflepuff(student4, 60, 80, 40);
        Student student5 = new Student("Cedric Diggory", 99, 5);
        Hufflepuff hufflepuffStudent2 = new Hufflepuff(student5, 90, 80, 90);
        Student student6 = new Student("Justin Finch-Fletchly", 60, 70);
        Hufflepuff hufflepuffStudent3 = new Hufflepuff(student6, 80, 90, 100);

        Student student7 = new Student("Marcus Belby", 10, 20);
        Ravenclaw ravenclawStudent1 = new Ravenclaw(student7, 30, 40, 50, 60);
        Student student8 = new Student("Zhou Chang", 70, 80);
        Ravenclaw ravenclawStudent2 = new Ravenclaw(student8, 90, 100, 10, 20);
        Student student9 = new Student("Padma Patil", 30, 40);
        Ravenclaw ravenclawStudent3 = new Ravenclaw(student9, 50, 60, 70, 80);

        Student student10 = new Student("Draco Malfoy", 90, 100);
        Slytherin slytherinStudent1 = new Slytherin(student10, 10, 20, 30,
                40, 50);
        Student student11 = new Student("Grahem Montague", 60, 70);
        Slytherin slytherinStudent2 = new Slytherin(student11, 80, 90, 100,
                10, 20);
        Student student12 = new Student("Gregory Goyle", 30, 40);
        Slytherin slytherinStudent3 = new Slytherin(student12, 50, 60, 70,
                80, 90);

        System.out.println("slytherinStudent1 = " + slytherinStudent1); // метод, выводящий полное описание студента
        Ravenclaw.compareRavenclaw(ravenclawStudent1, ravenclawStudent2); // метод, сравнивающий учеников одного факультета
        Student.compareStudents(student1, student9); // метод, сравнивающий двух любых учеников Хогвартса

    }
}