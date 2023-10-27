public class BellTic extends BellDecorator{
    Bell c;
    public BellTic(Bell c) {
        this.c = c;
    }
    public String getSound() {
        return c.getSound() + " tic";
    }
}
