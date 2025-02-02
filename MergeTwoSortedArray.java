import java.util.ArrayList;
import java.util.Scanner;

public class MergeTwoSortedArray{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[] arr1= new int[m];
        int[] arr2= new int[n];
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
       merge(arr1, m, arr2, n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer>list= new ArrayList<>();
        
       /*  for(int i=0;i<x;i++){
            if(nums1[i]<=nums2[i]){
                list.add(nums1[i]);
            }
            else{
                list.add(nums2[i]);
            }
        }*/

        int p1=0;
        int p2=0;
        while(p1<m&&p2<n){
            if(nums1[p1]<=nums2[p2]){
                list.add(nums1[p1]);
                p1++;
            }
            else{
                list.add(nums2[p2]);
                p2++;
            }
        }
                while(p1<m){
                    list.add(nums1[p1]);
                    p1++;
                }
            
            
                while(p2<n){
                    list.add(nums2[p2]);
                    p2++;
                }
            
            System.out.println(list);
        }
        
    }
