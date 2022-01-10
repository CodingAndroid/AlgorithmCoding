package 二分查找;

public class BinarySearch {

    public int search(int[] numbs, int target){

        if (numbs == null || numbs.length == 0)
            return -1;

        int left = 0;

        int right = numbs.length - 1; //最后一个元素的索引

        while (left <= right){ //注意

            int mid = left + (right - left) / 2; // 防止 left + right 溢出

            if (target == numbs[mid]){
                return mid;
            } else if (target < numbs[mid]){  //区间[left, mid-1]
                right = mid - 1;
            } else {
                left = mid + 1; //区间[mid+1, right]
            }
        }
        return -1;
    }

    public int searchII(int[] numbs, int target){

        int left = 0;

        int right = numbs.length;

        while (left < right){
            int mid = left + ((right - left) >> 1);
            if (numbs[mid] == target){
                return mid;
            } else if (target < numbs[mid]){  //区间[left, mid)
                right = mid;
            } else {
                left = mid + 1; //区间[mid+1, right)
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] numbs = {1, 2, 3, 5, 6, 8, 9, 10};
        System.out.println(binarySearch.searchII(numbs, 5));
    }
}
