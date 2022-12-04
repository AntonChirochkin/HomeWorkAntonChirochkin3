public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        {
            byte desk = 89;
            System.out.println("Значение переменной desk c типом byte равно " + desk +"." );
        }
        {
            short steel = 30000;
            System.out.println("Значение переменной steel c типом short равно " + steel +"." );
        }
        {
            int car = 1947583700;
            System.out.println("Значение переменной car c типом int равно " + car +"." );
        }
        {
            long man = 9223368544890234765l;
            System.out.println("Значение переменной man c типом long равно " + man +"." );
        }
        {
            float vip = 123.35f;
            System.out.println("Значение переменной vip c типом float равно " + vip +"." );
        }
        {
            double tor = 1223.8765578999958d;
            System.out.println("Значение переменной tor c типом double равно " + tor +"." );
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        {
            byte a = 67;
            System.out.println("Значение переменной a c типом byte равно " + a + ".");

            short b = -159;
            System.out.println("Значение переменной b c типом short равно " + b + ".");

            short c = 569;
            System.out.println("Значение переменной c c типом short равно " + c + ".");

            int d = 27897;
            System.out.println("Значение переменной d c типом int равно " + d + ".");

            long e = 987678965549l;
            System.out.println("Значение переменной e c типом long равно " + e + ".");

            float f = 27.12f;
            System.out.println("Значение переменной f c типом float равно " + f + ".");

            double g = 2.786d;
            System.out.println("Значение переменной g c типом double равно " + g + ".");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte classLP = 23;
        byte classAS = 27;
        byte classEA = 30;
        int numberStudents = classLP + classAS + classEA;
        short totalPaper = 480;
        int paperStudents = totalPaper / numberStudents;
        System.out.println("На каждого ученика расчитано " + paperStudents + " листов бумаги.");
    }

    public static void task4() {
        System.out.println("Задача 4");
        {
            byte  bottle = 16;
            byte min = 2;
            int bottleMIn = bottle / min;
            byte twentyMin = 20;
            int twentyMinbottle = bottleMIn * twentyMin;
            System.out.println("За " + twentyMin + " минут машина произвела " + twentyMinbottle + " штук бутылок.");
            byte day = 24;
            byte minuteHour = 60;
            int minuteHourDay = day * minuteHour;
            int dayBottle = minuteHourDay * bottleMIn;
            System.out.println("За сутки машина произвела " + dayBottle + " штук бутылок.");
            byte treeDay = 24 * 3;
            int treeDayMin = treeDay * minuteHour;
            int treeDayBottle = treeDayMin * bottleMIn;
            System.out.println("За три дня машина произвела " + treeDayBottle + " штук бутылок.");
            short month = 24 * 31;
            int monthMin = month * minuteHour;
            int monthBottle = monthMin * bottleMIn;
            System.out.println("За месяц машина произвела " + monthBottle + " штук бутылок.");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        {
           byte pots = 120;
           byte whiteColor = 2;
           byte brownColor = 4;
           int  classPots = whiteColor + brownColor;
           int howManyClasses = pots / classPots;
           int howManyWhiteColor = howManyClasses * whiteColor;
           int howManyBrownColor = howManyClasses * brownColor;
            System.out.println("В школе, где " + howManyClasses + " классов нужно " + howManyWhiteColor + " банок белой краски и " + howManyBrownColor + " банок коричневой краски.");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        {
            short banan = 80;
            short fiveBanans = 80 * 5;
            short milk = 105;
            short twoMilk = 105 * 2;
            short iceCream = 100;
            short twoIceCream = 100 * 2;
            short egg = 70;
            short fourEgg = 70 * 4;
            int howManyGrams = fiveBanans + twoMilk + twoIceCream + fourEgg;
            float kilogram = 1000l;
            float howManyKilograms = howManyGrams / kilogram;
            System.out.println("Общий вес спортзавтрака " + howManyGrams + " граммов или " + howManyKilograms + " килограмма.");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        {
          int day250Gr = 250;
          int day500Gr = 500;
          int weightKg = 7;
          float kilograms = 1000;
          float transferToKiloDay250Gr = day250Gr / kilograms;
          float transferToKiloDay500Gr = day500Gr / kilograms;
          float howDays250Gr = weightKg / transferToKiloDay250Gr;
          float howDays500Gr = weightKg / transferToKiloDay500Gr;
          float averageDay = weightKg / (transferToKiloDay250Gr + transferToKiloDay500Gr);
          System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то на похудение уйдет " + howDays250Gr + " дней.");
          System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то на похудение уйдет " + howDays500Gr + " дней.");
          System.out.println("В среднем чтобы добиться результата на похудение уйдет " + averageDay + " дней.");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        {
           int Masha = 67760;
           int Denis = 83680;
           int Christina = 76230;
           int MashaYearZp = Masha * 12;
           int DenisYearZp = Denis * 12;
           int ChristinaYearZp = Christina * 12;
           float newMashaZp = Masha * 0.1f + Masha;
           float newDenisZp = Denis * 0.1f + Denis;
           float newChristinaZp = Christina * 0.1f + Christina;
           float newMashaYearZp = newMashaZp * 12f;
           float newDenisYearZp = newDenisZp * 12f;
           float newChristinaYearZp = newChristinaZp * 12f;
           float MashaDifference = newMashaYearZp - MashaYearZp;
           float DenisDifference = newDenisYearZp - DenisYearZp;
           float ChristinaDifference = newChristinaYearZp - ChristinaYearZp;
           System.out.println("Маша теперь получает " + newMashaZp + " рублей. Годовой доход вырос на " + MashaDifference + " рублей.");
           System.out.println("Денис теперь получает " + newDenisZp + " рублей. Годовой доход вырос на " + DenisDifference + " рублей.");
           System.out.println("Кристина теперь получает " + newChristinaZp + " рублей. Годовой доход вырос на " + ChristinaDifference + " рублей.");
        }
    }
}