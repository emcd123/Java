public class ArrayTest{
	public static void main(String[] args){
		Array array = new Array(3);

		array.add(new Integer(4),0);
		array.add(new Integer(5),1);
		array.add(new Integer(10),2);

		for(int i=0; i<array.size(); i++){
			System.out.println(array.get(i));
		}

		array.remove(0);
		array.remove(1);
		array.remove(2);	

		array.add(new Double(4.5),0);
		array.add(new Double(1.3),1);
		array.add(new Double(10.2),2);

		for(int i=0; i<array.size(); i++){
			System.out.println(array.get(i));
		}
	}
}
	
