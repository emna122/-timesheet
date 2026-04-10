package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserRepository userRepository;



	private static final Logger l = LogManager.getLogger(UserServiceImpl.class);

	@Override
	public List<User> retrieveAllUsers() { 

		return null;
	}


@Override
public User addUser(User u) {
    User utilisateur = null;
    try {
        utilisateur = userRepository.save(u);
    } catch (Exception e) {
        
    }
    return utilisateur;
}	

	@Override 
	public User updateUser(User u) {

		User userUpdated = null; 
		User u_saved = null; 

		
		try {
			userUpdated = userRepository.save(u); 

		} catch (Exception e) {
		}

		return userUpdated; 
	}

	@Override
	public void deleteUser(String id) {

		try {
			userRepository.deleteById(Long.parseLong(id)); 

		} catch (Exception e) {
		}

	}

	@Override
	public User retrieveUser(String id) {
		User u = null;
		try {
			u =  userRepository.findById(Long.parseLong(id)).get();

		} catch (Exception e) {
		}

		return u;
	}

	
	
	
}
