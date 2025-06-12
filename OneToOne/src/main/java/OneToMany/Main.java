package OneToMany;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setName("John Doe");
		student1.setStd(10);

		// Creating events associated with the student
		Event event1 = new Event();
		event1.setName("Science Fair");
		event1.setEventDate(LocalDate.of(2025, 6, 15));
		event1.setStudent(student1);

		Event event2 = new Event();
		event2.setName("Sports Day");
		event2.setEventDate(LocalDate.of(2025, 6, 20));
		event2.setStudent(student1);

		// Associating the events with the student
		student1.setEvent(List.of(event1, event2));

		Session session = new Configuration().configure().buildSessionFactory().openSession();

		session.persist(student1);
		session.persist(event1);
		session.persist(event2);

		session.beginTransaction().commit();

	}

}
