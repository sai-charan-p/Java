package com.dev.app.repository;

import com.dev.app.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface AppRepository extends JpaRepository<User, Integer> {
//	private final JdbcTemplate jdbcTemplate;
//
//	public AppRepository(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}
//
//	public int save(User user) {
//        String sql = "INSERT INTO user (username, email, age) VALUES (?, ?, ?)";
//        return jdbcTemplate.update(
//                sql,
//                user.getUsername(),
//                user.getEmail(),
//                user.getAge()
//        );
//    }
//	public int update(User user) {
//        String sql = "update user set username= ?, email=?, age=? where userid = ?";
//        return jdbcTemplate.update(
//                sql,
//                user.getUsername(),
//                user.getEmail(),
//                user.getAge(),
//                user.getUserid()
//        );
//    }
//	public int delete(User user) {
//        String sql = "delete from user where userid= ?";
//        return jdbcTemplate.update(
//                sql,
//                user.getUserid()
//        );
//    }
//	
//	public User getDetails(User user) {
//		String sql="select * from user where userid= ?";
//		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class), user.getUserid()).get(0);
//	}
//	
//	public List<User> findAll() {
//        String sql = "SELECT * FROM user";
//        return jdbcTemplate.query(
//                sql,
//                new BeanPropertyRowMapper<>(User.class)
//        );
//    }
}
