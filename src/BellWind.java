public class BellWind extends BellDecorator{
    Bell c;
    public BellWind(Bell c) {
        this.c = c;
    }
    public String getSound() {
        return c.getSound() + " fff";
    }
}
