package multiplearray;

public class JaggedArray {

	public static void main(String[] args) {
		int [][]a =new int [3][];
		a[0]=new int [2];
		a[1]=new int [3];
		a[2]=new int [1];
		
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=20;
		a[1][1]=50;
		a[1][2]=80;
		
		a[2][0]= 10;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");

			}
			System.out.println();
		}
		
		 
	}

}
