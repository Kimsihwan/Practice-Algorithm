import java.util.*;

public class StackQueue {

    public static void main(String[] args) {
        QueueWithStack<Integer> que = new QueueWithStack<>();

        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        que.enqueue(4);

        System.out.println(que.dequeue());
        System.out.println(que.dequeue());

        que.enqueue(5);
        que.enqueue(6);
        System.out.println(que.dequeue());
        System.out.println(que.dequeue());
        System.out.println(que.dequeue());
        System.out.println(que.dequeue());
    }


    static class QueueWithStack<T> {
        private Stack firstStack;
        private Stack secondStack;

        public QueueWithStack() {
            this.firstStack = new Stack();
            this.secondStack = new Stack();
        }

        public void enqueue(T v) {
            firstStack.push(v);
        }

        public T dequeue() {
            if(secondStack.isEmpty()) {
                while(!firstStack.isEmpty()) {
                    secondStack.push(firstStack.pop());
                }
            }
            return (T) secondStack.pop();
        }
    }
}
