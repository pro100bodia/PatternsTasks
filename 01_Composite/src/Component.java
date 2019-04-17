public class Component {
    private int val1, val2, val3;

    public Component(int val1, int val2, int val3) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }

    public int getVal(){
        return (val1 + val2) * val3;
    }
}
