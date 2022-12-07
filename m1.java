public class m1 {
    public static int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
    int count = 0;
    while (i < j) {
        count = Math.max(count, Math.min(height[i], height[j]) * (j - i));
        if (height[i] < height[j])
            i++;
        else
            j--;
    }
    return count;
    }
    public static void main(String[] args) {
      int[] arr={1,8,6,2,5,4,8,3,7};
      System.out.print(maxArea(arr));
    }
}