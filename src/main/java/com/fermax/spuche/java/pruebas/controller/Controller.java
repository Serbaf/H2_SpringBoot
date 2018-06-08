package com.fermax.spuche.java.pruebas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@RequestMapping(value = "/createTable", method = RequestMethod.GET)
	public void createTable()
	{
		try
		{
			jdbcTemplate.execute("CREATE TABLE CUSTOMERDATA(" +
		"id SERIAL, name VARCHAR(255), age VARCHAR(255))");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	@RequestMapping(value = "/putData", method = RequestMethod.GET)
	public void PutData()
	{
		jdbcTemplate.execute("INSERT INTO CUSTOMERDATA(id, name, age) VALUES (1, 'Serbaf', '26')");
	}
}
