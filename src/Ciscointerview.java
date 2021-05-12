/*2 4 5 
 *3 4 7
 *1 2 9
 *Print the maximum number from the row which has smallest number
 */


public class Ciscointerview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int min=b[0][0];
		int max=b[0][0];
		int x=0;
		int y=0;
		
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(b[i][j]<min)
				{
					min=b[i][j];
					x=i;
					y=j;
					
				}
			}
		}
		
		for (int k=0; k<=x; k++)
		{
			for(int l=0; l<=y;l++)
			{
				if(b[k][l]>max)
				{
					max=b[k][l];
					
				}
			}
		}
		System.out.println("The maximum number for the row is "+ max);
	}

}
