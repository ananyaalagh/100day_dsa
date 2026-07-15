// Q1
// class Solution {
//     public void rotate(int[] nums, int k) {

//         int n = nums.length;
//         k = k % n;

//         int left = 0;
//         int right = n - 1;

//         // Reverse whole array
//         while (left < right) {
//             int temp=nums[left];
//             nums[left]=nums[right];
//             nums[right]=temp;
//             left++;
//             right--;
//         }

//         // Reverse first k elements
//         left = 0;
//         right = k - 1;

//         while (left < right) {
//              int temp=nums[left];
//             nums[left]=nums[right];
//             nums[right]=temp;
            
//             left++;
//             right--;
//         }

//         // Reverse remaining elements
//         left = k;
//         right = n - 1;

//         while (left < right) {
//              int temp=nums[left];
//             nums[left]=nums[right];
//             nums[right]=temp;
            
//             left++;
//             right--;
//         }
//     }
// }


// Q2

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        // Prefix products
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Suffix products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * suffix;
            suffix *= nums[i];
        }

        return answer;
    }
}