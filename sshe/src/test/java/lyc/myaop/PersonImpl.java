package lyc.myaop;


import org.apache.log4j.Logger;

public class PersonImpl implements Person {
	private static final Logger log = Logger.getLogger(PersonImpl.class);
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		log.error("person walk!");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		log.error("person eat!");
	}

	@Override
	public String toString() {
		return "PersonImpl [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
