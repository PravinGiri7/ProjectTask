package com.Project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.Dao.ProjectDao;
import com.Project.Entity.Project;

@Service
public class ProjectService {

	@Autowired
	ProjectDao dao;
	
public	String insertIntoProject(List<Project> pj){
		return dao.insertIntoProject(pj);
	}
	
public List<Project> getProject() {
	return dao.getProject();
	
}


public String updateProject(Project p) {
	return dao.updateProject(p);
}
	

 public String deleteProject(int pid) {
	 return dao.deleteProject(pid);
 }
}
