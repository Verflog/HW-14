import org.jetbrains.annotations.NotNull;

public class Slytherin {
    private Student student;
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(Student student, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        this.student = student;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public static void compareSlytherin(@NotNull Slytherin student1, @NotNull Slytherin student2) {
        int sum1 = student1.getAmbition() + student1.getCunning() + student1.getDetermination()
                + student1.getResourcefulness() + student1.getThirstForPower();
        int sum2 = student2.getAmbition() + student2.getCunning() + student2.getDetermination()
                + student2.getResourcefulness() + student2.getThirstForPower();
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

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "student=" + student +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                '}';
    }
}
