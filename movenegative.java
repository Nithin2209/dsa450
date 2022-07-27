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