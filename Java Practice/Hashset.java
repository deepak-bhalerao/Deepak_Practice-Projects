import java.util.Arrays;
import java.util.LinkedList;


public class Hashset {
	void display()
	{
	LinkedList<Integer> a=new LinkedList<Integer>(Arrays.asList(2,4,6,8,0,4));
	System.out.println("Array is:"+a);
	a.add(10);
	a.addFirst(9);
	System.out.println("Getting 1st Element:"+a.getFirst());
	System.out.println("Array is:"+a);
	if(a.contains(4))
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("No");
	}
	System.out.println("Index of 6:"+a.indexOf(6));
	
	System.out.println("Hash code:"+a.hashCode());
	System.out.println("It is equal:"+a.equals(5));
	System.out.println("Last Index:"+a.lastIndexOf(4));
	System.out.println("Size of List:"+a.size());
	System.out.println("String:"+a.toString());
	System.out.println("Clone:"+a.clone());
	System.out.println("Array is:"+a);
	System.out.println("Get Last:"+a.getLast());
	System.out.println("Peek:"+a.peek());
	System.out.println("Array is:"+a);
	System.out.println("Peek first:"+a.peekFirst());
	System.out.println("Array is:"+a);
	System.out.println("Peek last:"+a.peekLast());
	System.out.println("Array is:"+a);
	System.out.println("Poll:"+a.poll());
	System.out.println("Array is:"+a);
	System.out.println("Pool first:"+a.pollFirst());
	System.out.println("Array is:"+a);
	System.out.println("Poll last:"+a.pollLast());
	System.out.println("Array is:"+a);
	System.out.println("Pop:"+a.pop());
	System.out.println("Array is:"+a);
	System.out.println("Remove:"+a.remove());
	System.out.println("List:"+a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashset he=new Hashset();
		he.display();
	}

}
