package medrex.client.proxytest;

public class FormTest {
	
	public static void main(String args[]){
		MedrexServerTest m = new MedrexServerTest();
		m.call("", "save", new Object[]{new Integer(2)});
	}

}
