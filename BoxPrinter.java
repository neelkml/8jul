package neel;

public class BoxPrinter<T,T1> {
	private T val;
	private T1 arg2;
	public BoxPrinter(T arg, T1 arg2)
	{
		 this.val=arg;
		 this.arg2=arg2;
	}
	public String toString() {
		return "[" + val + arg2 +"]";
	}
	

}
