package com.freshveg.dao;

import java.sql.SQLException;

import com.freshveg.pojo.Customer;

public interface CustomerDao {

	public void register(Customer customer);
	public Customer login() throws SQLException;
}
