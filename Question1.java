class Question1{
	void sort(int[] a,int n){
		int max=a[n-1];
		int temp;
		for(int i=0;i<n;i++){
		temp=a[max];
		for(int j=1;j<n;j++){
			if(a[i]>max)
			max=a[i];
		
			}
			a[max]=temp;
			for(int m=0;m<n;m++){
			System.out.print(a[m]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String args[]){
	int [] a={2,4,6,8,3};
	int n= a.length;
	Question1 q=new Question1();
	q.sort(a,n);
	
	}
}