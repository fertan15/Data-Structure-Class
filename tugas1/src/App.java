import java.util.ArrayList;

public class App {

    static PrioQueue queues = new PrioQueue();
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> prio = new ArrayList<>();
        ArrayList<Integer> val = new ArrayList<>();
        prio.add(2);
        val.add(10);
        prio.add(5);
        val.add(7);
        prio.add(1);
        val.add(15);
        prio.add(4);
        val.add(3);
        
        System.out.println("Before sorting:");

        for(int i = 0; i<= prio.size()-1;i++){
            queues.addQueue(prio.get(i), val.get(i));
        }
        System.out.println("After sorting:");

        queues.sort(val, prio);

        // for(int i = 0; i<= queues.priority.size()-1;i++){
        //     System.out.println("Value: " + queues.queue.get(i) + " with Priority: " + queues.priority.get(i));
        // }
    }
}
