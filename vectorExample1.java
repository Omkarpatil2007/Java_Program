import java.util.*;
class vectorExample1
{
	public static void main(String[] args)
	{
		Vector<Object> vector= new Vector <>();

      		vector.add(10);
    		vector.add(11);
      		vector.add(12);
      		vector.add(13);
      		vector.add(14);
      
      		System.out.println("Display Vector:"+vector);

		System.out.println("Element at index:1"+vector.get(1));
		System.out.println(vector.set(2,20));

		System.out.println("Remove 2nd Element"+vector.remove(1));
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		vector.clear();
   	}
}