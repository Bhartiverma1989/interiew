package multiplearray;

public class MatrixArray {

	public static void main(String[] args) {
	
		int [][]a= {{10,20,30},{8,9,7}};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] +" " );
			}
			System.out.println();
		}
		System.out.println(a.length);
	}

}
