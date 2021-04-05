package DAO;

import java.util.List;

import Model.Student;

public interface StudentDao {
	public boolean saveStudent(Student student);

	public List<Student> getStudents();

	public boolean deleteStudent(Student student);

	public List<Student> getStudentById(Student student);

	public boolean updateStudent(Student student);
}
