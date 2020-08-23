# Java-PracticeCode

				***************************JAVA TUTORIAL************************
				
-extention use to save file is .java
-javac filename.java
-java filename

Access specifier in javais of 4 types 
public,private,protected,default but in c/c++ only 3 types 

int x=3;
float x=5.2f			//end with f
hexadecimal value x=0x45  	//start with 0x
octal value x=025     		//start with 0

class 2 type = primitive/non primitive

-In java file we cant make to public classes in 1 code. only 1 public class in possible in
 which our {public static void main() } fun is there.
-Static variable dnt need object to call.it can directly be call 
-if static variable is private than can called by static membr fun.
-static member fun can call only his static variables in his class not instance variable.
-Use of static is Ex if we make record of student than variables will be name,rollno
 marks,fathername(instance variable unique for all) but for schoolname,classno,
 classroomno,classteacher(static variable same for all) no need to make indivually for all.

-valueOf()
-parseXxx()
-xxxValue()

OVERLOADING
-for overloading funtn with different signature[f1(int x) f1(intx,int y) ] is there 
 eith in same class or in diff class
OVERRIDING
-for overriding fun should have same sign [f1(int x) f1(int x) ] and should be present
 diff class and by extend we override parent fun and use child f1

ABSTRACT
-we cant make object of a abstract class (y we need ex Person and Student ,Facult extend Person)
 so we dnt need to make obj of person class;
-abstrach class we have than we can have abstract method or no abstact methd but
 if we have abstract METHod present in class than we have to make (or write keyword)
 abstract before class.(othws error)

INTERFACE
-instead of writing class we write interface
-we cant make object of interface
-in interface if we make any method inside that than by default it will be abstract and public
-varible inside is by default is pubic static final   
-to inherit interface we use implements(instead of extend) to use  
-class to interface or vice  versa we use (implements)
-class to class or interface to interface we use (extends)

SORT
-run Collections.sort(arr)


 
 
						*********************  	CODES TO LEARN CONCEPTS     *************************
 
 1.INTERFACE CONCEPT
 
Interface I1
{void f1()}
Interface I2
{void f2()}
class A implements I1,I2
{
void f1() {  } 
void f2() {  }
void f3() {  }

}
public class Example
{
 public static void main(string [] args)
 { 
 I2 obj =new A()
 obj.f1();  // error I2 refrence can refer I1 methds
 obj.f2();  
 obj.f3();  // error its in class not in I2
 }
}

 
 
