package com.pnc.iag.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="userkey")
	private int userkey;
	
	@Column(name="user_first_name")
	private String userFirstName;
	
	@Column(name="user_last_name")
	private String userLastName;
	
	@Column(name="user_department")
	private String userDepartment;
	
	@Column(name="user_division")
	private String userDivision;
	
	@Column(name="user_manager_key")
	private int userManagerKey;
	
	@Column(name="user_is_manager")
	private boolean userIsManager;
	
	@Column(name="user_location")
	private String userLocation;
	
	@Column(name="user_password")
	private String userPassword;
	
	@Column(name="user_street")
	private String userStreet;
	
	@Column(name="user_city")
	private String userCity;
	
	@Column(name="user_state")
	private String userState;
	
	@Column(name="user_zip")
	private String userZip;
	
	@Column(name="user_maildrop")
	private String userMaildrop;
	
	@Column(name="userID")
	private String userID;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public int getUserkey() {
		return userkey;
	}

	public void setUserkey(int userkey) {
		this.userkey = userkey;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserDepartment() {
		return userDepartment;
	}

	public void setUserDepartment(String userDepartment) {
		this.userDepartment = userDepartment;
	}

	public String getUserDivision() {
		return userDivision;
	}

	public void setUserDivision(String userDivision) {
		this.userDivision = userDivision;
	}

	public int getUserManagerKey() {
		return userManagerKey;
	}

	public void setUserManagerKey(int userManagerKey) {
		this.userManagerKey = userManagerKey;
	}

	public boolean isUserIsManager() {
		return userIsManager;
	}

	public void setUserIsManager(boolean userIsManager) {
		this.userIsManager = userIsManager;
	}

	public String getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserStreet() {
		return userStreet;
	}

	public void setUserStreet(String userStreet) {
		this.userStreet = userStreet;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserState() {
		return userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	public String getUserZip() {
		return userZip;
	}

	public void setUserZip(String userZip) {
		this.userZip = userZip;
	}

	public String getUserMaildrop() {
		return userMaildrop;
	}

	public void setUserMaildrop(String userMaildrop) {
		this.userMaildrop = userMaildrop;
	}
	
	@Override
	public String toString()
	{
		return "USER ID=" + this.getUserID() + "\n" + "USER FIRST NAME=" + this.getUserFirstName() + "\n"
				+ "USER LAST NAME=" + this.getUserLastName() + "\n" +
				"USER PASSWORD=" + this.getUserPassword() + "\n" + 
				"USER DIVISION=" + this.getUserDivision();
 	}
}
