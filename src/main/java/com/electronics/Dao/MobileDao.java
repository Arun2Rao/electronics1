package com.electronics.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.electronics.Repository.MobileRepository;
import com.electronics.entity.Mobile;
@Repository
public class MobileDao {
	@Autowired
	MobileRepository mr;

	public String setMobile(Mobile mobile) {
		
		 mr.save(mobile);
		 return "saved";
	}

	public String setAllmobile(List<Mobile> mobile) {
		mr.saveAll(mobile);
		return "Success";
	}

	public List<Mobile> getMobile() {
	
		return mr.findAll();
	}


	public List<Mobile> getbybrand(String b) {
		// TODO Auto-generated method stub
		return mr.getbybrand(b);
	}
	

}
