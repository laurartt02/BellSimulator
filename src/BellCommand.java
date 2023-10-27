public class BellCommand extends BellDecorator implements Command{
    Bell c;
    public BellCommand(Bell c) {
        this.c = c;
    }
    public String execute() {
        return getSound();
    }
    @Override
    public String getSound() {
        return c.getSound();
    }
}
