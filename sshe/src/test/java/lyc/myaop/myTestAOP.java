package lyc.myaop;

public class myTestAOP {
	
	
	public static void main(String[] args) {
		PersonImpl p1 = new PersonImpl();
		
		 myProxy m1 = new myProxy(p1);
		 Object obj = (Person)m1.GenerateProxyInstnace();
		 Person pInterface = (Person)obj;
		 
		 pInterface.eat();
	}
}
