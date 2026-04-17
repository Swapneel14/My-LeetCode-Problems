class Solution {
    public double[] internalAngles(int[] sides) {
        Arrays.sort(sides);
        double[]ans = new double[3];
        if(sides[0]+sides[1]<=sides[2])return new double[]{};
        int a = sides[0],b = sides[1],c = sides[2];

        
        ans[0]=Math.toDegrees(Math.acos((b*b+c*c-a*a)/(2.0*b*c)));
        ans[1]=Math.toDegrees(Math.acos((a*a+c*c-b*b)/(2.0*a*c)));
        ans[2]=Math.toDegrees(Math.acos((a*a+b*b-c*c)/(2.0*a*b)));

        return ans;
    }
}
