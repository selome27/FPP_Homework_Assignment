package LESSON9.problem1;

import java.util.Arrays;

public class ArrayQueueImpl{

        private final int DEFAULT_CAPACITY = 10;
        private int size;
        private Integer[] arr;
        private int front;
        private int rear;
        // Add Constructors, Default and Parameterized to initialize instance fields
    // Default constructor
       public ArrayQueueImpl() {
            arr = new Integer[DEFAULT_CAPACITY];
            size = 0;
            front = 0;
            rear = 0;
        }

    // Parameterized constructor
    public ArrayQueueImpl(int capacity) {
        arr = new Integer[capacity];
        size = 0;
        front = 0;
        rear = 0;
    }


    public Integer peek() {
            //implement
              if(isEmpty())return null;
              return arr[front];
        }
        public void enqueue(int obj){
            //implement
            if (size == arr.length) {
                resize();
            }
            arr[rear] = obj;
            rear = (rear + 1) % arr.length; // circular increment
            size++;
        }

        public Integer dequeue() {
            if (isEmpty()) return null;
            Integer item = arr[front];
            arr[front] = null;
            front = (front + 1) % arr.length;
            size--;
            return item;
        }
        public boolean isEmpty(){
         //implement
             return size == 0;
    }
        public int size(){
         //implement
            return size;
        }
        private void resize(){
           Integer[] newArray = new Integer[arr.length * 2];
           for(int i =0; i< arr.length; i++){
               newArray[i] = arr[(front + i) % arr.length];
               }

               arr = newArray;
               front = 0;
               rear = size - 1;
           }

              //implement
           public String toString(){
        /* Return data in this format, each element separated by comma with in [ ]  eg:
         [10, 20, 30, 40, 50, 60 ]*/
                   if (isEmpty()) return "[]";
                   StringBuilder sb = new StringBuilder("[");
                   for (int i = 0; i < size; i++) {
                       sb.append(arr[(front + i) % arr.length]);
                       if (i < size - 1) sb.append(", ");
                   }
                   sb.append("]");
               //System.out.println(Arrays.toString(arr));;
                   return sb.toString();
               }

        public static  void main(String[] args){

            ArrayQueueImpl aq = new ArrayQueueImpl();
            aq.enqueue(10);
            //System.out.println(aq.toString());
            aq.enqueue(20);
            //System.out.println(aq);
            aq.enqueue(30);
            aq.enqueue(40);
            aq.enqueue(50);
            aq.enqueue(60);

            System.out.println(aq.toString());
            //System.out.println(aq.dequeue());
            System.out.println(aq.peek());
            aq.dequeue();
            System.out.println(aq.dequeue());



        }

       }


