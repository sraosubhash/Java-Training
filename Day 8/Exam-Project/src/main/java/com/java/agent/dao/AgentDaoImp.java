package com.java.agent.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.agent.model.Agent;
import com.java.agent.model.Gender;
import com.java.agent.util.ConnectionHelper;

public class AgentDaoImp implements AgentDao{
	
	Connection connection;
	PreparedStatement pst;

	@Override
	public List<Agent> showAgent() throws SQLException, ClassNotFoundException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from agent";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Agent> agList = new ArrayList<Agent>();
		Agent agent = null;
		while (rs.next()) {
			agent = new Agent();
			agent.setAgentid(rs.getInt("agentid"));
			agent.setName(rs.getString("name"));
			agent.setCity(rs.getString("city"));
			agent.setGender(Gender.valueOf(rs.getString("Gender")));
			agent.setMaritalStatus(rs.getInt("MaritalStatus"));
			agent.setPremium(rs.getDouble("Premium"));
			agList.add(agent);
		}
		return agList;
	}

	@Override
	public Agent searchAgent(int agentid) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from agent where agentid = ?";
		pst = connection.prepareCall(cmd);
		pst.setInt(1, agentid);
		ResultSet rs = pst.executeQuery();
		Agent agent = null;
		if (rs.next()) {
			agent = new Agent();
			agent.setAgentid(rs.getInt("agentid"));
			agent.setName(rs.getString("name"));
			agent.setCity(rs.getString("city"));
			agent.setGender(Gender.valueOf(rs.getString("gender")));
			agent.setMaritalStatus(rs.getInt("MaritalStatus"));
			agent.setPremium(rs.getDouble("Premium"));
		}
		return agent;
	}

}
