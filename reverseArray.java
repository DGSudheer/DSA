class Solution {
    public int[] reverseArray(int[] nums) {
        // Call the helper function to reverse the array
        reverse(nums, 0, nums.length - 1); 
        // Return the reversed array
        return nums; 
    }

    private void reverse(int[] nums, int left, int right) {
        // Base case: pointers have crossed, the array is reversed
        if (left >= right) {
            return; 
        }
        // Swap the elements
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        // Recursive call with updated pointers
        reverse(nums, left + 1, right - 1); 
    }
}

// Main method for testing the reverseArray function
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5};        
        int[] result = solution.reverseArray(nums); 
        for (int num : result) {
            System.out.print(num + " "); 
        }
    }
}

class Solution {
    public int[] reverseArray(int[] nums) {
        //your code goes here
        int[] revnums=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            revnums[nums.length-i-1]=nums[i];
        }
        return revnums;
    }
}

class Solution {
    public void reverse(int[] arr, int n) {
        int start=0; int end=n-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            ++start; --end;
        }
    }
}


