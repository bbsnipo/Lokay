package com.dev.magne;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.dev.magne.lokaytorData;

public abstract class lokaytorRepoImp implements lokaytorRepo {
	
	
	@Autowired
	private lokaytorRepo loRe;
	
	@Transactional
	public lokaytorData getLokay(Long id) {
		
		return loRe.findOne(id);
		
	}
	
	@Transactional
	public void saveLokay(lokaytorData lokay) {
		
		loRe.save(lokay);
		
	}
	
	@Transactional
	public void upLokay(lokaytorData lokay) {
		
		loRe.save(lokay);
		
	}
	

	@Transactional
	public void delLokay(lokaytorData lokay) {
		
		loRe.delete(lokay);
		
	}


	@Override
	public long count() {
		return 0;
	}



	@Override
	public void delete(lokaytorData arg0) {
		
	}


	@Override
	public void delete(Iterable<? extends lokaytorData> arg0) {
		
	}


	@Override
	public void deleteAll() {
		
		
		
	}


	@Override
	public boolean exists(Long arg0) {
		return false;
	}


	@Override
	public Iterable<lokaytorData> findAll() {
		return null;
	}


	@Override
	public Iterable<lokaytorData> findAll(Iterable<Long> arg0) {
		return null;
	}


	@Override
	public lokaytorData findOne(Long arg0) {
		return null;
	}


	@Override
	public <S extends lokaytorData> S save(S arg0) {
		return null;
	}


	@Override
	public <S extends lokaytorData> Iterable<S> save(Iterable<S> arg0) {
		return null;
	}


	@Override
	public List<lokaytorData> findByName(String str1) {
		return null;
	}

}
