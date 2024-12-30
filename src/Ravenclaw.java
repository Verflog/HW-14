import org.jetbrains.annotations.NotNull;

public class Ravenclaw {
    private Student student;
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(Student student, int intelligence, int wisdom, int wit, int creativity) {
        this.student = student;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public static void compareRavenclaw(@NotNull Ravenclaw student1, @NotNull Ravenclaw student2) {
        int sum1 = student1.getCreativity() + student1.getIntelligence() + student1.getWisdom() + student1.getWit();
        int sum2 = student2.getCreativity() + student2.getIntelligence() + student2.getWisdom() + student2.getWit();
        if (sum1 > sum2) {
            System.out.println(student1);
        }
        else if (sum1 < sum2) {
            System.out.println(student2);
        }
        else {
            System.out.println("students are equal");
        }
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "student=" + student +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }
}
