import java.util.HashMap;
import java.util.Random;

public class Simulator {
    public static void main(String[] args) {
        int length = 20;
        BellCommand din = new BellCommand(new BellDin());
        BellCommand dinTic = new BellCommand(new BellTic(new BellDin()));
        BellCommand dinEco = new BellCommand(new BellEco(new BellDin()));
        BellCommand dinWind = new BellCommand(new BellWind(new BellDin()));

        BellCommand don = new BellCommand(new BellDon());
        BellCommand donTic = new BellCommand(new BellTic(new BellDon()));
        BellCommand donEco = new BellCommand(new BellEco(new BellDon()));
        BellCommand donWind = new BellCommand(new BellWind(new BellDon()));

        BellCommand dan = new BellCommand(new BellDan());
        BellCommand danTic = new BellCommand(new BellTic(new BellDan()));
        BellCommand danEco = new BellCommand(new BellEco(new BellDan()));
        BellCommand danWind = new BellCommand(new BellWind(new BellDan()));

        Scheduler s = new Scheduler();

        HashMap<Integer, BellCommand> hm = new HashMap<Integer, BellCommand>();
        hm.put(1, din);
        hm.put(2, dinTic);
        hm.put(3, dinEco);
        hm.put(4, dinWind);

        hm.put(5, don);
        hm.put(6, donTic);
        hm.put(7, donEco);
        hm.put(8, donWind);

        hm.put(9, dan);
        hm.put(10, danTic);
        hm.put(11, danEco);
        hm.put(12, danWind);

        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int myVar = random.nextInt(11) + 1;
            s.setCommand(hm.get(myVar));
            s.sound();
        }
    }

}
