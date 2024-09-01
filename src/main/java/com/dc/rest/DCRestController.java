package com.dc.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dc.entity.Education;
import com.dc.entity.Income;
import com.dc.entity.Kid;
import com.dc.service.EducationService;
import com.dc.service.IncomeService;
import com.dc.service.KidService;

import jakarta.ws.rs.Path;


@RestController
public class DCRestController {

	@Autowired
	private IncomeService incomeService;
	
	@Autowired
	private EducationService educationService;
	
	@Autowired
	private KidService kidService;
	
	@PostMapping("/saveincome")
	public ResponseEntity<String> saveIncomeDetails(@RequestBody Income income){
		boolean saved = incomeService.saveIncome(income);
		if(saved) {
			return new ResponseEntity<String>("Income details Saved Successfully",HttpStatus.OK);
		}
		return new ResponseEntity<String>("Income Details not saved",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping("/incomes")
	public ResponseEntity<List<Income>> getIncomeDetails(){
		List<Income> incomes = incomeService.getAll();
		return new ResponseEntity<List<Income>>(incomes,HttpStatus.OK);
	}
	
	@GetMapping("/income/{id}")
	public ResponseEntity<Income> getIncomeById(@PathVariable Integer id){
		Income income = incomeService.incomeById(id);
		return new ResponseEntity<Income>(income,HttpStatus.OK);
	}
	
	@GetMapping("/inco/{appNumber}")
	public ResponseEntity<Income> getIncomeByAppNumber(@PathVariable Integer appNumber){
		Income income = incomeService.getByAppNumber(appNumber);
		return new ResponseEntity<Income>(income,HttpStatus.OK);
	}
	
	@PostMapping("/education")
	public ResponseEntity<String> saveEducationDetails(@RequestBody Education education){
		boolean saved = educationService.saveEducationDetails(education);
		if(saved) {
			return new ResponseEntity<String>("Education details Saved Successfully",HttpStatus.OK);
		}
		return new ResponseEntity<String>("Education Details not saved",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping("/education")
	public ResponseEntity<List<Education>> getEducationDetails(){
		List<Education> educationDetails = educationService.getEducationDetails();
		return new ResponseEntity<List<Education>>(educationDetails,HttpStatus.OK);
	}
	
	@GetMapping("/education/{id}")
	public ResponseEntity<Education> getEducationDetailsById(@PathVariable Integer id){
		Education educationDeailsById = educationService.getEducationDeailsById(id);
		return new ResponseEntity<Education>(educationDeailsById,HttpStatus.OK);
	}
	
	@GetMapping("/education/appNumber/{appNumber}")
	public ResponseEntity<Education> getEducationDetailsByAppNumber(@PathVariable Integer appNumber){
		Education educationDeailsByAppNumber = educationService.getEducationDeailsByAppNumber(appNumber);
		return new ResponseEntity<Education>(educationDeailsByAppNumber,HttpStatus.OK);
	}
	
	@PostMapping("/kid")
	public ResponseEntity<String> saveKidsDetails(@RequestBody List<Kid> kid){
		String saveKids = kidService.saveKids(kid);
		return new ResponseEntity<String>(saveKids,HttpStatus.OK);
	}
	
	@GetMapping("/kids")
	public ResponseEntity<List<Kid>> getKids(){
		List<Kid> kids = kidService.kids();
		return new ResponseEntity<List<Kid>>(kids,HttpStatus.OK);
	}
	
	@GetMapping("/kid/{id}")
	public ResponseEntity<Kid> getKidById(@PathVariable Integer id){
		Kid kid = kidService.getKidById(id);
		return new ResponseEntity<Kid>(kid,HttpStatus.OK);
	}
	
	@GetMapping("/kid/appnumber/{appNumber}")
	public ResponseEntity<List<Kid>> getKidByAppNumber(@PathVariable Integer appNumber){
		List<Kid> kid = kidService.getKidsBYAppNumber(appNumber);
		return new ResponseEntity<List<Kid>>(kid,HttpStatus.OK);
	}
}
