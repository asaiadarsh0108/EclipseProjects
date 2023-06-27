package com.hibernateapp.model;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="policyholder_policy")
public class PolicyHolderPolicy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private LocalDate dateOfRegistration;
	private double premium;
	
	@ManyToOne
	private PolicyHolder policyHolder;
	
	@OneToOne
	private Policy policy;

	public int getId() {
		return id;
	}

	public LocalDate getDateOfRegistration() {
		return dateOfRegistration;
	}

	public double getPremium() {
		return premium;
	}

	public PolicyHolder getPolicyHolder() {
		return policyHolder;
	}

	public Policy getPolicy() {
		return policy;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDateOfRegistration(LocalDate dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	public void setPolicyHolder(PolicyHolder policyHolder) {
		this.policyHolder = policyHolder;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	@Override
	public String toString() {
		return "PolicyHolderPolicy [id=" + id + ", dateOfRegistration=" + dateOfRegistration + ", premium=" + premium
				+ ", policyHolder=" + policyHolder + ", policy=" + policy + "]";
	}
	
	
}
