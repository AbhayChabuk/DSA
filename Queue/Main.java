// Queue = FIFO data structure. First in First out
//         A collection designed for holding elements prior to processing
//         Linear data structure


//         add      =  enqueue, offer()
//         remove   =  dequeue, poll()

/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Abhay");
        queue.offer("Bhagwan");
        queue.offer("Chabuk");
        
        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println(queue);
        // System.out.println(queue.peek());

        System.out.println(queue.isEmpty());

        System.out.println(queue.contains("Abhay"));
        
    }
}