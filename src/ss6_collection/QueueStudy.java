package ss6_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueStudy {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
