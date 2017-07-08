package neel;

public class BoxPrinterTest {

	public static void main(String args[])
	{
		/*BoxPrinter<Integer> value1 =new BoxPrinter<Integer>(new Integer(10));
		System.out.println(value1); 
		BoxPrinter<String> value2 = new BoxPrinter<String>("Hello World");
		System.out.println(value2); */
		BoxPrinter<Car, Integer> value3 =new BoxPrinter<Car,Integer>(new Car("a","b","c"),new Integer(8));
		System.out.println(value3);
		BoxPrinter<Car, Integer> value4 =new BoxPrinter<>(new Car("a","b","c"),new Integer(7));
		System.out.println(value4);

		
		
	}
	
	
}
