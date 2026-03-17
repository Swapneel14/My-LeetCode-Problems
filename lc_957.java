class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        HashSet<String>seen = new HashSet<>();
        boolean cycle=false;
        int clen = 0;
        
        for(int j=0;j<n;j++){
            int[]next = new int[8];
            for(int i=1;i<7;i++){
                next[i]=cells[i-1]==cells[i+1]?1:0;
            }
            String curr = Arrays.toString(next);
            if(seen.contains(curr)){
                cycle=true;
                break;
            }
            clen++;
            seen.add(curr);
            cells=next;

        }

        if(cycle){
            n=n%clen;
            return prisonAfterNDays(cells,n);
        }

        return cells;

    }
}
