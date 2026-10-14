package in.sp.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.beans.Student;
import in.sp.mapper.StudentRowMapper;
import in.sp.resources.SpringConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
  
    {
    	
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        JdbcTemplate jdbcTemplate =    context.getBean(JdbcTemplate.class);//since we are performing crud operation JdbcTemplate is used
        
        
     //   ------Insert Operation
//
//   	int std_rollno = 103;//we are taking static values
//   	String std_name = "Damini";
//    	float marks = 78.4f;
//   	
//        String insert_sql_query = "INSERT INTO student VALUES (?,?,?)";
//       int count = jdbcTemplate.update( insert_sql_query,std_rollno,std_name,marks);//since update method returns integer value so we store it in integer
//        if (count > 0) {
//        	System.out.println("Insertion Success");
//       } else {
//       	System.out.println("Insertion Fail");
//       	
//       }
        
        
//        //------Update Operation
//        float marks = 98.4f;
//        int rollno = 101;
//        String update_sql_query ="UPDATE student SET  std_marks =? where  std_roll = ?";//? this is called Positioner Parameter
//        int count = jdbcTemplate.update(update_sql_query, marks, rollno);
//        if(count > 0) {
//        	System.out.println("Updation Successfull");
//        } else {
//        	System.out.println("Updation fail");
//        }
        
//        
//        //------Delete Operation 
//        
//        int rollno = 102;
//        String delete_sql_query = "DELETE FROM student WHERE std_roll = ? ";  
//        int count = jdbcTemplate.update(delete_sql_query, rollno);
//        if(count > 0) {
//        	System.out.println("Deleted Successfully");
//        } else{
//        	System.out.println("Deletion Failed!");
//        }
        
        
        
//------------Select Operation
//        String select_sql_query = "SELECT * FROM student";
//       List<Student> std_list =  jdbcTemplate.query(select_sql_query, new StudentRowMapper());//for providing rowmapper we have to prepare a rowmapper class also it return in list
//       for (Student std: std_list) {
//    	   
//		System.out.println("Roll No: " + std.getRollno());//to print the information
//		System.out.println("Name: " + std.getName());
//		System.out.println("Marks: " + std.getMarks());
//		System.out.println("--------------------------------------");
//		
//	}
        
        
        
        
        
//      //------------Select Operation 2
//        int rollno = 101;
//             String select_sql_query = "SELECT * FROM student WHERE  std_roll = ?";//to fetch data through roll no
//             List<Student> std_list =  jdbcTemplate.query(select_sql_query, new StudentRowMapper(),rollno);//for providing rowmapper we have to prepare a rowmapper class also it return in list
//             for (Student std: std_list) {
//          	   
//      		System.out.println("Roll No: " + std.getRollno());//to print the information
//      		System.out.println("Name: " + std.getName());
//      		System.out.println("Marks: " + std.getMarks());
//     		System.out.println("--------------------------------------");
//    		
//     	}
//              
//              
             
             
             //------------Select Operation 3
               int rollno = 102;
                    String select_sql_query = "SELECT * FROM student WHERE  std_roll = ?";//to return one value
                    Student std  =  jdbcTemplate.queryForObject(select_sql_query, new StudentRowMapper(),rollno);
                    
                 	   
             		System.out.println("Roll No: " + std.getRollno());//to print the information
             		System.out.println("Name: " + std.getName());
             		System.out.println("Marks: " + std.getMarks());
            		System.out.println("--------------------------------------");
           		
            	
                     
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
