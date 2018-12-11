package DummyPackage;

public class WrapperClassConcepts {
	
	public static void main(String[] args) {
		
		String x="100";
		
		System.out.println(x+20);
		
		//String to Integer
		int i= Integer.parseInt(x);
		System.out.println(i+20);
		
		//String to Double
		String y ="25.15";
		System.out.println(y+10);
		Double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to Boolean
		String z = "true";
		System.out.println(z); 
		boolean b = Boolean.parseBoolean(z);
		System.out.println(b);
		
		//Integer to String
		
		int j = 200;
		System.out.println(j+10);
		String i2s = String.valueOf(j);
		System.out.println(i2s+10);
		
	}

}
