class Question3{
	
	int top1=-1;
	int top2=10;
	int[] a=new int[10];
	
	boolean isempty1(){
	if(top1==-1)
	return true;
	return false;
	}
	
	boolean isempty2(){
	if(top2==10)
	return true;
	return false;
	}
	
	boolean isfull1(){
		if(top1==4)
		return true;
		return false;
	}
	boolean isfull2(){
		if(top2==5)
		return true;
		return false;
	}
	
	void push1(int n){
	if(isfull1())
	System.out.println("Stack  1 is full ");
	else{
		
		a[++top1]=n;
		
	}
	}
	
	void push2(int n){
	if(isfull2())
	System.out.println("Stack 2 is full ");
	else{
		
		a[--top2]=n;
		
	}
	}
	
	
	void peek(){
	System.out.println("\npeeked element from stack 1 is "+a[top1]);
	System.out.println("\npeeked element from stack 2 is "+a[top2]);
	}
	
	void pop1(){
		if(isempty1())
			System.out.println("Stack 1 is empty ");
		else
			top1--;
	}
	void pop2(){
		if(isempty2())
			System.out.println("Stack 2 is empty ");
		else
			top2++;
	}

	public static void main(String args[]){
	
	Question3 q=new Question3();
	q.push1(5); 
	q.push2(10); 
	q.push2(15); 
	q.push1(11); 
	q.push2(7); 
	q.push2(40);
	q.peek();

	
	
	
	}
}