public class remove_element {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
         removeElement(arr, 7);
    }
    public static void removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        for(int m=0;m<nums.length-1;m++){
            System.out.print(nums[m]+" ");
        }
    }
}
