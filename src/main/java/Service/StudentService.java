package Service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import Model.Student;

@Service
@Component
public interface StudentService {

	public boolean saveStudent(Student student);
	
	public List<Student> getStudents();
	
	public boolean deleteStudent(Student student);
	
	public List<Student> getStudentById(Student student);
	
	public boolean updateStudent(Student student);
	
}
