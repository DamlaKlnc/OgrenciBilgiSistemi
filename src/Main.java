public class Main {
    public static void main(String[] args) {
        Course mat=new Course("Matematik","MAT101","MAT");
        Course fizik=new Course("Fizik","FZK101","FZK");
        Course kimya=new Course("KİMYA","KMY101","KMY");
        Course tarih=new Course("TARİH","TRH101","TRH");

        Teacher t1 =new Teacher("TANSI HOCA","2","TRH");
        Teacher t2=new Teacher("DAMLA HOCA","3","MAT");
        Teacher t3=new Teacher("ZEYNEP HOCA","4","FZK");

        mat.addTeacher(t2);
        tarih.addTeacher(t1);
        fizik.addTeacher(t3);
        kimya.addTeacher(t1);

        Student s1=new Student("İNEK ŞABAN",4,"15160",mat,fizik,kimya);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        Student s2=new Student("GÜDÜK NECMİ",4,"16145",mat,fizik,kimya);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3=new Student("NAİM SÜLEYMANOĞLU",10,"19999",mat,fizik,kimya);
        s3.addBulkExamNote(100,85,94);
        s3.isPass();
    }
}