class Student
{
    void StudentName (String Name)
    {
        System.out.println("Name:"+Name);
    }
}
class Percentage extends Student
{
    void Subject (double per)
    {
        System.out.println("Percenatge:"+per);
    }
}
class Studentmarks extends Student
{
    void Subjectmarks (int marks)
    {
        System.out.println("Marks:"+marks);
    }
}
class Student_reports
{
    public static void main(String args[]) 
    {
        Student S1=new Student();
        S1.StudentName("omkar");

        Percentage P1=new Percentage();
        P1.StudentName("atish");
        P1.Subject(87.90);

        Studentmarks S2=new Studentmarks();
        S2.Subjectmarks(90);
        S2.StudentName("shubz");
    }
}