/*
	
	Name	:		Aayush Sarva
	Roll No.:		Y12UC003
	Date	:		September 19, 2014

	OOPS Course Assignment

	Description :
	Implement own ArrayList class in Java without using Collections Framework. 

*/

import java.util.*;

public class MyArrayList
{
	//Methods:
		//void add(int index, Object obj)
		//Object remove(int index)
		//Object get(int index)
		//Object set(int index, Object obj)
		//int size()

	Object[] arr;
	int arr_size = 0;

	//Default Constructor
	public MyArrayList()
	{
		arr = new Object[10];
	}

	//Parameterized Constructor
	public MyArrayList(int init_size)
	{
		arr = new Object[init_size];
	}

	//Return actual array size
	public int size()
	{
		return arr_size;
	}

	//Adds object at specified index
	public void add(int index, Object obj)
	{
		if(index<0 || index>=arr.length)
			throw new ArrayIndexOutOfBoundsException();
		else
		{
			if(arr.length - arr_size  <= 2)
			{
				this.increaseSize();
			}

			int i;
			for(i=arr_size;i>=index;i--)
			{
				arr[i+1]=arr[i];
			}

			arr[index]=obj;
			arr_size++;
		}
	}

	public Object remove(int index)
	{
		if(index < 0 || index >= arr.length)
			throw new ArrayIndexOutOfBoundsException();
		else
		{	
			Object temp=arr[index];
			
			int i;
			for(i=index; i < arr_size -1; i++)
			{
				arr[i] = arr[i+1];
			}

			arr[i]=null;
			arr_size--;

			return temp;
		}
	}

	public void increaseSize()
	{
		arr = Arrays.copyOf(arr, arr.length + 10);//Increment in size by 10 
	}

	public Object get(int index)
	{
		if(index<0 || index>=arr.length)
			throw new ArrayIndexOutOfBoundsException();
		else
			return arr[index];
	}

	public void set(int index, Object obj) 
		throws ClassCastException
	{
		if(index<0 || index>=arr.length)
			throw new ArrayIndexOutOfBoundsException();
		else
			arr[index] = obj;
	}

	//Driver method : main
	public static void main(String args[])
	{
        MyArrayList mylist = new MyArrayList();

        mylist.add(0,new Integer(10));
        mylist.add(1,new Integer(20));
        mylist.add(2,new Integer(30));
        mylist.add(3,new Integer(40));
        mylist.add(4,new Integer(50));

        //System.out.println(mylist.size());
        for(int i=0;i<mylist.size();i++)
        {
            System.out.print(mylist.get(i)+" ");
        }

        mylist.add(5,new Integer(60));
  
        System.out.println("\nElement at Index 5:"+mylist.get(5));
        System.out.println("List size: "+mylist.size());
        System.out.println("Removed element at index 3: "+mylist.remove(3));
        //System.out.println(mylist.size());
        for(int i=0;i<mylist.size();i++){
            System.out.print(mylist.get(i)+" ");
        }
        System.out.println();
    }	

}
