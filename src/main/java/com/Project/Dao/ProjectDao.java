package com.Project.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Project.Entity.Project;



@Repository
public class ProjectDao {
	
	@Autowired
	SessionFactory sf;
	
	
	//............insert.................
	public String insertIntoProject(List<Project> pj) {
		
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		
		for (Project project : pj) {
			session.save(project);
		}
	    tr.commit();
		
		return "Project  Saved..... ";
	}
	
	
	//.................get.....................
	public List<Project> getProject() {
		Session session=sf.openSession();
		Criteria cr=session.createCriteria(Project.class);
		return cr.list() ;
		}
	
	
	//................udpate..................................
	
	public String updateProject(Project p){
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.update(p);
		tr.commit();
		session.close();
		return "Project Updated..............";
		
	}
	
	
	//..............project..........................
	public String deleteProject(int pid) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Project py = session.get(Project.class, pid);

		session.delete(py);
		tr.commit();
		return "Project Deleted by id Successfully.....";

	}
}
