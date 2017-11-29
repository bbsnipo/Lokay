package com.dev.magne;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.dev.magne.lokaytorData;


public interface lokaytorRepo extends CrudRepository<lokaytorData, Long> {
	
	List<lokaytorData> findByName(String str1);
	
	public abstract lokaytorData getLokay(Long id);
	
	
	public abstract void saveLokay(lokaytorData lokay);
	
	
	public abstract void upLokay(lokaytorData lokay);
	

	public abstract void delLokay(lokaytorData lokay);

}
