package com.sharkjava.springhibernate.DAO;

import java.util.List;





import javax.transaction.Transactional;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;







import com.sharkjava.springhibernate.entity.Student;


@Repository
public class StudentDAOImpl implements StudentDAO {
  
	@Autowired
	private SessionFactory sessionFactory;
	  
	@Override	
	public List<Student> getStudents() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Student> theStudent = currentSession.createQuery("from Student",Student.class);
		
		List<Student> students = theStudent.getResultList();
		
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public void saveStudent(Student theStudent) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theStudent);		
	}

	@Override
	public Student getStudents(int id) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Student theStudent = currentSession.get(Student.class, id);
		
		return theStudent;
	}

	@Override
	public void deleteStudents(int id) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from Student where id=:studentID");
		theQuery.setParameter("studentID", id);
		theQuery.executeUpdate();
	}

}
