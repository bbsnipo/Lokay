package com.dev.magne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.magne.lokaytorData;
import com.dev.magne.lokaytorRepo;
import com.dev.magne.lokaytorRepoImp;

@Controller
@RequestMapping
public class lokaytorDataConnector {
	
	@Autowired
	private lokaytorRepo loRe;
	
	@GetMapping(path="/add")
	public @ResponseBody String addLokay(@RequestParam String str1, @RequestParam String str2, @RequestParam String str3, @RequestParam int locDate, @RequestParam int locTime) {
		
		lokaytorData x = new lokaytorData();
		x.setName(str1);
		x.setLoc(str2);
		x.setCom(str3);
		x.setDat(locDate);
		x.setTim(locTime);
		
		return "Saved";
	}
	
	@GetMapping(path="/get")
	public @ResponseBody String lokayget(@RequestParam Long id) {
		
		lokaytorData x = getLokay(id);
		x.getName();
		x.getLoc();
		x.getCom();
		x.getDat();
		x.getTim();
		
		return x.toString();
	}
	

	@GetMapping(path="/locations")
	public @ResponseBody Iterable<lokaytorData> getAll(){
		return loRe.findAll();
	}
	
	@GetMapping(path="/locations/{id}")
	public ResponseEntity<?> getLoc(@PathVariable("id") Long id){
		lokaytorRepo lokay = loRe.findById(id);
	}

}
