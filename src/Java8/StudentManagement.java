package Java8;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}
@FunctionalInterface
interface bonusCalculator {
    int addBonus(int marks);
}
public class StudentManagement {
	// Method Reference Target
    static void printStudentDetails(Student s) {
        System.out.println("ID    : " + s.id);
        System.out.println("Name  : " + s.name);
        System.out.println("Marks : " + s.marks);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generate default student id - supplier
		Supplier<Integer> idSupplier = () -> (int)(Math.random() * 1000);
		
		//Predicate student pass with marks >= 40
		Predicate<Student> isPass= (s) -> s.marks >= 40;
		
		//Function - Calculate grade based on marks
		Function<Student,String> grade = s -> {
			if(s.marks>=80) return "A";
			else if(s.marks>=60) return "B";
			else if(s.marks>=50) return "C";
			else return "fail";
		};
		
		//Consumer print student details - used method reference here
		 Consumer<Student> printStudent = StudentManagement::printStudentDetails;
		 
		//Biconsumer - update student marks
		 BiConsumer<Student, Integer> updateMarks =
	                (s, newMarks) -> s.marks = newMarks;
	    
	    //custom functional interface -> add bonus marks
	    bonusCalculator bonus= marks -> marks + 15;
	    
	    //creating student 
	    Student student = new Student(
                idSupplier.get(),
                "Lakisha",
                43
        );
	    
	    //updated marks
	    int updatedMarks = bonus.addBonus(student.marks);
        updateMarks.accept(student, updatedMarks);
        
        //printing student
        printStudent.accept(student);
        
        //checking pass/fail
        Supplier<String> status = () -> { 
        	if(isPass.test(student)) {
        		 return "PASS";
        	}else {
        		return "FAIL";
        	}
        };
        System.out.println("Status : " + status.get());
        
        //grading 
        System.out.println("Grade : " + grade.apply(student));

	}

}
