package LESSON8.prob1;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import java.sql.ResultSet;
import java.util.Arrays;

public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	// Add an element in last
	public void add(String s) {
		 if(s==null) return;// throw new NullPointerException();
		 //Check for Array is Full
		 if (size == strArray.length)
			resize(); // Array is full
		// Add at the end of the list.
		strArray[size] = s;
		size++; // Increment index to insert the new elements
		// strArray[size++] = s;
	}

	public String get(int i) {
		if (i < 0 || i > size - 1) {
			// throw new IndexOutOfBoundsException("Invalid index i" + i);
			return null;
		}
		return strArray[i];
	}

	public boolean find(String s) {
		if (s == null)
			return false;
		for (int i = 0; i < size; i++)// for (String test: strArray)
		{
			if (s.equals(strArray[i]))
				return true;

		}
		return false; // The element is not in the list
	}

	/* 1. Using System.arrayopy()
	  public void insert(String s, int pos){
	     if(pos > size-1 || pos<0 )
	         return;//allowed to add 0 to size-1
	  if(s==null) return;
	  if(pos == strArray.length) {
	      resize();
	   }
	  String[] temp = new String[strArray.length];
	   System.arraycopy(strArray,0,temp,0,pos); // src, spos,des,dspos,number of elements temp[pos] = s;
	    temp[pos] = s;
	  System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);// count =size - pos

	  strArray = temp;
	  ++size;
	   }
	 */
	/* 2. Without Temp array
	// Shift elements to the right to make space for the new element
        for (int i = size; i > pos; i--) {
            array[i] = array[i - 1];
        }
        // Insert the new element
        array[pos] = s;
        size++;
    }

	 */
	// can insert the elements 0 to size position
	public void insert(String s, int pos) {
		if (pos < 0 || pos > size)
			return;
		// If the array gets full
		if (size == strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length];

		for (int i = 0; i < pos; i++)
			temp[i] = strArray[i];
		temp[pos] = s;

		for (int i = pos + 1; i < size; i++)
			temp[i] = strArray[i - 1];

		strArray = temp;
		++size;
	}

	public boolean remove(String s) {
		if (size == 0)
			return false; // the list is empty
		if (s == null)
			return false;
		int index = -1;
		for (int i = 0; i < size; ++i) {
			if (strArray[i].equals(s)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return false; // s is not found in the list
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray, 0, temp, 0, index);
		System.arraycopy(strArray, index + 1, temp, index,
				strArray.length - (index + 1));
		strArray = temp;
		--size;
		return true;
	}

	private void resize() {
		System.out.println("resizing");
		int len = strArray.length;// Original array length
		int newlen = 2 * len; // Twice the original length
		// String[] temp = new String[newlen];
		// System.arraycopy(strArray,0,temp,0,len);
		// strArray = temp;
		strArray = Arrays.copyOf(strArray, newlen);

	}

	public String toString() {
		if(size == 0) return "[ ]";
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(strArray[i] + ", ");
		}
		sb.append(strArray[size - 1] + "]");
		return sb.toString();
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		/*
		 * if(size==0) return false; else return true;
		 */
		return (size == 0);
	}
	/**--------------------------HomeWork---------------------------------*/
	public int indexOf(String s) {
		if (strArray.length == 0 || s == null) return -1;
		for (int i = 0; i < strArray.length - 1; i++) {
			if (s.equals(strArray[i])) {
				return i;
			}
		}
		return -1;
	}
	public String removeAt(int index) {
		if (strArray == null || strArray.length == 0) return null;
		if (index < 0 || index > size-1) return null;
		String r = strArray[index];
		remove(r);
		return r;
	}
	public void clear() {
		if (strArray == null) return;
		for (int i = 0; i < size; i++) {
			strArray[i] = null;
		}
		size = 0;
	}
	public void set(int index, String s){
		if(strArray == null || s == null) return ;
		for(int i =0; i < size; i++){
			if(i == index){
				strArray[i] = s;
			}
		}
	}
	public boolean containsAll(MyStringList other){
		if(strArray == null || other == null) return false;
		for(int i = 0; i < other.size; i++){
			if(this.find(other.strArray[i])){
				return true;
			}
		}
		return false;
	}
	public MyStringList subList(int start, int end){
		MyStringList temp = new MyStringList();
		if(strArray == null || start < 0 || end > size || start>=end) return null;
		for(int i = start; i < end; i++){
			temp.add(strArray[i]);
		}
		return temp;
	}
	/**--------------------------HomeWork---------------------------------*/

	public static void main(String[] args) {
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		MyStringList l2 = new MyStringList();
		l.add("Bob");
		l.add("Liya");
		l.add("Tonya");
		MyStringList l3 = new MyStringList();
		l3.add("Tonya");
		l3.add("Renuka");
		l3.add("Tom");
		l3.add("Mohanraj");
		l3.add("Steve");
		l3.add("Bob");
		l3.add("Liya");

		l.insert("Renuka", 4); // Position reached the length
		l.insert("Mohanraj", 5); // Position reached the length
		System.out.println(l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.insert("Richard", 3);
		System.out.println("The list of size " + l.size() + " after inserting Richard into pos 3 is " + l);
		l.insert("Tonya", 0);
		System.out.println("The list of size " + l.size() + " after inserting Tonya into pos 0 is " + l);
		System.out.println(l.find("Susan"));
		// String[] x = (String[]) l.clone();
		// System.out.println(Arrays.toString(x));
		System.out.println("----------------Home-Work---------------");
		System.out.println(l);
		System.out.println("Index of Susan-> " + l.indexOf("Susan"));
		System.out.println("Index of Liya-> " + l.indexOf("Liya"));
		System.out.println("Removed-> " + l.removeAt(2));
		l.set(3,"Tom");
		System.out.println("After set-> " + l);
		System.out.println(l.containsAll(l2));
		System.out.println(l.containsAll(l3));
        MyStringList s = l.subList(0,3);
		System.out.println("Sublist-> " + s);
		l.clear();
		System.out.println("Size after cleared-> " + l.size());
		System.out.println(l);
	}
}
