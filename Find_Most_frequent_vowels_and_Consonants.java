public class Find_Most_frequent_vowels_and_Consonants {
     public static int maxFreqSum(String s) {
        
        int arr[]= new int[26];
        for(int i=0;i<26;i++){
            arr[i]=0;
        }
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-97]++;
        }
        int maxv=0;
        int maxc=0;
        for(int i=0;i<26;i++){
            if(i==0||i==4||i==8||i==14|i==20){
                if(arr[i]>=maxv){
                    maxv=arr[i];
                }
            }
            else{
                if(arr[i]>=maxc){
                    maxc=arr[i];
                }
            }
        }
        return maxc+maxv;
    }
    public static void main(String[] args) {
        String s="abbaaeiiuujkkuuhhjhh";
        System.out.println(maxFreqSum(s));
    }
}
