package auto.from.spring.hello;

public class HelloServiceImpl implements HelloService {

	private String hello;
	
	
	public String getHello() {
		return hello;
	}


	public void setHello(String hello) {
		this.hello = hello;
	}


	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println(hello);
	}

}
