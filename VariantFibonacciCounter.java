/*Given that each recursive call adds a new layer to the stack, 
 * #1 how might the skipping and multiplication operations impact 
 * memory usage in your program?
 * 
 * it is important to understand that in the program below, the skipping operation 
 * which in this case is used to prevent further recursive calls is determined by n<6. In this
 * particular instance, since there is no recursive calls, each time the condition is met, 1 is returned
 * and the counter increases. We can therefore understand that the memory remains relatively 
 * stable since no further recursive calls are being executed. Memory will stay stable and will
 * not increase significantly as n grows.
 * 
 * Now for the multiplication operations, there is a clear impact on memory. This is due to the fact that the following operations
are recursive calls that add layers onto the stack which in returns takes up memory space. Since there is more than one recursive call
recursive calls grow exponentially. In this case, as n grows, memory will also grow due to the exponential growth of the stack.

#2
 As the size of the input sequence grows, how do you anticipate the runtime 
of your program to scale? Explain why.

As Mentionned in the question above, the Fibonacci sequence we built makes multiple recursive calls
This means that there is exponential growth. As n becomes bigger, the number of recursive calls becomes
much bigger. For example, after running a few experiments and plotting a graph, I found that when n =1, there is only one call, 
when n = 9, there are 21 calls, when n=10, there 30 calls, when n = 11, there is 43 calls.which clearly is an 
exponential function. In my case, the recursive call is being made 4 times (VariantFibonacciCounter(n-6)+2*VariantFibonacciCounter(n-5) + VariantFibonacciCounter(n-4) + VariantFibonacciCounter(n-3))
which means that the exponential growth is translated by an exponential increase in runtime.


*/

package comp352.datastructures;

public class VariantFibonacciCounter {
	
	static int ctr= 0;
	
	public static int VariantFibonacciCounter(int n) {
	
		if(n<6) {
			ctr++;
			return 1;	
		}
		else {
			ctr++;
			return VariantFibonacciCounter(n-6)+2*VariantFibonacciCounter(n-5) + VariantFibonacciCounter(n-4) + VariantFibonacciCounter(n-3);
		//return VariantFibonacciCounter(n-(n+1))+2*VariantFibonacciCounter(n-(n+2)) + VariantFibonacciCounter(n-(n+3)) + VariantFibonacciCounter(n-(n+4));
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		for (int i = 0; i < n; i++) 
            System.out.print(VariantFibonacciCounter(i) + " ");
		System.out.println("\nCalls: "+ctr);
		
	}

}
