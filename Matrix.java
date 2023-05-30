package week1Exercices;

public class Matrix {
	
	//private double[]x;
	//private double []y;
	
	//dot product vectors
	static double dot(double[]x, double[]y) {
		if(x.length != y.length)
			throw new IllegalArgumentException("Input arrays must have the same length");
		
		double sum = 0.0;
		for(int i = 0; i<x.length; i++) {
			 sum += x[i]*y[i];
		}
		return sum;
		
	}
	
	//matrix-matrix product
	static double [][] mult(double[][]a, double[][]b){
		if(a[0].length != b.length)
			throw new IllegalArgumentException("Rule for matrix-matrix product: must be m X n * n X m");
		
		
		/*double sum = 0.0;
		for(int i =0; i<a.length;i++) {
			sum += a[0][i]* b[0][i];
			
		}*/
		int mVal = a.length;
		int nVal = b[0].length;
		double [][] result = new double [mVal][nVal];
			
		for(int i = 0; i<mVal; i++) {
			double sum = 0.0;
			for(int j= 0; j<nVal; j++) {
				for(int k = 0; k < a[0].length; k++) {
					result[i][j] += a[i][k]  * b[k][j];
					
				}
				
			}
		}
		return result;
		
	}
	
	public static double [][] transpose(double[][]a){
		
		int mVal = a.length;
		int nVal = a[0].length;
		double [][]temp = new double[nVal][mVal];
		for(int i = 0; i<mVal; i++)
			for(int j= 0; j<nVal; j++) {
				temp[j][i] = a[i][j];
			}
		return temp;
	}
	
	
	public static void main(String[] args) {
		double []x = {1,2,3};
		double[]y = {1,2,3};
		dot(x,y);
		//System.out.println(dot(x,y));
		
		double[][] a = {
	            {3.0, 1.0, 4.0}
	        };
	        
	        double[][] b = {
	            {4, 3},
	            {2, 5},
	            {6, 8}
	        };
	        
	        double[][] result = mult(a, b);
	        
	        // Print the resulting matrix
	        for (int i = 0; i<result.length; i++) {
	            for (int j = 0; j<result[0].length; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	        double [][] matrix = 	{{1,-2},
	                             	{3,0},
	                             	{7,5}};
	        int mVal = matrix.length;
			int nVal = matrix[0].length;
			
			System.out.println("m is "+mVal); //3
			System.out.println("n is "+nVal); //2
			
	       double [][] mat = transpose(matrix);
	       
	        
	        // print transpose matrix 
	        for (int i=0; i<mat.length;i++) {
	        	 for (int j = 0; j<mat[0].length; j++) {
		                System.out.print(mat[i][j] + " 	");
		            }
		            System.out.println();
	        }
		
		
	}

}


