package lyc.myaop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.apache.log4j.Logger;

public class myProxy{
	
	private Object obj;
	private static final Logger log = Logger.getLogger(myProxy.class);
	
	public myProxy(Object obj) {
		super();
		this.obj = obj;
	}
	
	public Object GenerateProxyInstnace(){
		
		InvocationHandler h = new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				log.error("kashiaaaaa!");
				// TODO Auto-generated method stub
				Object objtmp = method.invoke(obj,args);
				log.error("jieshuaaaaa!");
				return objtmp;
			}
		};
		
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), h);
	}

}
