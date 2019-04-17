import java.util.ArrayList;
import java.util.List;

public class Composite {
    private static List<Component> components = new ArrayList<>();

    public void addComponent(Component component){
        components.add(component);
    }

    public int getSum(){
        int sum = 0;

        for(Component c: components)
        {
            sum += c.getVal();
        }

        return sum;
    }
}
