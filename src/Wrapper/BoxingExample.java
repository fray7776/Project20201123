package Wrapper;

public class BoxingExample {
	public static void main(String[] args) {

		int value1 = Integer.parseInt("10");
		double value2= Double.parseDouble("33.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
	
		System.out.println("[-128~127 초기값일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==결과:" + (obj1 == obj2));
		System.out.println("언박싱후 ==결과"+(obj1.intValue()==obj2.intValue()));
		System.out.println("equals() 결과: "+ obj1.equals(obj2));
		System.out.println();
		
		System.out.println("[-128~127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과:" + (obj3 == obj4));
		System.out.println("언박싱후 ==결과"+(obj3.intValue()==obj4.intValue()));
		System.out.println("equals() 결과: "+ obj3.equals(obj4));
		System.out.println();
		
		int v1= Math.abs(-5);
		double v2= Math.abs(-3.14);
		System.out.println("v1= "+ v1);
		System.out.println("v2= "+v2);
		
	}

}
