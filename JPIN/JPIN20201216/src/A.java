import java.util.Date;

public class A {
	String name;
	Date date;

	A(Date date){
		this.date = date;
	}

	public void sayHello(){
		System.out.println("Hello, I'm " + name);

	}
}
