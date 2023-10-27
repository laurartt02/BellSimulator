public class BellEco extends BellDecorator {
    public Bell c;
    public BellEco(Bell c) {
        this.c = c;
    }
    public String getSound() {
        return c.getSound() + " " + c.getSound();
    }
}
