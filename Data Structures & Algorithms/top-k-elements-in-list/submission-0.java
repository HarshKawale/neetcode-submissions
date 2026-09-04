class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int n:nums){
            count.merge(n,1,Integer::sum);
        }
        Integer[] arr = new Integer[count.size()];
        int c=0;
        for(int i: count.keySet()){
            arr[c] = i;
            c++;
        }
        Arrays.sort(arr, (b, a) -> count.get(a) - count.get(b));

        int op[] = new int[k];
        for(int i=0;i<k;i++){
            op[i] = arr[i];
        }
        return op;
    }
}
