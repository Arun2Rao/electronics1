package com.electronics.Service;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronics.Dao.AcDao;
import com.electronics.entity.Ac;
@Service
public class AcService {
	@Autowired
	AcDao ad;

	public String setAc(Ac ac) {
		return ad.setAc(ac);

	}


	


	public String setAllac(List<Ac> ac) {
		
		return ad.setAllac(ac);
	}




	public List<Ac> getAllac(){
		
		return ad.getAllac();
	}





	public Ac getbyid(int x) {
		
		return ad.getbyid(x);
	}





	public String delete(int id) {
		
		return ad.delete(id);
				
	}





	public List<Ac> getbybrand(String b) {
		List<Ac>x = getAllac();
List<Ac>y = x.stream().filter(n->n.getBrand().equalsIgnoreCase(b)).collect(Collectors.toList());
		return y;
	}





	public List<String> getBrandByColor(String c) {
		List<Ac>m = getAllac();		
   List<String>i = m.stream().filter(p->p.getColor().equalsIgnoreCase(c)).map(l->l.getBrand()).collect(Collectors.toList());

     return i;
	}

     public Ac getMax() { 
    	 List<Ac>n = getAllac();
    	 Ac c = n.stream().max(Comparator.comparingInt(Ac::getPrice)).get();
    	 return c;
    	 
     }
     





	public List<Ac> getReducedAc(int d) {
		List<Ac>t = getAllac(); 
		
		List<Ac> z =t.stream().peek(x->x.setPrice(x.getPrice()-x.getPrice()*d/100)).collect(Collectors.toList());
	return z;
	}
}




	
	





	




	
