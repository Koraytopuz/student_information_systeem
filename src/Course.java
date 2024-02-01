public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    Course(String name,String code,String prefix){
    this.name=name;
    this.code=code;
    this.prefix=prefix;
    int note =0;
    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
            System.out.println("Teacher and Course sections are the same");
        }else {
            System.out.println("Teacher and Course parts are not the same");
        }

    }
    void printTeacher() {
        this.teacher.print();
    }
}
