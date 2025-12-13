class Solution {
    public static class Coupon{
        String code;
        String b;
        Coupon(String code,String b){
            this.code=code;
            this.b=b;
        }

    }
    public List<String> validateCoupons(String[] code, String[] bu, boolean[] active) {
        int n=code.length;
        Map<String, Integer> priority = new HashMap<>();
        priority.put("electronics", 0);
        priority.put("grocery", 1);
        priority.put("pharmacy", 2);
        priority.put("restaurant", 3);

        List<Coupon> valids = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!active[i])continue;

            if(code[i].isEmpty())continue;
            if(!code[i].matches("\\w+"))continue;
            if (!priority.containsKey(bu[i])) continue;
            valids.add(new Coupon(code[i],bu[i]));
        }
        valids.sort((a,b)->{
            int c=priority.get(a.b)-priority.get(b.b);
            if(c!=0)return c;
            return a.code.compareTo(b.code);
        });
        int s=valids.size();
        List<String>ans=new ArrayList<>();
        for(int i=0;i<s;i++){
            ans.add(valids.get(i).code);
        }
      return ans;
    }
}
