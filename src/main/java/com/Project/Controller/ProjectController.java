package com.Project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Project.Entity.Project;
import com.Project.Service.ProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	ProjectService service;
	
	@PostMapping("/addProject")
	public String insertIntoProject(List<Project> pj) {
		return service.insertIntoProject(pj);
	}

	@GetMapping("/getProject")
	public List<Project> getProject() {
		return service.getProject();
	}
	
	@PutMapping("/updateProject")
	public String updateProject(@RequestBody  Project p) {
		return service.updateProject(p);
	}
	
	@DeleteMapping("/deleteP/{pid}")
	public String deleteProject(@PathVariable int pid) {
		return service.deleteProject(pid);
	}
	
}
