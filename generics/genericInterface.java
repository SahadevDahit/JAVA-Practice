package generics;


public class genericInterface<T> implements ContainerInterface<T>{
		private T item;
	
	@Override
	public void add(T item) {
		// TODO Auto-generated method stub
		this.item=item;
		
	}

	@Override
	public T getdata() {
		// TODO Auto-generated method stub
		return this.item;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genericInterface gf=new genericInterface();
		gf.add("John");
	
		System.out.println(gf.getdata());

	}
}
