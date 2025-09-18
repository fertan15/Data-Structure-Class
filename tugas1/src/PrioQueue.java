
import java.util.ArrayList;

public class PrioQueue {
    ArrayList<Integer> queue;
    ArrayList<Integer> priority;
    public PrioQueue() {
        queue = new ArrayList<>();
        priority = new ArrayList<>();
    }

    public void addQueue(int value, int priority){
        this.queue.add(value);
        this.priority.add(priority);

        System.out.println("Added to queue: " + value + " with priority: " + priority);
    }

    public void sort(ArrayList<Integer> arrVal, ArrayList<Integer> arrPri){
        int temp;
        for(int j= 0; j<=arrVal.size()-1;j++){
            for(int i = 0; i<=arrVal.size()-2;i++){
                if(arrPri.get(i) < arrPri.get(i+1)){
                    temp = arrPri.get(i);
                    arrPri.set(i, arrPri.get(i+1));
                    arrPri.set(i+1, temp);
                    temp = arrVal.get(i);
                    arrVal.set(i, arrVal.get(i+1));
                    arrVal.set(i+1, temp);
                }
            }
        }

        for(int i = 0; i<= arrVal.size()-1;i++){
            System.out.println("Value: " + arrVal.get(i) + " with Priority: " + arrPri.get(i));
        }
    }


}
