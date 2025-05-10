public class Find_closest_Person {
    public static int findClosest1(int x, int y, int z) {//My Solution//
        int x1= Math.abs(z-x);
        int y1=Math.abs(z-y);
        if(x1>y1){
            return 2;
        }
        else if(x1<y1){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static int findClosest(int x, int y, int z) {
        int d1 = Math.abs(x - z);
        int d2 = Math.abs(y - z);

        return (d1 >= d2) ? ((d1 == d2) ? 0 : 2) : 1;
    }
    public static void main(String[] args) {
        int x=8;
        int y=18;
        int z=14;
        int ans =findClosest1(x,y,z);
        int ans2 =findClosest(x,y,z);
       System.out.println(ans+","+ans2);
    }

}
