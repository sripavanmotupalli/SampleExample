package Student;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class StudentTest  {

	public static void main(String[] args) {
		
		
		Student st = new Student();
		StudentSubjects stsub = new StudentSubjects();
		StudentMarks stmar = new StudentMarks();
		
		Scanner sc = new Scanner(System.in);
             
		     
		  st.StudentId = sc.nextInt();
		  st.StudentFirstName = sc.next();
		  st.StudentLastName = sc.next();
		  
		  stsub.subject1 = sc.next();
		  stsub.subject2 = sc.next();
		  stsub.subject3 = sc.next();
		  stsub.subject4 = sc.next();
		  stsub.subject5 = sc.next();
		  
		  stmar.subject1 = sc.nextInt();
		  stmar.subject2 = sc.nextInt();
		  stmar.subject3 = sc.nextInt();
		  stmar.subject4 = sc.nextInt();
		  stmar.subject5 = sc.nextInt();
		  
		  stmar.Total=stmar.subject1+stmar.subject2+stmar.subject3+stmar.subject4+stmar.subject5;
		  stmar.Average=stmar.Total/5;
		  
		  if(stmar.Average>=90){
			  stmar.Grade="A";}
		  
			  else if(stmar.Average>=80){
				  stmar.Grade="B"; 
		  }
			  else if(stmar.Average>=70){
				  stmar.Grade="C";
			  }
			  else{
				  stmar.Grade="Fail";
			  }
		  
		  System.out.println("StudentId     StudentFirstName    StudentLastName   :  "      +stsub.subject1
				  + "\t" +stsub.subject2 + "\t"+stsub.subject3 + "\t"+stsub.subject4 + "\t"+stsub.subject5
				  + "\t"+"Total   Average  Grade");
		  
		  
		  System.out.println(+st.StudentId + "\t"+  "\t"+st.StudentFirstName+ "\t"+"\t"+st.StudentLastName
				  + "\t"+stmar.subject1+ "\t"+stmar.subject2+ "\t"+stmar.subject3+ "\t"+stmar.subject4
				  + "\t"+stmar.subject5+ "\t"+stmar.Total+ "\t"+stmar.Average+ "\t"+stmar.Grade);
		  
		  
		  try {  
			  	            Writer w = new FileWriter("E://f.txt");  
			  	            
			  	            
			  	            
			  	            
			  	            String content = "StudentId     StudentFirstName    StudentLastName   :  Telugu	Maths	English	Social	Science	Total   Average  Grade"; 
			  	            String content1 = "1		SriPavan		Motupalli	      90	              100	       95	    90 	       95  	470	 94.0	A";
			  	            
			  	            w.write(content);
			  	            w.write("\r\n");
			  	            w.write(content1);
			  	            w.close();  
			  	            System.out.println("Done");  
			  	        } catch (IOException e) {  
			  	            e.printStackTrace();  
			  	        }  
			  	      

		
	}
}
