class Solution {
    int n1, n2;
    Map<List<Integer>, Integer> dp = new HashMap<>();

    private int upperBound(int[] arr, int target) {
        int l = 0, r = arr.length;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return l;
    }

    private int solve(int ind, int prev, int[] arr1, int[] arr2) {
        if (ind == n1)
            return 0;
        if (dp.containsKey(Arrays.asList(ind, prev)))
            return dp.get(Arrays.asList(ind, prev));

        int take = Integer.MAX_VALUE;
        if (arr1[ind] > prev) {
            take = solve(ind + 1, arr1[ind], arr1, arr2);
        }
        int swap = Integer.MAX_VALUE;
        int up = upperBound(arr2, prev);

        if (up != n2) {
            int next = solve(ind + 1, arr2[up], arr1, arr2);
            if (next != Integer.MAX_VALUE) {
                swap = 1 + next;
            }
        }

        int ans = Math.min(take, swap);
        dp.put(Arrays.asList(ind, prev), ans);
        return ans;

    }

    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        n1 = arr1.length;

        Arrays.sort(arr2);
        arr2 = Arrays.stream(arr2)
                .distinct()
                .toArray();
        n2 = arr2.length;

        int ans = Integer.MAX_VALUE;
        int res = solve(0, Integer.MIN_VALUE, arr1, arr2);

        if(res==Integer.MAX_VALUE)return -1;
        return res;
    }
}
