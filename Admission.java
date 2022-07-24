package pojos;

import java.time.LocalDate;

import javax.persistence.*;

/*
 * Properties of Admission : admissionId , date , student , course , status
 */
@Entity
@Table(name="admissions_tbl")

public class Admission extends BaseEntity {
	@Column(name="admission_date")
	private LocalDate admissionDate;
	//Admission HAS-A Student (i.e linked with Student)
	private Student student;
	//Admission HAS-A Course (i.e linked with Course)
	private Course course;
	@Enumerated(EnumType.STRING)
	@Column(length = 50)
	private Status status;
	public Admission() {
		// TODO Auto-generated constructor stub
	}
	public Admission(Student student, Course course) {
		super();
		this.student = student;
		this.course = course;
		this.admissionDate=LocalDate.now();
		this.status=Status.STUDENT_ADMITTED;
	}
	//all setters n getters
	public LocalDate getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(LocalDate admissionDate) {
		this.admissionDate = admissionDate;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	//Project Tip : DO NOT add any association fields in toString
	@Override
	public String toString() {
		return "Admission [admissionDate=" + admissionDate + ", status=" + status + ", getId()=" + getId() + "]";
	}

}
