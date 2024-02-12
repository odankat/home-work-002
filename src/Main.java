public class Main {
    public static void main(String[] args) {
// Задача 1
        int apple = 10000;
        byte knife = 2;
        short bags = 15;
        long cream = 100L;
        float many = 100.5F;
        double tea = 555.555;
        System.out.println("Значение переменной apple с типом int равно " + apple);
        System.out.println("Значение переменной knife с типом byte равно " + knife);
        System.out.println("Значение переменной bags с типом short равно " + bags);
        System.out.println("Значение переменной cream с типом long равно " + cream);
        System.out.println("Значение переменной many с типом float равно " + many);
        System.out.println("Значение переменной tea с типом double равно " + tea);
// Задача 2
        double b = 27.12;
        long a = 987678965549L;
        float c = 2.786F;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println(" b=" + b + " а=" + a + " c=" + c + " d=" + d + " e=" + e + " f=" + f + " g=" + g);
// Задача 3
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short listov = 480;
        int listovForSchoolboy = listov / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + listovForSchoolboy + " листов бумаги");
// Задача 4
        byte botle = 16;
        byte time = 2;
        int botleTime = botle / time; // кол-во бутылок в минуту
        // ниже все временные отрезки переводим в минуты
        byte time1 = 20; // тут все понятно
        short time2 = 24 * 60; // 1 день
        short time3 = 24 * 3 * 60; // 3 дня
        int time4 = 24 * 30 * 60; // месяц
        int workTime1 = botleTime * time1; // кол-во произведенных бутылок за 20 минут
        int workTime2 = botleTime * time2; // кол-во произведенных бутылок за сутки
        int workTime3 = botleTime * time3; // кол-во произведенных бутылок за 3 дня
        int workTime4 = botleTime + time4; // кол-во произведенных бутылок за месяц
        System.out.println("За 20 минут машина произвела " + workTime1 + " штук бутылок");
        System.out.println("За сутки машина произвела " + workTime2 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + workTime3 + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + workTime4 + " штук бутылок");
// Задача 5
        short dye = 120; // банок краски всего
        byte whiteDye = 2; // банок белой краски на класс
        byte brownDye = 4; // банок коричневой краски на класс
        int classRoom = dye / (whiteDye + brownDye); // сколько классов всего
        int whiteDyeAll = whiteDye * classRoom;
        int brownDyeAll = brownDye * classRoom;
        System.out.println("В школе, где " + classRoom + " классов, нужно " + whiteDyeAll + " банок белой краски и " + brownDyeAll + " банок коричневой краски ");
// Задача 6
        byte banan = 80;
        byte milk = 105;
        byte icecream = 100;
        byte egg = 70;
        int breakfast = (5 * banan) + (2 * milk) + (2 * icecream) + (4 * egg);
        System.out.println("Вес завтрака в граммах = " + breakfast);
        double breakfastKg = breakfast * 0.001;
        System.out.println("Вес завтрака в килограммах = " + breakfastKg);
// Задача 7
        short excessWeight = 7 * 1000;
        short sportEasy = 250;
        short sportHard = 500;
        int dayEasy = excessWeight / sportEasy;
        int dayhard = excessWeight / sportHard;
        int dayTyapLyap = (dayEasy + dayhard) / 2;
        System.out.println("При простой тренировке понадобится " + dayEasy + " дней, при интенсивной - " + dayhard + ", в среднем же похудение занимает - " + dayTyapLyap + " день.");
// Задача 8
        // зарплата до повышения
        int mashaMany = 67760 ;
        int denisMany = 83690 ;
        int kristinaMany = 76230 ;
        // зарплата после повышения
        int mashaManyNew = (mashaMany * 110) / 100;
        int denisManyNew = (denisMany * 110) / 100 ;
        int kristinaManyNew = (kristinaMany * 110) / 100;
        System.out.println(denisManyNew);
        // годовая зарплата до повышения
        int mashaManyYear = mashaMany * 12;
        int denisManyYear = denisMany * 12;
        int kristinaManyYear = kristinaMany * 12;
        // годовая зарплата после повышения
        int mashaManyYearNew = mashaManyNew * 12;
        int denisManyYearNew = denisManyNew * 12;
        int kristinaManyYearNew = kristinaManyNew * 12;
        // на сколько повысили годовую зарплату
        int masha = mashaManyYearNew - mashaManyYear;
        int denis = denisManyYearNew - denisManyYear;
        int kristina = kristinaManyYearNew - kristinaManyYear;
        System.out.println("Маша теперь получает " + mashaManyNew + " рублей. Годовой доход вырос на " + masha + " рублей.");
        System.out.println("Денис теперь получает " + denisManyNew + " рублей. Годовой доход вырос на " + denis + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaManyNew + " рублей. Годовой доход вырос на " + kristina + " рублей.");
    }


    }