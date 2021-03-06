package Lambda_1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	// PROPIETATS --------------------------
	public  enum Sex {MALE, FEMALE;};
	private String name;
	private int age;
	private LocalDate birthdate;
	private Sex gender;
	private String email;
	private String dni;
	
	//CONSTRUCTORS ---------------------------------
	public Persona(String nom, String email, LocalDate birthdate, String dni) {
		this.name=nom;
		this.email=email;
		this.birthdate=birthdate;
		this.age=getEdat(this.birthdate);
		this.dni=dni;
	}
	
	//GETTERS, SETTERS i toString --------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [name=" + name +" DNI="+dni+", age=" + age + ", birthdate=" + birthdate + ", gender=" + gender + ", email="
				+ email + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Persona))
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	
	
	
	
	public int getEdat(LocalDate birthday) {
		int anys=0;
		if (birthday != null) {
			anys = Period.between(birthdate, LocalDate.now()).getYears();
		} 
		
		return anys;
	}
	
	
	
}
