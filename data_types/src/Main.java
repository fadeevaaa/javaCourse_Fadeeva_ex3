public class Main {
    public static void main(String[] args) {
        String city = "Москва";
        int population = 13_149_000;
        byte percentOfUnemployed = 26;
        System.out.printf("1. Город: %s, население: %d человек, процент безработных: %d%%.\n", city, population, percentOfUnemployed);

        char section = 'A';
        int seat = 7;
        short ticketPrice = 560;
        System.out.printf("2. Секция на трибуне: %c, место: %d, стоимость билета: %d рублей.\n", section, seat, ticketPrice);

        String name = "Mariya";
        byte age = 25;
        short height = 170;
        System.out.printf("3. Имя: %s, возраст: %d лет, рост: %d см.\n", name, age, height);

        char numberSymbol = 'A';
        short carNumber = 111;
        int weight = 1200;
        System.out.printf("4. Номер машины: %c%d%c%c, вес автомобилмя: %d кг.\n", numberSymbol, carNumber, numberSymbol, numberSymbol, weight);

        String companyName = "Apple";
        long income = 391_000_000_000L;
        float marketPart = 17.3F;
        System.out.printf("5. Название компании: %s, годовой доход: %d долларов, доля на рынке: %.1f.\n", companyName, income, marketPart);

        char rh = '-';
        byte bloodType = 2;
        byte partOfPeople = 7;
        System.out.printf("6. Резус фактор: %c, группа крови: %d, доля людей: %d%%.\n", rh, bloodType, partOfPeople);

        String university = "МГУ";
        int numberOfStudents = 38_150;
        byte partOfExpelled = 5;
        System.out.printf("7. Название университета: %s, число студентов: %d, доля отчисленных: %d%%.\n", university, numberOfStudents, partOfExpelled);

        char filmRating = 'A';
        int numberOfSold = 30_000_000;
        float rating = 8.8F;
        System.out.printf("8. Рейтинг фильма: %c, копий продано: %d, рейтинг: %.1f.\n", filmRating, numberOfSold, rating);

        String brand = "Nike";
        long goodsProduced = 500_000_000;
        byte percentOfSales = 63;
        System.out.printf("9. Название бренда: %s, произведено товара: %d, процент продаж: %d%%.\n", brand, goodsProduced, percentOfSales);

        char productCategory = 'A';
        int barcode = 1233567890;
        byte percentOfBuyers = 44;
        System.out.printf("10. Категория товара: %c, штрихкод: %d, процент покупаетелей старше 30: %d%%.\n", productCategory, barcode, percentOfBuyers);
    }
}