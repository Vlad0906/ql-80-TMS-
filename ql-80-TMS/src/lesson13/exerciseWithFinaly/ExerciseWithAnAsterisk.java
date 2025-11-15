package lesson13.exerciseWithFinaly;

public class ExerciseWithAnAsterisk {
    /*
    Написать try/catch/finally, в котором finally вызван не будет
     */
    public static void main(String[] args) {

        try {
            double result = getResult(10, 0);
            System.out.println(result);
            System.exit(0);
        } catch (NullPointerException e){
            System.out.println("Incorrect input values " + e.getMessage());
        } finally{
            System.out.println("Hello from the block Finally");
        }
    }

    public static double getResult(int valueA, int valueB){
        return (double) valueA / valueB;
    }
}
