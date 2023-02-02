package day30exceptionsinterface;

/*
Bazen kendi exception'imizi kendimiz uretiriz.
Neden oyle bir seye ihtiyac duyariz?
Normalde Java kendisi bir suru "exception" uretmistir. Java kurallari bildigi icin, olabilecek hatalarla
ilgili exception uremistir.
Java bu noktada hata yapmamizi engelliyor.
Exceptionslar kirimizi isiklar gibidir java kurallar kurar o kurallar disina cikmamizi engeller.

Ama kendimiz app olustururken javanin uretttiginin disinda kurallara ihtiyacimiz olabilir. (Okul app deki double note gibi negatif ve >100 olmamamli)
Bu durumlar icin biz kendimiz exception olustururuz.

System.err.println(e.getMessage());//err. hata mesajlarini kirmizi gostermek icin kullanilir.
//Urettigimiz exception'i compile time exception olmasini istiyorsak parent'i exception yap.

//Urettigimiz exception'i run time exception olmasini istiyorsak parent'i RunTimeException yap
 */
public class Exceptions03 {
    public static void main(String[] args) throws InvalidStudentGradeException {
        getTheNumberOfStudents(45);
    }
    public  static  void getStudentGrade(int grade){
if (grade<0 || grade>100){
    try {
        throw  new InvalidStudentGradeException("Student's grades can not be less than zero or grater than 100");
    } catch (InvalidStudentGradeException e) {
        throw new RuntimeException(e);
    }
}else{
    System.out.println(grade);
}

    }
    public  static  void getTheNumberOfStudents(int numOfStudents) throws InvalidStudentGradeException {
    if (numOfStudents<0)   {
        throw  new InvalidStudentGradeException("Student number cannot be negative");

    }else {
        System.out.println(numOfStudents);
    }
    }

}
