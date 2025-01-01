public class Hogwarts {
    public static void main(String[] args) {
        Gryffindor gryffindorStudent1 = new Gryffindor("Harry Potter", 95, 45, 90, 80, 90);
        Gryffindor gryffindorStudent2 = new Gryffindor("Hermione Granger", 100, 65, 70, 70, 60);
        Gryffindor gryffindorStudent3 = new Gryffindor("Ron Weasley", 40, 85, 80, 90, 70);

        Hufflepuff hufflepuffStudent1 = new Hufflepuff("Zachary Smith", 70, 50, 60, 80, 40);
        Hufflepuff hufflepuffStudent2 = new Hufflepuff("Cedric Diggory", 99, 5, 90, 80, 90);
        Hufflepuff hufflepuffStudent3 = new Hufflepuff("Justin Finch-Fletchly", 60, 70, 80, 90, 100);

        Ravenclaw ravenclawStudent1 = new Ravenclaw("Marcus Belby", 10, 20, 30, 40, 50, 60);
        Ravenclaw ravenclawStudent2 = new Ravenclaw("Zhou Chang", 70, 80, 90, 100, 10, 20);
        Ravenclaw ravenclawStudent3 = new Ravenclaw("Padma Patil", 30, 40, 50, 60, 70, 80);

        Slytherin slytherinStudent1 = new Slytherin("Draco Malfoy", 90, 100, 10, 20, 30,
                40, 50);
        Slytherin slytherinStudent2 = new Slytherin("Grahem Montague", 60, 70, 80, 90, 100,
                10, 20);
        Slytherin slytherinStudent3 = new Slytherin("Gregory Goyle", 30, 40, 50, 60, 70,
                80, 90);

        System.out.println("slytherinStudent1 = " + slytherinStudent1); // метод, выводящий полное описание студента
        Ravenclaw.compareRavenclaw(ravenclawStudent1, ravenclawStudent2); // метод, сравнивающий учеников одного факультета
        Student.compareStudents(gryffindorStudent1, ravenclawStudent3); // метод, сравнивающий двух любых учеников Хогвартса

    }
}