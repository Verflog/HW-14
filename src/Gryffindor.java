import org.jetbrains.annotations.NotNull;

public class Gryffindor extends Student{
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int wizardry, int transgression, int nobility, int honor, int bravery) {
        super(name, wizardry, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public static void compareGryffindor(@NotNull Gryffindor student1, @NotNull Gryffindor student2) {
        int sum1 = student1.getBravery() + student1.getHonor() + student1.getNobility();
        int sum2 = student2.getBravery() + student2.getHonor() + student2.getNobility();
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

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "name=" + getName() +
                ", wizardry=" + getWizardry() +
                ", transgression=" + getTransgression() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
