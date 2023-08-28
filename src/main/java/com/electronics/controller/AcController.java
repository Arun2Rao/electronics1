package com.electronics.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.Service.AcService;
import com.electronics.entity.Ac;
@RestController
public class AcController {
	@Autowired
	AcService as;
	@PostMapping(value="/setAc")
	public String setAc(@RequestBody Ac ac) {
		return as.setAc(ac);
	}
	
	@PostMapping(value="/setAllac")
	public String setAllac(@RequestBody List<Ac> ac) {
		return as.setAllac(ac);
		
		
	}
	@GetMapping(value="/getAllac")
public List<Ac> getAllac(){
		return as.getAllac();
		
	}
	
	@GetMapping(value="/getbyid/{x}")
	public Ac getbyid(@PathVariable int x){
		return as.getbyid(x);
	}
	@DeleteMapping(value="/delete/{id}")
	public String delete(@PathVariable int id) {
	return as.delete(id);
}	
	@GetMapping(value="/getbybrand/{b}")
	public List<Ac>getbybrand(@PathVariable String b){
		return as.getbybrand(b);
		
	}
	@GetMapping(value="/getBrandByColor/{c}")
	public List<String> getBrandByColor(@PathVariable String c){
		return as.getBrandByColor(c);
	}
	@GetMapping(value="/getMax")
	public Ac getMax() {
		return as.getMax();
	} 
	@GetMapping(value="/getReducedAc/{d}")
	public  List <Ac> getReducedAc(@PathVariable int d){
		return as.getReducedAc(d);
		
	}
}	
	
	
	
	


