package com.example.demo.Controller;

import java.util.List;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Entity.Team;
import com.example.demo.Service.TeamService;
import com.example.demo.exception.NoTeamsinDatabase;
import com.example.demo.exception.TeamAlreadyExistsException;
import com.example.demo.exception.TeamNotExistsException;

@RestController
@CrossOrigin(origins="*")
public class TeamController {

	@Autowired
	private TeamService teamService;
	@CrossOrigin(origins="http://localhost:3000/")	
	@PostMapping("/admin/addTeam")

	public Team addTeam(@RequestBody Team team) throws TeamAlreadyExistsException {
		return teamService.addTeam(team);
	}
	@CrossOrigin(origins="http://localhost:3000/")	
	@GetMapping("/admin/getTeam/{id}")

	public Team viewTeam(@PathVariable int id) throws TeamNotExistsException {
		return teamService.viewTeam(id);
	}
	@CrossOrigin(origins="http://localhost:3000/")	
	@PutMapping("/admin/editTeam/{id}")

	public Team editTeam(@PathVariable int id ,@RequestBody Team team) throws TeamNotExistsException {
		return teamService.updateTeam(id,team);
	}
	@CrossOrigin(origins="http://localhost:3000/")
	@DeleteMapping("/admin/deleteTeam/{id}")
	
	
	public void deleteTeam(@PathVariable int id) throws TeamNotExistsException {
		teamService.deleteTeam(id);
	}
	@CrossOrigin(origins="http://localhost:3000/")

	@GetMapping("/admin/getTeams")
	
	public List<Team> viewall() throws NoTeamsinDatabase {
		return teamService.viewAllTeams();
	}
	
	
}
