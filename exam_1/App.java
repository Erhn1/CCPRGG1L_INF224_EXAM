public class App {
    public static void main(String[] args) {

    Student chr = new Student();

    chr.surname = "Alejaga";
    chr.firstName = "CharlesErhn";
    chr.middleInitial = "S";
    chr.dateOfBirth = "04/05/2004";
    chr.studentNumber = 2022104636;
    chr.studentEmailAddress = "alejagacs@students.national-u.edu.ph";
    chr.iAmAwesome = true;

    chr.sayMyStudentNumber();
    chr.sayMystudentEmailAddress();
    chr.sayiAmAwesome();
    }
}
