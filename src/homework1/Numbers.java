package homework1;

public class Numbers {
    public static void main(String[] args) {
        //Exercise 1
        {
            float fl1 = 3.14F; float fl2 = 42.0F;

            double db1 = fl1 + fl2;
            System.out.println(db1);
        }


        //Exercise 2
        {
            int numberOne = 13;
            int numberTwo = 12;
            int result = numberOne / numberTwo;
            int remainder = numberOne % numberTwo;

            System.out.println("При делении " + numberOne + " на " + numberTwo +
                    " результат равен " + result + ", остаток равен " + remainder);
        }

        {
            System.out.println(signChange(-5)); // Вызов метода из Exercise 3.1

            System.out.println(sumOfNumbers(5)); // Вызов метода из Exercise 3.2
        }


        {
            //Exercise 4.1
            int dayOfBirth = 2;
            int monthOfBirth = 12;
            int yearOfBirth = 2001;

            //Exercise 4.2
            int currentDay = 5;
            int currentMonth = 3;
            int currentYear = 2023;

            final int MONTH_IN_YEAR = 12;
            final int DAYS_IN_MONTH = 30;
            final int SECONDS_IN_DAY = 8400;

            int numberOfYearsPassed = currentYear - yearOfBirth;
            int numberOfMonthsPassed = (numberOfYearsPassed * MONTH_IN_YEAR) + (currentMonth - monthOfBirth);
            int numberOfDaysPassed = (numberOfMonthsPassed * DAYS_IN_MONTH) + (currentDay - dayOfBirth);
            int numberOfSecondsPassed = numberOfDaysPassed * SECONDS_IN_DAY;

            //Exercise 4.3
            System.out.println("Со дня моего рождения прошло");
            System.out.println("В годах: " + numberOfYearsPassed);
            System.out.println("В месяцах: " + numberOfMonthsPassed);
            System.out.println("В днях: " + numberOfDaysPassed);
            System.out.println("В секундах: " + numberOfSecondsPassed);

            if (1 <= monthOfBirth && monthOfBirth <= 3) {
                System.out.println("Я родился в первом квартале");
            }
            else if (4 <= monthOfBirth && monthOfBirth <= 6) {
                System.out.println("Я родился во втором квартале");
            }
            else if (7 <= monthOfBirth && monthOfBirth <= 9) {
                System.out.println("Я родился в третьем квартале");
            }
            else if (10 <= monthOfBirth && monthOfBirth <= 12) {
                System.out.println("Я родился в четвертом квартале");
            }
            else {
                System.out.println("Месяц введен некорректно");
            }

        }



    }

    //Exercise 3.1
    public static int signChange(int number) {

        return -number;

    }

    //Exercise 3.2
    public static int sumOfNumbers(int number) {

        int i = 0;
        int result = 0;

        while(i < number) {
            i++;
            result += i;
        }

        return result;
    }
}