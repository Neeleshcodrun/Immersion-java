public class student {
    int studentid;
    String studentname;
    String course;
    student() {
        studentid = 0;
        studentname = "Unknown";
        course = "Not Assigned";
    }
    student(int studentid){
        this.studentid=studentid;
        
    }
    student(int studentid,String studentname){
        this.studentid=studentid;
        this.studentname=studentname;
    }
    student(int studentid,String studentname,String course){
        this.studentid=studentid;
        this.studentname=studentname;
        this.course=course;
        
    }

    void displaydetails(){
        System.out.println("studentid"+" " +studentid);
        System.out.println("studentname"+" "+ studentname);
        System.out.println("course"+" "+ course);
        System.out.println();
    }

}
 class Main{

    public static void main(String[] args) {

    student s1=new student();
    student s2=new student(102);
    student s3=new student(103,"nitin");
    student s4=new student(104,"yogesh","m.com");
    s1.displaydetails();
    s2.displaydetails();
    s3.displaydetails();
    s4.displaydetails();

    }
 }