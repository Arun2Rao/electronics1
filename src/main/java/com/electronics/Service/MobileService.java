package com.electronics.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronics.Dao.MobileDao;
import com.electronics.entity.Mobile;

@Service

public class MobileService {

	@Autowired
	MobileDao md;
	
	public String setMobile(Mobile mobile) {
		
		return md.setMobile(mobile) ;
	}

	public String setAllmobile(List<Mobile> mobile) {
		
		return md.setAllmobile(mobile);
	}

	public List<Mobile> getMobile() {
		
		return md.getMobile();
	}

	

	public List<Mobile> getbybrand(String b) {
		// TODO Auto-generated method stub
		return md.getbybrand(b);
	}
 

}
