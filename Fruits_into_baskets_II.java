import java.util.*;
import java.util.stream.*;

class Solution {
    public int numOfUnplacedFruits(int[] f, int[] b) {
        // Make list modifiable
        List<Integer> list = new ArrayList<>(Arrays.stream(b)
                                                   .boxed()
                                                   .toList());

        int placed = 0;
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) >= f[i]) {  // No need for list.size()>=0 (always true)
                    placed++;
                    list.remove(j);  // Works now
                    break;
                }
            }
        }
        return f.length - placed;
    }
}
