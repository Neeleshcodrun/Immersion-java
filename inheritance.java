class person{
    String name;
    int age;
    person(String name ,int age){
        this.age=age;
        this.name=name;
    }
}
class Employee extends person{
    int empid;
    String designation;
    Employee(int empid,String designation,String name ,int age){
        super(name,age);
        this.empid=empid;
        this.designation=designation;
    }
}
class salary extends Employee{
    int basicsalary;
    int hra;
    int da;
    double gross;
    salary(int basicsalary,int hra,int da,int empid,String designation,String name ,int age){
       super(empid, designation, name, age);
        if(basicsalary<0||hra<0||da<0){
            System.out.println("salary value must be non-negative");
        }
        else{
            this.basicsalary=basicsalary;
            this.hra=hra;
            this.da=da;
            
    }
        }
     void calculateGrossSalary(){
        gross=basicsalary+hra+da;
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("empid: "+empid);
        System.out.println("designation: "+designation);
        System.out.println("gross: "+gross);
    }
}
@SuppressWarnings("unused")
class Main {
    public static void main(String[] args) {
       salary s1=new salary(60000,5600,3200,101,"AP","riya",22);
       s1.calculateGrossSalary();
    }
}
