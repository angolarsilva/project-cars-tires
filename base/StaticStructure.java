package base;

public class StaticStructure <T>
{
	protected T[] element;
	protected int Size;

	public StaticStructure(int capacity)
	{
		this.element=(T[]) new Object[capacity];
		this.Size=0;
		
	}
	public StaticStructure()
	{
		this(12);
	}
	public int Size()
	{
		return Size;
	}
	public boolean Add(T element)
	{
		this.AddCapacity();
		if(this.Size <this.element.length)
		{
			this.element[Size]=element;
			Size++;
			return true;
		}
		return false;
	}
	public boolean IsEmpty()
	{
		return this.Size==0;
	}
	public boolean Add(int pos, T element)
	{
		if (pos < 0 || pos > Size)
		{
			throw new IllegalArgumentException("Posição inválida");
		}
		this.AddCapacity();
		for (int i=this.Size-1; i>=pos; i--){
			this.element[i+1] = this.element[i];
		}
		this.element[pos] = element;
		this.Size++;

		return true;
	}
	public void AddCapacity()
	{
		if (this.Size== this.element.length)
		{
			T[] newElement = (T[]) new Object[this.element.length * 2];
			for (int i=0; i<this.element.length; i++)
			{
				newElement[i] = this.element[i];
			}
			this.element = newElement;
		}
		
	}
	public void Remove(int pos)
	{
		if (!(pos >= 0 && pos < Size))
		{
			throw new IllegalArgumentException("Posicao inválida");
		}
		for (int i=pos; i<Size-1; i++)
		{
			element[i] = element[i+1];
		}
		Size--;
	}
	@Override
	public String toString() 
	{
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for (int i=0; i<this.Size-1; i++){
			s.append(this.element[i]);
			s.append(", ");
		}
		
		if (this.Size>0 )
		{
			s.append(this.element[this.Size-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
}