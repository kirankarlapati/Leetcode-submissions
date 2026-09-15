class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        int n=a.length;
        int[] res=new int[n-k+1];
        int x=0;
        for(int i=0;i<a.length;i++){
            while(!dq.isEmpty() && dq.peekFirst()<=i-k) dq.pollFirst();
            while(!dq.isEmpty() && a[dq.peekLast()]<=a[i]) dq.pollLast();
            dq.offerLast(i);
            if(i>=k-1) res[i-k+1]=a[dq.peekFirst()];
        }
        return res;
    }
}