package com.freshveg.dao.imp;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.freshveg.dao.CustomerDao;
import com.freshveg.pojo.Customer;
@Repository
public class CustomerService extends NamedParameterJdbcDaoSupport implements CustomerDao {

	@Autowired
	  public void setDataSource2(DataSource dataSource) {
	    super.setDataSource(dataSource);
	  }
	@Override
	public void register(Customer customer) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public Customer login() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
