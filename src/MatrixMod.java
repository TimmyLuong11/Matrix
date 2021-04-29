import java.util.Arrays;

public class MatrixMod 
{
	
	public static void main(String[] args)
	{
		//Oirginal Matrix
		double[][] A = {{1, 2},{3, 4}};
		
		//Printing out the matrix
		System.out.println("Original Matrix");
		for(double[] i: A)
		{
			System.out.println(Arrays.toString(i));
		}
		System.out.println();
		
		//Finding the det value
		double det = ((A[0][0] * A[1][1]) - (A[0][1] * A[1][0]));
		System.out.println("Determint value: " + det);
		
		//Using the formula for 2x2 inverse matrix
		double totalDet = 1/det;
		System.out.println("Value for finding inverse: " + totalDet);
		double[][] invA = {{A[1][1], -A[0][1]},{-A[1][0], A[0][0]}};
		for (int i = 0; i < 2; i++)
		{
	        for (int j = 0; j < 2; j++)
	        {
	            invA[i][j] = invA[i][j] * totalDet;
	        }
		}
		
		//Printing out the inverse matrix
		System.out.println("\nInverse Matrix");
		for(double[] j: invA)
		{
			System.out.println(Arrays.toString(j));
		}
		
		//Printing out the transpose matrix
		System.out.println("\nTranspose Matrix");
		double[][] transA = {{A[0][0], A[1][0]},{A[0][1], A[1][1]}};
		for(double[] j: transA)
		{
			System.out.println(Arrays.toString(j));
		}
		
		//Finding the row echelon form and printing it out
		System.out.println("\nRow Echelon Form");
		double[][] ref = A;
	    ref[1][0] = A[1][0] - 3*A[0][0];
	    ref[1][1] = A[1][1] - 3*A[0][1];
	    ref[1][1] = ref[1][1]/-2.0;
		for(double[] x: ref)
		{
			System.out.println(Arrays.toString(x));
		}
		
		//Finding the reduce row echelon form and printing it out
		System.out.println("\nReduced Row Echelon Form");
	    double[][] rref = ref;
	    rref[0][1] = A[0][1] - 2*A[1][1];
	    rref[0][0] = A[0][0] - 2*A[1][0];
		for(double[] x: rref)
		{
			System.out.println(Arrays.toString(x));
		}
	}
}
