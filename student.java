bsc-com-ne-07-18,sibongire nyirenda; 
import java.util.Scanner;
public class Student{
	
		//activate scanner object
		Scanner input = new Scanner (System.in);

		//declaring all variables
        private String name;
        private Double [] grades;
        private static Int NumberOfStudent;

		//dealing with variables
		 
        System.out.println("enter total number of Students:");
        static int NumberOfStudents = input.nextInt();
        System.out.println("enter name:");
		String name = input.nextline();
		System.out.println("enter the 3 grades:");
        double grades [] = input.nextDouble();

       // print out
        System.out.println("the name of the Student is" + name "having the average grade of" + AverageGrade "while the total NumberOfStudent is" + NumberOfStudent );
        
          
        //creating constructors
        public Student (string name,Integer NumberOfStudents,Double grades) {

        }

        //getters and setters
        //get name
        public String getName(){   
        	return name;
        }
        //set name
        public void setName(String newName){
         this.name = name;
        }
        //get grades
        public double getGrades(){
        	return grades;
        }
        // set grades
        public void setGrades(double newgrades){
         this.grades = grades;
        }
        //get totalnumberostudents
          public static int getNumberOfStudents(){
             return NumberOfStudent;
            }
        //set totalnumberofstudents
          public Void setNumberOfStudents(int newNumberOfStudents){
            this.NumberOfStudent= NumberOfStudent;
            }
        //get average grades
          public double getAverageGrades( double [] grades){
          	double [] grades = new double[3] ;
          	AverageGrades = 0;
            double sum = 0.0;
            for (int i= 0; i < array.length ; i++ ) {
             sum = sum + grades[];
             }
             AverageGrades = sum/array.length;	
            	return AverageGrades;
            }
        //set average grades
          public Void setAverageGrades(){
           this.AverageGrades = AverageGrades;
           }
            
        System.out.println("the name of Student is" + name "there average grade is" + AverageGrade " and "  "the current number of Students is" + NumberOfStudents);

}     
    