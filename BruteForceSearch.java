package week1Exercices;

public class BruteForceSearch {
	
	public static int BruteForceSearch(int[]a, int key) {
		for(int i=0; i<a.length; i++) {
			if(a[i] == key)
				return key;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []b = {1,2,3,4,5,6,7,8,9,10,12,12,34,43,43,54,3,6,6,45};
		System.out.println(BruteForceSearch(b,0));
		
		
	}

}
