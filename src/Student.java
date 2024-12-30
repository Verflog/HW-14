import org.jetbrains.annotations.NotNull;

public class Student {
    private String name;
    private int wizardry;
    private int transgression;

    public Student(String name, int wizardry, int transgression) {
        this.name = name;
        this.wizardry = wizardry;
        this.transgression = transgression;
    }

    public static void compareStudents(@NotNull Student student1, @NotNull Student student2) {
        int sum1 = student1.getTransgression() + student1.getWizardry();
        int sum2 = student2.getTransgression() + student2.getWizardry();
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWizardry() {
        return wizardry;
    }

    public void setWizardry(int wizardry) {
        this.wizardry = wizardry;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", wizardry=" + wizardry +
                ", transgression=" + transgression +
                '}';
    }


}
