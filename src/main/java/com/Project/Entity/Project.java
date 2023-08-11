package com.Project.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {
	
	@Id
	private int Pid;
	private String Pname;
	private Date  DatofStart;
	private String teamSize;
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public Date getDatofStart() {
		return DatofStart;
	}
	public void setDatofStart(Date datofStart) {
		DatofStart = datofStart;
	}
	public String getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(String teamSize) {
		this.teamSize = teamSize;
	}
	@Override
	public String toString() {
		return "Project [Pid=" + Pid + ", Pname=" + Pname + ", DatofStart=" + DatofStart + ", teamSize=" + teamSize
				+ "]";
	}

	
	
	
}
