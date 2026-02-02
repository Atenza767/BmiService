//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        calculate service = new calculate();
        int weight = 98;
        double height = 1.87;
        int result = service.calculate(weight, height);
        System.out.println((result) + " индекс массы тела");

    }
}