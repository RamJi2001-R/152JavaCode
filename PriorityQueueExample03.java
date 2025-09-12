import java.util.PriorityQueue;
public class PriorityQueueExample03 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println("Queue is: "+pq);  // not follow insertion order

        //---adding using offer method-----//
        System.out.println("Added using offer: "+pq.offer(25));
        System.out.println(pq);

        //---Remove and print root element---//
        System.out.println("Deleted: "+pq.poll());
        System.out.println("Deleted: "+pq.poll());

        //---peek method--//
        System.out.println("Element on the root: "+pq.peek());

        //---clear method---//
        pq.clear();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);



    }
}
