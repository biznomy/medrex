package medrex.client.proxytest;

public class Dao {
	
	public void save(Object o){
		System.out.println("Save in DAO" + o.getClass());
		
	}

}
