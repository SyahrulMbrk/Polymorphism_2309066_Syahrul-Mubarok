package soal2;

// Menggunakan final agar tidak bisa diwarisi
public final class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email,
                 String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public final String toString() {
        return "Class: Staff, Name: " + name;
    }
}