//main logic 
int getMinDiff(int[] arr, int n, int k) {
        int min =0, max =0, ans =0;
        Arrays.sort(arr);
        ans = arr[n-1]-arr[0];
        for(int i =1;i<n;i++){
           if(arr[i]>=k){
            max = Math.max(arr[n-1]-k,arr[i-1]+k);
            min = Math.min(arr[i]-k,arr[0]+k);
            ans = Math.min(ans,max-min);
           }
          
        }
        return ans;
    }
}
