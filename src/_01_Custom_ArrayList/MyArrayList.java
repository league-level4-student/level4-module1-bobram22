package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class MyArrayList <T>{
	private T[] list;
	
	public MyArrayList() {
		list = (T[])new Object[1];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {	
		return list[loc];
	}
	
	public void add(T val) {
		T[] temp = (T[]) new Object[list.length+1];
		for(int i = 0; i < list.length; i++) {
			temp[i] =list[i];
		}
		temp[list.length]=val;
		list=temp;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] temp = (T[]) new Object[list.length+1];
		for(int i = 0; i < list.length; i++) {
			if(i<loc) {
				temp[i] = list [i];
			}
			else if(i==loc) {
				temp[i]=val;
			}
			else {
				temp[i]=list[i-1];
			}
		}
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		list[loc]=val;
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] temp = (T[]) new Object[list.length-1];
		for(int i=0; i<list.length;i++) {
			if(i<loc) {
				temp[i]=list[i];
			}
			else if(i>loc) {
				temp[i-1]=list[i];
			}
			list[i]=temp[i];
		}
	}
	
	public boolean contains(T val) {
		boolean c = false;
		for(int i = 0;i<list.length;i++) {
			if(list[i].equals(val)) {
				c= true;
			}
			else {
				c=false;
			}
		}
		return c;
		
	}
}