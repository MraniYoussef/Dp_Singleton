package dp.singleton;

public class Singleton {
	private static Singleton singleton;
	private static int count;
	private Singleton(){
				
	}
	
	public static Singleton getInstance() {
		
		if(singleton==null) {
			singleton=new Singleton();
			count();
		}
			return singleton;
		
	}

	public static void count() {
		count++;
		System.out.println(count);
		 
	}
	

	

	
	
}
