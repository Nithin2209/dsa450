import java.util.*;
class kthlargest{
    public static int kthlargest(int arr[],int k){
        PriorityQueue<Integer> minheap=new PriorityQueue<Integer>();
        for(int i:arr){
                 minheap.add(i);
                 if(minheap.size()>k){
                    minheap.remove();
                 }
        }
        return minheap.remove();
    }
    public static void main(String[] args){
        int arr[]={1,5,6,7,8,9};
       int result= kthlargest(arr,3);
        System.out.println(result);

    }
}