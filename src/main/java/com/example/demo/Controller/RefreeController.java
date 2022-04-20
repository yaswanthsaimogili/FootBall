package com.example.demo.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Entity.Refree;
import com.example.demo.Service.RefreeService;
import com.example.demo.exception.NoRefreesinDatabase;
import com.example.demo.exception.RefreeAlreadyExistsException;
import com.example.demo.exception.RefreeNotExistsException;

@RestController
@CrossOrigin(origins="*")
public class RefreeController {


	@Autowired
	private RefreeService RefreeService;
	@CrossOrigin(origins="http://localhost:3000/")	
	@PostMapping("/admin/addRefree")

	public Refree addRefree(@RequestBody Refree Refree) throws RefreeAlreadyExistsException {
		return RefreeService.addRefree(Refree);
	}
	@CrossOrigin(origins="http://localhost:3000/")	
	@GetMapping("/admin/getRefree/{id}")

	public Refree viewRefree(@PathVariable int id) throws RefreeNotExistsException {
		return RefreeService.viewRefree(id);
	}
	@CrossOrigin(origins="http://localhost:3000/")	
	@PutMapping("/admin/editRefree/{id}")

	public Refree editRefree(@PathVariable int id ,@RequestBody Refree Refree) throws RefreeNotExistsException {
		return RefreeService.updateRefree(id,Refree);
	}
	@CrossOrigin(origins="http://localhost:3000/")
	@DeleteMapping("/admin/deleteRefree/{id}")
	
	
	public void deleteRefree(@PathVariable int id) throws RefreeNotExistsException {
		RefreeService.deleteRefree(id);
	}
	@CrossOrigin(origins="http://localhost:3000/")

	@GetMapping("/admin/getRefrees")
	
	public List<Refree> viewall() throws NoRefreesinDatabase {
		return RefreeService.viewAllRefrees();
	}
	
}
