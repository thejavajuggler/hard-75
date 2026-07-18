import java.util.PriorityQueue;

public class MedianFinder {

    public final PriorityQueue<Integer> maxHeap;
    public final PriorityQueue<Integer> minHeap;

    public MedianFinder() {
        maxHeap = new PriorityQueue<>((num1, num2) -> num2 - num1);
        minHeap = new PriorityQueue<>();
    }

    public  void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        addNumber(1);
        addNumber(2);

        System.out.println(findMedian());


    }

    public  void addNumber(int num) {
        maxHeap.add(num);
        minHeap.add(maxHeap.poll());
        if (minHeap.size() > maxHeap.size())
            maxHeap.add(minHeap.poll());
    }

    public  double findMedian() {

        if(maxHeap.size() > minHeap.size())
            return maxHeap.peek();
        else {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }

    }
}
