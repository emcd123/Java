public class Array implements List{

	private Object[] array;
	private int length;

	public Array(int length){
		this.length = length;
		array = new Object[length];
	}
			
	public void add(Object o,int index){
		array[index]= o;	
	}
	
	public Object get(int index){
		return array[index];
	}

	public void remove(int index){
		array[index]= null;
	}

	public int size(){
		return length;
	}	
}
