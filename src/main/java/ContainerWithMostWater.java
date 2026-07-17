public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater(height));
    }

    private static int containerWithMostWater(int[] height) {
        int i = 0, j = height.length - 1;
        int maxWater = 0;
        while (i < j) {
            int boundary = Math.min(height[i], height[j]);
            maxWater = Math.max(maxWater, (j - i) * boundary);
            if (height[i] > height[j])
                j--;
            else
                i++;

        }
        return maxWater;
    }
}
