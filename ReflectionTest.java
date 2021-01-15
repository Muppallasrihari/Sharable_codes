import java.lang.reflect.Modifier;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

	public static void main(String[] args) throws Exception{
		Class c = Class.forName("Employee");
		System.out.println(c);
		System.out.println("Super class : "+c.getSuperclass());
		Class[] classes=c.getInterfaces();
		for(Class cls : classes) {
			System.out.println(cls + " :"+cls.hashCode());
		}
		Field[] fields=c.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field);
		}
		int mod=c.getModifiers();
		System.out.println(mod);
		System.out.println(Modifier.toString(mod));
		
		Constructor[] constructors= c.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.println(constructor + " hashcode :"+constructor.hashCode());
		}
		Method[] methods= c.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method+ " hashcode :"+method.hashCode());
		}
		
		System.out.println("*********");
		Employee employee=new Employee();
		System.out.println(employee);
		

	}

}
