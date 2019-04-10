package com.mhys.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mhys.entity.Employee;
import com.mhys.entity.Post;

public class Dao {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	BaseDao bdao=new BaseDao();
	public List<Employee> getAll(){
		List<Employee> list=new ArrayList<Employee>();
		try {
			con=bdao.getConnection();
			String sql="SELECT emp_id ,emp_name,emp_depart,emp_sex,emp_age,"
					+ "post_name,emp_year from employee e,post p where e.post_id=p.post_id";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				Employee e=new Employee();
				Post p=new Post();
				p.setPostName(rs.getString("post_name"));
				e.setEmpId(rs.getInt("emp_id"));
				e.setEmpName(rs.getString("emp_name"));
				e.setPost(p);;
				list.add(e);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
		
	}
	
//	public List<Post> selPost(){
//		List<Post> list=new ArrayList<Post>();
//		try {
//			con=bdao.getConnection();
//			String sql="select distinct post_name from post ";
//			ps=con.prepareStatement(sql);
//			rs=ps.executeQuery();
//			while(rs.next()){
//				Post p=new Post();
//				p.setPostName(rs.getString("postName"));
//			}
//	}catch{
//		
//	}
	public List<Employee> getList(){
		List<Employee> list=new ArrayList<Employee>();
		
			try {
				con=bdao.getConnection();
				String sql="select e.emp_id,emp_name,emp_sex,post_name from employee e,post p where e.post_id=p.post_id ";
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
				while(rs.next()){
					Post post=new Post();
					post.setPostName(rs.getString("post_name"));
					Employee e=new Employee();
					e.setEmpId(rs.getInt("emp_id"));
					e.setEmpName(rs.getString("emp_name"));
					e.setPost(post);
					list.add(e);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
