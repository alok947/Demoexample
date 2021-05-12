import java.util.ArrayList;

/* An array having multiple duplicate values. Print the vales with distintion and print how many 
 * times it is present in the array.
 */


public class AmazonAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,4,5,5,6,4,5,9};
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		for(int i=0; i<a.length; i++)
		{
			int k=1;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				for(int j=i+1; j<a.length; j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				
			System.out.println("The distnict array is: "+a[i]+"is present "+k+"times");
			}
			
		}
		
		System.out.println(al);
	}

}
