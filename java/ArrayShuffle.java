import java.util.Arrays;
import java.util.Random;

public class ArrayShuffle {
	void shuffle(int[] a)
	{
		Random r=new Random();
		for(int i=a.length-1;i>0;i--)
		{
			int j=r.nextInt(i+1);
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrayshuffle as=new Arrayshuffle();
		int a[]={1,2,3,4,5,6,7,8};
		System.out.println("Original array:"+Arrays.toString(a));
		as.shuffle(a);
		System.out.println("shuffle array:"+Arrays.toString(a));

	}

}
/*Output
Original array:[1, 2, 3, 4, 5, 6, 7, 8]
shuffle array:[5, 8, 1, 4, 6, 2, 7, 3]
*/