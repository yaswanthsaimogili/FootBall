package com.example.demo.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Entity.Refree;
import com.example.demo.Repository.RefreeRepository;
import com.example.demo.exception.NoRefreesinDatabase;
import com.example.demo.exception.RefreeAlreadyExistsException;
import com.example.demo.exception.RefreeNotExistsException;


@Service
public class RefreeService {


	@Autowired
	private RefreeRepository RefreeRepository;
	
	public Refree addRefree(Refree Refree) throws RefreeAlreadyExistsException {
		Refree k=RefreeRepository.findByrefreeName(Refree.getRefreeName());
		if(k!=null) {
			throw new RefreeAlreadyExistsException("Refree exists with Name "+Refree.getRefreeName());
		}
		return RefreeRepository.save(Refree);
	}
	public Refree updateRefree(int id ,Refree Refree) throws RefreeNotExistsException {
		Refree k1=RefreeRepository.findById(id).orElse(null);
		if(k1==null) {
			throw new RefreeNotExistsException("No Refree in DataBase with Name"+Refree.getRefreeName());
		}
		k1=new Refree(k1.getRefreeId(),Refree.getRefreeName(),Refree.getRefreeLocation(),Refree.getRefreeExperience(),Refree.getRefreeImage());
		return RefreeRepository.save(k1);
	}
	public Refree viewRefree(int id) throws RefreeNotExistsException {
		Refree k= RefreeRepository.findByrefreeId(id);
		if(k==null) {
			throw new RefreeNotExistsException("No Refree in DataBase with Name"+id);
		}
		return k;
	}
	public void  deleteRefree(int id) throws RefreeNotExistsException {
		Refree k= RefreeRepository.findByrefreeId(id);
		if(k==null) {
			throw new RefreeNotExistsException("No Refree in DataBase with Name"+id);
		}
		RefreeRepository.delete(RefreeRepository.findByrefreeId(id));
	}
	public List<Refree> viewAllRefrees() throws NoRefreesinDatabase{
		List<Refree> l= RefreeRepository.findAll();
		if(l.isEmpty()) {
			throw new NoRefreesinDatabase("DataBase Empty ");
			
		}
		return l;
	}
	
}
