import java.util.*;
public class movenegative{
    public static void move(int arr[]){
        Arrays.sort(arr);

    }
    public static void main(String[] args){
        int arr[]={1,-1,3,-5,-6,7,8,92,3};
        move(arr);
        for(int i:arr){
            System.out.print(i+ "");
            System.out.println();
        }
    }
}

import java.util.*;
 class movenegative{
    static void rearrange(int arr[],int n){
        int j=0;
        int temp;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                if(i !=j){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
                
            }
        }
    }
    static void printArray(int arr[], int n){
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

        public static void main(String[] args){
            int arr[]={ -1, 2, -3, 4, 5, 6, -7, 8, 9 };
            int n=arr.length;
            rearrange(arr,n);
            printArray(arr,n);


        }       
        
    
}
