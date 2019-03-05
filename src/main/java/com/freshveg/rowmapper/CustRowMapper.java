package com.freshveg.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.freshveg.pojo.Customer;

public class CustRowMapper implements RowMapper<Customer>{

	@Override
	public Customer mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
