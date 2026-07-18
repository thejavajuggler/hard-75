import java.util.*;

public class TopKFrequentElement {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 4, 3, 6, 6, 6 ,6};
        int k = 3;


        int[] topKFrequestElements = findTopKFrequestElements(nums, k);
        System.out.println(Arrays.toString(topKFrequestElements));

    }

    private static int[] findTopKFrequestElements(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
           hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue =
                new PriorityQueue<>((e1, e2) -> e1.getValue() - e2.getValue());

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            priorityQueue.add(entry);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
        int i = 0;
        while (!priorityQueue.isEmpty()){
            res[i] = priorityQueue.poll().getKey();
            i++;
        }
        return res;
    }
}
