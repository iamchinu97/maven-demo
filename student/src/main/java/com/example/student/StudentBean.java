package com.example.student;

public class StudentBean {
	String rollnum;
	String firstname;
	String lastname;
	String department;
	public StudentBean(String rollnum, String firstname, String lastname, String department) {
		super();
		this.rollnum = rollnum;
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
	}
	public StudentBean() {
		super();
	}
	public String getRollnum() {
		return rollnum;
	}
	public void setRollnum(String rollnum) {
		this.rollnum = rollnum;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "StudentBean [rollnum=" + rollnum + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", department=" + department + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((rollnum == null) ? 0 : rollnum.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentBean other = (StudentBean) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (rollnum == null) {
			if (other.rollnum != null)
				return false;
		} else if (!rollnum.equals(other.rollnum))
			return false;
		return true;
	}
	
}
