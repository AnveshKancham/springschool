/*
 * You can use the following import statements
 *
 * import java.sql.ResultSet;
 * import java.sql.SQLException;
 * import org.springframework.jdbc.core.RowMapper;
 *
 */

// Write your code here

package example.school.model;

import com.example.student.model.School;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<School> {
    public School mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new School(
                rs.getInt("studentId"),
                rs.getString("studentName"),
                rs.getInt("gender"),
                rs.getString("standard"));

    }
}