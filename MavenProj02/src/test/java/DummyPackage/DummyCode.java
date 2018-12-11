package DummyPackage;

import org.testng.annotations.Test;

public class DummyCode {

	@Test
	public void testDummyNos() {
		
		int a= 100;
		int b= 200;
		int c= 300;
		
		if (a>b & a>c) {
			System.out.println("a is the largest number");
		
		}else if(b>a & b>c) {
			System.out.println("b is the largest number");
		}
		else {
			System.out.println("c is the largest number");
		}
		
	}
	
	@Test
	public void whileLoop() {
		int i=0;
		while(i <=10) {
			System.out.println(i);
			i=i+1;
			
		}
	}
	
	@Test
	public void forLoop() {
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	@Test
	public void preAndPostIncrement() {
		int i=1;
		int j= i++;		//post increment
		
		System.out.println(i);
		System.out.println(j);
		
		int a=1;
		int b=++a;;			//pre-increment
		
		System.out.println(a);
		System.out.println(b);
	}
	
	@Test
	public void arraysSession(){
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		System.out.println(i.length);
		int j;
		for(j=0; j<i.length; j++) {
			System.out.println(i[j]);
			
		}
		
		char c[] = new char[5];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		c[3]='d';
		
		System.out.println(c[2]);
		
		String s[]=new String[3];
		s[0]="Hello";
		s[1]="World";
		s[2]="Program";
		
		System.out.println(s[1]);
		
		//Object array to over come limitations of static array defined above. Object is a Superclass of all the classes: 
		//Used to store different data types. Its a Dynamic Array:
		
		Object objArray[] = new Object[4];
		objArray[0] = "Name";
		objArray[1] = 33;
		objArray[2] = "Altmore";
		objArray[3] = 25.55;
		for(int oa=0; oa<objArray.length; oa++) {
			System.out.println(objArray[oa]);
		}
				
	}
	
	@Test
	public void twoDimensionalArray() {
		
		String twoDArray [][] = new String[2][3];
		System.out.println(twoDArray.length);
		System.out.println(twoDArray[0].length);
		twoDArray[0][0] = "A0";
		twoDArray[0][1] = "B0";
		twoDArray[0][2] = "C0";
		twoDArray[1][0] = "A1";
		twoDArray[1][1] = "B1";
		twoDArray[1][2] = "C1";
		System.out.println(twoDArray[0][1]);
		
		for (int r=0; r<twoDArray.length; r++) {
			for(int c=0; c<twoDArray[0].length; c++) {
				System.out.println(twoDArray[r][c]);
			}
		}
		
	}
	
}
