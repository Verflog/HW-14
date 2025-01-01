import org.jetbrains.annotations.NotNull;

public class Hufflepuff extends Student{
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int wizardry, int transgression, int diligence, int loyalty, int honesty) {
        super(name, wizardry, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public static void compareHufflepuff(@NotNull Hufflepuff student1, @NotNull Hufflepuff student2) {
        int sum1 = student1.getDiligence() + student1.getHonesty() + student1.getLoyalty();
        int sum2 = student2.getDiligence() + student2.getHonesty() + student2.getLoyalty();
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

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "name=" + getName() +
                ", wizardry=" + getWizardry() +
                ", transgression=" + getTransgression() +
                ", diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}
