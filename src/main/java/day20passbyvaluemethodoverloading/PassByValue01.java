package day20passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {

/*
    1-Java "pass by value" sayesinde variable larin orjinal degerlerini koruma altina alir
     */


            double shirt = 100;

            discount ("student",shirt);
            System.out.println(shirt); //100

            double studentShirtPrice = discount ("student",shirt);
            System.out.println(studentShirtPrice); //90

            double veterantShirtPrice = discount ("veteran",shirt);
            System.out.println(veterantShirtPrice); //80

            double seniortShirtPrice = discount ("senior",shirt);
            System.out.println(seniortShirtPrice); //95

            shirt=discount("veteran",shirt);
             System.out.println(shirt);

        }

        public static double discount(String state, double price){

            switch (state){

                case "student":
                    price = price*0.90;
                    break;

                case "veteran":
                    price = price*0.80;
                    break;

                case "senior":
                    price = price*0.95;
                    break;

                default:
                    price = price;

            }

            return price;

        }}
