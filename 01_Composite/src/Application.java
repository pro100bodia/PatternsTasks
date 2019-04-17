import java.util.Scanner;
import java.util.regex.Pattern;

public class Application {
    public static void main(String[] args) {
        String input;
        Scanner s = new Scanner(System.in);
        input = s.nextLine();

        String[] params = input.split("[(|)|*|+|\\s]" );

        Composite composite = new Composite();
        composite.addComponent(new Component(Integer.parseInt(params[1]), Integer.parseInt(params[2]), Integer.parseInt(params[4])));
        composite.addComponent(new Component(Integer.parseInt(params[8]), Integer.parseInt(params[7]), Integer.parseInt(params[5])));
        System.out.println(composite.getSum());

//        (1+2)*4+5*(3+6)
    }
}
