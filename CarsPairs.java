package neel;
public class CarsPairs<T> {
	private T value;
	private T value1;
	public CarsPairs(T value,T Value1)
	{
		this.value=value;
		this.value1=value1;
	}
	public void Printpair()
	{
		System.out.println(value);
		System.out.println(value1);
	}

}
