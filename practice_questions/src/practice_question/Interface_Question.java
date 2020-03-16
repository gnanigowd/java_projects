package practice_java;

interface shape {
	 double pi = 3.14;    
     double calc(double x,double y);    
  }  
class Triangle implements shape{
	public double calc(double x,double y) {
		return (x*y);
	}
}
class rec implements shape{
	public double calc(double x, double y) {
		return(pi*x*x);		
	}	
}
class Test{
	public static void main(String[]args) {
		Triangle t = new Triangle();    
        rec r = new rec();    
        shape s;    
        s = r;    
        System.out.println("Area of Rectangle is : " +s.calc(10,20));    
 
        s = r;    
        System.out.println("Area of Circle is : " + s.calc(15,15));   
	}
}

