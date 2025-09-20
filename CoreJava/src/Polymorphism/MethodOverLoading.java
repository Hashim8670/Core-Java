package Polymorphism;


	 class MethodOverLoading{ 
	    void sum(int a , int b){
		  System.out.println(a+b);
		}
		void sum(float	 d, int c ){
		  System.out.println(d+c);
		}
		public static void main(String args[]){
		MethodOverLoading m = new MethodOverLoading();
		  m.sum(10,20);
		  m.sum(20.0f,30);
		 
	}
	
}
