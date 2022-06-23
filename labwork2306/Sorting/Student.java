package sorting;

public class Student 
{
	int rollno;
	String name;
	String subject;
	int marks;
	
	public Student(String name, int rollno, String subject, int marks)
	{
		super();
		this.rollno=rollno;
		this.name=name;
		this.subject=subject;
		this.marks=marks;
	}

@Override 
  public String toString()
    {
	    return "Student [rollno="+rollno+",name= "+name+",subject="+subject+",total_marks="+marks+"]";
    }

}
