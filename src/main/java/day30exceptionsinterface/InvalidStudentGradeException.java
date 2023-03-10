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


 */
public class InvalidStudentGradeException extends Exception {

    public InvalidStudentGradeException(String message) {

        super(message);

    }
}