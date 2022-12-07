public class Main {
    public static void main(String[] args) {

        Person maxim = new Person(1988, "Максим", "Минск", "бренд-менеджером");
        maxim.greeting();
        Person anya = new Person(1993, "Аня", "Москва", "методистом образовательных программ");
        anya.greeting();
        Person katya = new Person(1992, "Катя", "Килининград", "продакт-менеджером");
        katya.greeting();
        Person artem = new Person(1995, "Артем", "Москва", "директором по развитию бизнеса");
        artem.greeting();

        System.out.println("--------------------------------------------------------");

        Car lada = new Car("Lada", "Granta", 1.7, "желтого",
                2015, "России");
        lada.presentation();
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.8, "черный",
                2020, "Германии");
        audi.presentation();
        Car bmw = new Car("BMW", "Z8", 3.0, "черный",
                2021, "Германии");
        bmw.presentation();
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный",
                2018, "Южной Корее");
        kia.presentation();
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый",
                2016, "Южной Корее");
        hyundai.presentation();



    }
}