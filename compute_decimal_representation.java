class Solution {
    public int[] decimalRepresentation(int n) {
        ArrayList<Integer>list=new ArrayList<>();
        int m=1;
        while(n>0){
            int d=n%10;
            if(d!=0)list.add(d*m);
            m=m*10;
            n/=10;
        }
        Collections.reverse(list);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
