package neel;
import java.util.*;
public class Jugaar <T, U>{
//public static <Car,Pesron> void fill(List <Car> list, List<Person> lists)
	public <T,U> void assignCar(T t,U u)
	{
		Map<T,U> map= new HashMap<T,U>();
		map.put(t, u);
		System.out.println(map);
	}
}
