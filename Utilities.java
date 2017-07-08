package neel;

import java.util.List;

import javax.swing.text.Utilities;

import java.util.ArrayList;
class Utilties
{
public static <T> void fill(List<T> list, T val)
{
for(int i=0;i<list.size(); i++)
list.set(i,val);
}
}
class UtilitiesTest{
public static void main(String args[])
{
List<Integer> intList=new ArrayList<Integer>();
intList.add(10);
intList.add(20);
System.out.println("The original list is:" + intList);
Utilties.fill(intList,100);
System.out.println("The list after calling Utilities.fill() is:" + intList);
}
}
