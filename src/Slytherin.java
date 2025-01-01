import org.jetbrains.annotations.NotNull;

public class Slytherin extends Student{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int wizardry, int transgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, wizardry, transgression);
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
                "name=" + getName() +
                ", wizardry=" + getWizardry() +
                ", transgression=" + getTransgression() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                '}';
    }
}
