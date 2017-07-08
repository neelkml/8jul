import java.util.ArrayList;

public class GenericTest {
public static void main(String args[])
{
ArrayList list=new ArrayList();	
list.add("car");
list.add("1");
list.add(new Person());
System.out.println(list);
}
}
