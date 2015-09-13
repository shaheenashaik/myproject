/**
 * 
 */
package com.first.action;

/**
 * @author prakesh
 *
 */
public class TestAction {
	/**
	 * @author prakesh
	 * @param value
	 * @return it return the output of that method
	 */
	public int test(int value)
	{
		System.out.println("hai");
		return 5;
		
	}
	public String sha(String h)
	{
		System.out.println("this is mew program");
		return h;
	}
	
	public static void main(String[] args) {
		TestAction t=new TestAction();
		System.out.println(t.test(5));
		System.out.println(t.sha("im"));
		
		
	}

}
