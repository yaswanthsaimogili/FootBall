package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Entity.Team;
import com.example.demo.Repository.TeamRepository;
import com.example.demo.exception.NoTeamsinDatabase;
import com.example.demo.exception.TeamAlreadyExistsException;
import com.example.demo.exception.TeamNotExistsException;

@Service
public class TeamService {

	@Autowired
	private TeamRepository teamRepository;
	
	public Team addTeam(Team team) throws TeamAlreadyExistsException {
		Team k=teamRepository.findByTeamName(team.getTeamName());
		if(k!=null) {
			throw new TeamAlreadyExistsException("Team exists with Name "+team.getTeamName());
		}
		return teamRepository.save(team);
	}
	public Team updateTeam(int id ,Team team) throws TeamNotExistsException {
		Team k1=teamRepository.findById(id).orElse(null);
		if(k1==null) {
			throw new TeamNotExistsException("No Team in DataBase with Name"+team.getTeamName());
		}
		k1=new Team(k1.getTeamId(),team.getTeamName(),team.getTeamLocation(),team.getTeamSize(),team.getTeamImage());
		return teamRepository.save(k1);
	}
	public Team viewTeam(int id) throws TeamNotExistsException {
		Team k= teamRepository.findByTeamId(id);
		if(k==null) {
			throw new TeamNotExistsException("No Team in DataBase with Name"+id);
		}
		return k;
	}
	public void  deleteTeam(int id) throws TeamNotExistsException {
		Team k= teamRepository.findByTeamId(id);
		if(k==null) {
			throw new TeamNotExistsException("No Team in DataBase with Name"+id);
		}
		teamRepository.delete(teamRepository.findByTeamId(id));
	}
	public List<Team> viewAllTeams() throws NoTeamsinDatabase{
		List<Team> l= teamRepository.findAll();
		if(l.isEmpty()) {
			throw new NoTeamsinDatabase("DataBase Empty ");
			
		}
		return l;
	}
}
