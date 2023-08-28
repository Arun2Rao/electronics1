package com.electronics.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.electronics.Repository.AcRepository;
import com.electronics.entity.Ac;

@Repository
public class AcDao {
	@Autowired
	AcRepository ar;

	public String setAc(Ac ac) {
		ar.save(ac);
		return "Saved";

	}

	public String setAllac(List<Ac> ac) {
		ar.saveAll(ac);
		return "all saved";
	}

	public List<Ac> getAllac() {
		return ar.findAll();

	}

	public Ac getbyid(int x) {

		return ar.findById(x).get();
	}

	public String delete(int id) {
		ar.deleteById(id);
		return "Deleted";

	}

}
