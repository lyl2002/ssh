package lyc.service.impl;

import lyc.service.IUserService;

import org.apache.commons.logging.impl.LogKitLogger;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;



@Service(value="userService")
public class UserServiceImpl implements IUserService {
	private static final Logger log = Logger.getLogger(UserServiceImpl.class);
	@Override
	public void myservice() {
		// TODO Auto-generated method stub
//		logger
		log.error("aaaaaaaaaaaaaaaaaaaa");
		//System.out.print("aaaaa");
	}

}
