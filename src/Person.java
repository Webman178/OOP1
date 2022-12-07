public class Person {

    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    Person(int yearOfBirth, String name, String town, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        }
        this.name = name;
        if (this.name == null) {
            this.name = "Информация не указана";
        }
        this.town = town;
        if (this.town == null) {
            this.town = "Информация не указана";
        }
        this.jobTitle = jobTitle;
        if (this.jobTitle == null) {
            this.jobTitle = "Информация не указана";
        }
    }



        void greeting() {
            System.out.println("Привет! Меня зовут " + name + ". Я из города " + town +
                    ". Мой год рождения " + yearOfBirth + ". Я работаю на должности " + jobTitle + ". Будем знакомы!");
        }


}
