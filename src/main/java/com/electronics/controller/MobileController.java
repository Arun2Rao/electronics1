package com.electronics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.Service.MobileService;
import com.electronics.entity.Mobile;
@RestController
@RequestMapping(value = "/mob")
public class MobileController {
	@Autowired
	MobileService ms;
	@PostMapping(path="/setMobile")
public String setMobile(@RequestBody Mobile mobile) {
		return ms.setMobile(mobile);
	}
	
	@PostMapping(path="/setAllmobile")
	public String setAllmobile(@RequestBody List<Mobile>mobile) {
	
	return ms.setAllmobile(mobile);
}
	@GetMapping(path= "/getMobile")
	public List<Mobile> getMobile(){
		return ms.getMobile();
	}
	@GetMapping(path="/getbybrand/{b}")
	public List<Mobile>getbybrand(@PathVariable String b) {
		
		return ms.getbybrand(b);
	}
			
}