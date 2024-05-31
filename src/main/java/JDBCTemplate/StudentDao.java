package JDBCTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.mysql.cj.jdbc.CallableStatement;

public class StudentDao {
	
    @Autowired
	private JdbcTemplate jdbcTemplate;
    
    public int saveStudent(Student student) {
    	 String sql = "INSERT INTO students (id, name, age, grade) VALUES (?, ?, ?, ?)";
    	 int rows=jdbcTemplate.update(sql,student.getId(),student.getName(),student.getAge(),student.getGrade());
    	 return rows;
    }
    
    
    public List<Student> getAllStudents() {
        String sql = "SELECT * FROM students";
        return jdbcTemplate.query(sql, new StudentResultSetExtractor());
    }
    
    public List<Student> getById() {
    	String sql="SELECT * FROM students";
    	return jdbcTemplate.query(sql ,new BeanPropertyRowMapper<>(Student.class));
    }
    
//    private static class StudentRowMapper implements RowMapper<Student>{
//		@Override
//		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//				    Student student = new Student();
//	                student.setId(rs.getInt("id"));
//	                student.setName(rs.getString("name"));
//	                student.setAge(rs.getInt("age"));
//	                student.setGrade(rs.getString("grade"));
//	                return student;
//		}
//    	
//    }

    private static class StudentResultSetExtractor implements ResultSetExtractor<List<Student>> {
        @Override
        public List<Student> extractData(ResultSet rs) throws SQLException {
            List<Student> students = new ArrayList<>();
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setGrade(rs.getString("grade"));
                students.add(student);
            }
            return students;
        }
    }
    
    //Procedure
    public int countStudents() {
//        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
//                .withProcedureName("count_students");
//        Map<String, Object> out = simpleJdbcCall.execute();
//        System.out.println(out);
//        return (int) out.get("count");
    	String query="CALL count_students()";
    	return jdbcTemplate.queryForObject(query, Integer.class);
        
    }
    
    public int saveStudents(Student student) {
        String query="CALL save_student(?,?,?,?)";
        //String query="Select save_student(?,?,?,?)";
        return jdbcTemplate.queryForObject(query,Integer.class,student.getId(),student.getName(),student.getAge(),student.getGrade());
    }
    
    
    //Function
    public String getStudentNameById(int studentId) {
        String sql = "SELECT get_student_name_by_id(?)";
        return jdbcTemplate.queryForObject(sql, String.class, studentId);
    }
}
