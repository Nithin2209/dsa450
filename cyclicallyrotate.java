import java.util.Arrays;

public class cyclicallyrotate
{
	static int arr[] = new int[]{1, 2, 3, 4, 5};
	
	// Method for rotation
	static void rotate()
	{
        int n=arr.length;
        int temp=arr[n-1];
        int i;
	for (i = arr.length-1; i > 0; i--)
		arr[i] = arr[i-1];
	arr[0] = temp;
	}
	
	/* Driver program */
	public static void main(String[] args)
	{
		System.out.println("Given Array is");
		System.out.println(Arrays.toString(arr));
		
		rotate();
		
		System.out.println("Rotated Array is");
		System.out.println(Arrays.toString(arr));
	}
}
