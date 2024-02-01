public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Koray","HST","555");

       Teacher t2=new Teacher("Topuz","MTH","0000");

       Teacher t3=new Teacher("Tpz","BIO","1111");

       Course history=new Course(" History","101"," HST");
       history.addTeacher(t1);

       Course physical=new Course("Physical","102","PHY");
       physical.addTeacher(t2);

       Course biology=new Course("Biology","101","BIO");
       biology.addTeacher(t3);

       Student s1=new Student("Kry","123,","4", history,physical,biology);
       s1.addBulkExamNote(100,70,50);
       s1.isPass();
       Student s2=new Student("Korayy","456","3",history,physical,biology);
       s2.addBulkExamNote(80,60,90);
       s2.isPass();
    }
}