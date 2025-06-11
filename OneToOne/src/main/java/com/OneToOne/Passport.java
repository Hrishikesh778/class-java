package com.OneToOne;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Passport {


	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public Long id;
	
	public String passportNo;
	
	public String issuedCountry;
	
	@Column(name="DATE")
	@Temporal(TemporalType.DATE)
	public LocalDate expirationDate;	
	
	@OneToOne(mappedBy = "passport")
	public Employee employee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getIssuedCountry() {
		return issuedCountry;
	}

	public void setIssuedCountry(String issuedCountry) {
		this.issuedCountry = issuedCountry;
	}



	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", passportNo=" + passportNo + ", issuedCountry=" + issuedCountry
				+ ", expirationDate=" + expirationDate + ", employee=" + employee + "]";
	}


	
	
	
}
