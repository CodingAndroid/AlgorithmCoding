package 二分查找;

public class LeetCode69 {

    public int mySqrt(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        int ans = 0;
        int left = 0;
        int right = x;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (mid * mid <= x){
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode69 leetCode69 = new LeetCode69();
        System.out.println(leetCode69.mySqrt(8));
    }
}
