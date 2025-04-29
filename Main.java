package soal2;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alvn", "Bandung", "08123456789", "andi@email.com");
        Person p2 = new Student("Vina", "Jakarta", "0811111111", "budi@email.com", Student.SENIOR);
        Person p3 = new Employee("Nabil", "Yogyakarta", "0822222222", "citra@email.com", "Ruang A",
                    5000000, new MyDate(2022, 2, 15));
        Person p4 = new Faculty("Rifa", "Malang", "0833333333", "dedi@email.com", "Ruang B",
                    6000000, new MyDate(2020, 6, 10), "08:00-16:00", "Lektor");
        Person p5 = new Staff("Ridho", "Surabaya", "0844444444", "eka@email.com", "Ruang C",
                    4000000, new MyDate(2021, 3, 22), "Administrasi");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
    }
}