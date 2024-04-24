
import java.util.Collections;
import java.util.PriorityQueue;

public class maxheapusingpriorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(Collections.reverseOrder());
        heap.add(11);
        heap.add(2);
        heap.add(10);
        heap.add(7);
        heap.add(3);
        heap.add(8);
        System.out.println(heap);
        // [11, 7, 10, 2, 3, 8]
        System.out.println("size of heap : " + heap.size());
        // size of heap : 6
        System.out.println("max in heap : " + heap.peek());
        // max in heap : 11
        System.out.println("Deleted Element: " + heap.poll());
        // Deleted Element: 11
        System.out.println("after deletion");
        System.out.println(heap);
        // [10, 7, 8, 2, 3]
        System.out.println("size of heap : " + heap.size());
        // size of heap : 5
        System.out.println("Deleted Element: " + heap.poll());
        // Deleted Element: 10
        System.out.println(heap);
        // [8, 7, 3, 2]
        System.out.println("max in heap : " + heap.peek());
        // max in heap : 8
    }
}
