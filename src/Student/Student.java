package Student;

public class Student {

	public int StudentId;
	public String StudentFirstName;
	public String StudentLastName;
	/*public int Total;
	public double Average;
	public String Grade;*/
	
	
	public Student() {
		
		this.StudentId = StudentId;
		this.StudentFirstName = StudentFirstName;
		this.StudentLastName = StudentLastName;
		/*this.	Total = Total;
		this.Average = Average;
		this.Grade = Grade;*/
	}
/*
	public int getStudentId() {
		return StudentId;
	}


	public void setStudentId(int studentId) {
		StudentId = studentId;
	}


	public String getStudentFirstName() {
		return StudentFirstName;
	}


	public void setStudentFirstName(String studentFirstName) {
		StudentFirstName = studentFirstName;
	}


	public String getStudentLastName() {
		return StudentLastName;
	}


	public void setStudentLastName(String studentLastName) {
		StudentLastName = studentLastName;
	}


	public int getTotal() {
		return Total;
	}


	public void setTotal(int total) {
		Total = total;
	}


	public double getAverage() {
		return Average;
	}


	public void setAverage(double average) {
		Average = average;
	}


	public String getGrade() {
		return Grade;
	}


	public void setGrade(String grade) {
		Grade = grade;
	}*/

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentFirstName=" + StudentFirstName + ", StudentLastName="
				+ StudentLastName + "]";
	}
	
}
