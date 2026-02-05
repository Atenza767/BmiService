public class Calculator {
    public int calculate(int weight, double height) {
        double resultBmi;
        resultBmi = weight / (height * height);
    return (int)resultBmi;
    }
}
