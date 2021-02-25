package Reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefMainTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		String operation = "add";
		
		Operations op = new Operations();
		Method m = op.getClass().getMethod(operation);
		
		m.invoke(op);

	}

}
