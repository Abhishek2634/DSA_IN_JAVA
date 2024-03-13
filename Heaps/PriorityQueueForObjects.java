import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueForObjects {
             static class Student implements Comparable<Student>{
            String name;
            int rank;
            Student(String name , int rank){
                this.name = name;
                this.rank = rank;
            }
            @Override
            public int compareTo(Student s2){
                return this.rank - s2.rank;
            }
        }
    public static void main(String[] args) {
        PriorityQueue <Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("A",1));
        pq.add(new Student("B",12));
        pq.add(new Student("C", 30));
        pq.add(new Student("D", 20));

        while(!pq.isEmpty()){
            System.out.println("name is " + pq.peek().name +" and rank is "+pq.peek().rank);
            pq.remove();
        }
    }
}
