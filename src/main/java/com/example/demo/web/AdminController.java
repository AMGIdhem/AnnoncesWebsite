package com.example.demo.web;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.AnnonceRepository;
import com.example.demo.dao.UserRepository;
import com.example.demo.entities.Role;
import com.example.demo.entities.User;

@Controller
@RequestMapping("/admin")
@Secured(value={"ROLE_ADMIN"})
public class AdminController {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	AnnonceRepository annonceRepository;
	
	@RequestMapping("/home")
	public String Index(Model model) {
		return "homeAdmin";
	}
	
	
	@RequestMapping(value="/getAllUsersAnnonceur")
	public String getAllUsersAnnonceur(Model model) {
		List<User> users = userRepository.findAll();
		List<User> usersAnnonceur = new ArrayList<User>();
		for(User u:users) {
			Collection<Role> roles = u.getRoles();
			for(Role r:roles) {
				if(r.getRole().equals("ANNONCEUR")) {
					usersAnnonceur.add(u);
					model.addAttribute("usersAn", usersAnnonceur);

				}
			}
		}
		model.addAttribute("users", users);
		return "usersAnnonceur";
	}
	
	@RequestMapping(value="/getAllUsersEtudiant")
	public String getAllUsersEtudiant(Model model) {
		List<User> users = userRepository.findAll();
		List<User> usersEtudiant = new ArrayList<User>();
		for(User u:users) {
			Collection<Role> roles = u.getRoles();
			for(Role r:roles) {
				if(r.getRole().equals("ETUDIANT")) {
					usersEtudiant.add(u);

				}
			}
		}
		model.addAttribute("usersEt", usersEtudiant);
		model.addAttribute("users", users);
		return "usersEtudiant";
	}
	
	@RequestMapping(value="/supprimer")
	public String supprimer(String username) {
		userRepository.deleteById(username);
		return "redirect:getAllUsersAnnonceur";
	}
	
	@RequestMapping(value="/getAnnoncesOfUser")
	public String getAnnoncesOfUser(String username) {
		userRepository.deleteById(username);
		annonceRepository.findByUser_username(username);
		return "AnnoncesOfUser";
	}

}
