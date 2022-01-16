package abstractclass.exercise;

public class MathLesson {

    public static void main(String[] args) {
        MathExercise adder = new Adder();
        System.out.println(adder.getSolution(8, 9));

        MathExercise subtracker = new Subtracter();
        System.out.println(subtracker.getSolution(8,9));

        MathExercise multiplier = new Multiplier();
        System.out.println(multiplier.getSolution(8,9));

        MathExercise divisor = new Divisor();
        System.out.println(divisor.getSolution(8,9));


    }
}
