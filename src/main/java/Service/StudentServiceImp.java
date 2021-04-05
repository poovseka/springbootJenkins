package Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.StudentDao;
import Model.Student;

@Service
@Transactional

public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public boolean saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}

	@Override
	public List<Student> getStudents() {
		return studentDao.getStudents();
	}

	@Override
	public boolean deleteStudent(Student student) {
		return studentDao.deleteStudent(student);
	}

	@Override
	public List<Student> getStudentById(Student student) {
		return studentDao.getStudentById(student);
	}

	@Override
	public boolean updateStudent(Student student) {
		return studentDao.updateStudent(student);
	}

}
