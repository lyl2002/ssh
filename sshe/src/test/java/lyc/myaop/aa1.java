package lyc.myaop;

public class aa1 {
	public Person p1 = new PersonImpl();
	
	private String a1 = "aaaaaaaaa";
	
	public Person getP1() {
		return p1;
	}

	public void setP1(Person p1) {
		this.p1 = p1;
	}

	public String getA1() {
		return a1;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}

	public void aa()
	{
		System.out.println(p1);
		
	}
}
