package queue;

import base.StaticStructure;

public class Queue<T> extends StaticStructure<T> {

    public Queue()
	{
		super();
	}
	
	public Queue(int capacity)
	{
		super(capacity);
	}

	public void ToQueue(T element)
	{
		
		this.Add(element);
	}
	public T Spy()
	{
		if(this.IsEmpty())
		{
			return null;
		}
		
		return this.element[0];
		
	}
	

	public T UnQueue(){
		
		final int pos = 0;
		
		if (this.IsEmpty())
		{
			return null;
		}
		
		T removeElement = this.element[pos];
		
		this.Remove(pos);
		
		return removeElement;
		
	}
    
}
