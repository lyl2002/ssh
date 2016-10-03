package lyc.service.impl;

import lyc.service.IUserService;

import org.springframework.stereotype.Service;
@Service(value="userService")
public class UserServiceImpl implements IUserService {

	@Override
	public void myservice() {
		// TODO Auto-generated method stub
//		logger
		System.out.print("aaaaa");
	}

}
