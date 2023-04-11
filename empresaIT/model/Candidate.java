package empresaIT.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Candidate implements Comparable<Candidate> {

	private LocalDate dateOrBirth;
	private LocalDateTime startDate;
	private String dni;
	private String name;
	private String surname;
	private ContractType ct;
	private boolean inProject;
	
	
	public Candidate() {
		super();
		this.startDate = LocalDateTime.now();
	}
	
	public Candidate(String dni, String name, String surname, LocalDate dateOrBirth, ContractType ct) {
		super();
		 setDni(dni);
		 setName(name);
		 setSurname(surname);
		 setDateOrBirth(dateOrBirth);
		 this.ct = ct;
		this.startDate = LocalDateTime.now();
	}
	
	public abstract double computeGrossSalary();

	public LocalDate getDateOrBirth() {
		return dateOrBirth;
	}

	public void setDateOrBirth(LocalDate dateOrBirth) {
		this.dateOrBirth = dateOrBirth;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public ContractType getCt() {
		return ct;
	}

	public void setCt(ContractType ct) {
		this.ct = ct;
	}

	public boolean isInProject() {
		return inProject;
	}

	public void setInProject(boolean inProject) {
		this.inProject = inProject;
	}
	
	public int compareTo(Candidate c) {
		return this.dni.compareTo(c.dni);
	}


	
	
	
	

}
