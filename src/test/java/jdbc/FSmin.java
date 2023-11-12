package jdbc;

public class FSmin {

	public static void main(String[] args) {
		// Create an integer array with values 12, 13, 14, 15, 16
		int [] a= {12,13,13,15,16};
		
		// Initialize fmin (first minimum) and smin (second minimum) with the first element of the array
		int fmin=a[0];
		int smin=a[0];
		
		// Iterate through each element of the array
		for(int i=0;i<a.length;i++) {
			// Check if the current element is less than fmin (first minimum)
			if(a[i]<fmin) {
				// If the current element is not equal to fmin, update smin with the value of fmin
				if(a[i]!=fmin) {
					smin=fmin;
				}
				// Update fmin with the current element
				fmin=a[i];
			}
			// If smin is equal to fmin or greater than the current element, update smin with the current element
			else if(smin==fmin||a[i]<smin) {
				smin=a[i];
			}
		}
		
		// Print the first minimum and second minimum values
		System.out.println(fmin+" "+smin);
	}
}
