
public class Sort {
	
	// bubble --------------------------------------------------
	static void bubble(int[] a){
		for(int i = a.length-1; i>0 ; i--)
			for(int j = 0;j<i;j++)
				if(a[j]>a[j+1])	swap(a,j,j+1);
			
		
		
	}
	static void bubble(int[] a, int p, int q){
		for(int i=q; q>p ; q--)
			for(int j=p;j<i;j++)
				if(a[j]>a[j+1])	swap(a,j,j+1);
	}
	

	// selection --------------------------------------------------
	static void selection(int[] a){
		for(int i = a.length-1;i>0;i--){
			int m = 0;
			for( int j = 1; j<=i; j++)
				if(a[j]>a[m]) m = j;
			swap(a,i,m);
		}
	}
	static void selection(int[] a, int p, int q){
		for(int i = q;i>p;i--){
			int m = p;
			for( int j = p+1; j<=i; j++)
				if(a[j]>a[m]) m = j;
			swap(a,i,m);
		}
	}
	
	
	// insertion --------------------------------------------------
	static void insertion(int[] a){
		for(int i = 1; i<a.length; i++){
			int ai = a[i], j = i;
			for(j=i;j>0&&a[j-1]>ai;j--)
				a[j] = a[j-1];
			a[j] = ai;
		}
	}
	static void insertion(int[] a, int p, int q){
		for(int i = p+1; i<=q; i++){
			int ai = a[i], j = i;
			for(j=i;j>p&&a[j-1]>ai;j--)
				a[j] = a[j-1];
			a[j] = ai;
		}
	}
	
	
	private static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
