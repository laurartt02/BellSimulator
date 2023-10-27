public class Scheduler {
    public Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void sound() {
        System.out.println(command.execute());
    }
}
