package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	
	  public Connection getConnection() {
	      try {
	          return DriverManager.getConnection(
	  "jdbc:mysql://localhost:3306/concessionaria", "administrador", "234");
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      }
	  }
	
}
