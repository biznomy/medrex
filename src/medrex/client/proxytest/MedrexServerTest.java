package medrex.client.proxytest;

import java.lang.reflect.Method;

public class MedrexServerTest {

	public Object call(String className, String method, Object args[]) {
		boolean flag = false;
		try {
			Class c = null;

			try {
				if (!className.equalsIgnoreCase("")) {
					c = Class.forName(className);
				}
			} catch (Exception e1) {

			}
			if (c == null) {
				try {
					c = Class.forName("medrex.client.proxytest.Dao");
					flag = true;
				} catch (Exception e2) {

				}
			}

			Method m = null;

			Class[] par = new Class[args.length];
			for (int i = 0; i < args.length; i++) {
				if (flag == true) {
					par[i] = (new Object()).getClass();
				} else {
					par[i] = args[i].getClass();
				}
			}
			try {
				m = c.getMethod(method, par);
				System.out.println(m);
				m.invoke(c.newInstance(), args);
			} catch (Exception e3) {

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
