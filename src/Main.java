//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int firstFriday = 1;
        for (int i = 1; i <= 31; i++) {
            if ((i - firstFriday) % 7 == 0 )
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println(" ");
        System.out.println("Задание 2/1");
        int distance = 0;
        int distanceTotal = 42195;
        int distanceTraveled = 0;
        do {
            System.out.println("держись! Осталось " + distanceTraveled + " метров");
            distance += 500;
            distanceTraveled = distanceTotal - distance;
        } while (distance <= 42195);

        System.out.println();
        System.out.println("Задание 2/2");
        for (int i = 42195; i >= 0; i -= 500) {
            System.out.println("держись! Осталось " + i + " метров");
        }

        System.out.println();
        System.out.println("Задание 3/1");
        int money = 600;
        int day = 0;
        while (money >= 100) {
            day++;
            if (day % 5 == 0) {
                continue;
            }
            money -= 100;

        }
        System.out.println("Вщзможно оставить машину на " + day + " дней");
        System.out.println();
        System.out.println("Задание 3/2");
        for (; money >= 100; ) {
            day++;
            if (day % 5 == 0) {
                continue;
            }
            money -= 100;
        }
        System.out.println("Вщзможно оставить машину на " + day + " дней");

        System.out.println();
        System.out.println("Задание 4");
        int month = 0;
        int total = 0;
        while (true) {
            month++;
            total += 15000;
            if (month % 6 == 0) {
                total *= 1.07;
            }
            System.out.println("Месяц " + month + " Сумма " + total + " р.");
            if (total >= 12_000_000) {
                break;
            }
        }
        System.out.println();
        System.out.println("Задание 5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats <= 3) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                minute += 2;
                if (overheats > 3) {
                    break;
                }
                System.out.println("Перегрев, остановлена зарядка на 2 минуты.");
                continue;
            }

            charge += 2;
        }
        if (overheats > 3) {
            System.out.println("Зарядка прекращена. Текущий заряд " + charge + " %");
        } else {
            System.out.println("Зарядка прекращена. текущий заряд- 100%");
        }
        System.out.println("Общее время потраченное на зарядку " + minute + " минут.");
    }
}