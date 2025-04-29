package soal2;

// Student mewarisi dari Person
public class Student extends Person {
    public static final String FRESHMAN = "Mahasiswa Baru";
    public static final String SOPHOMORE = "Mahasiswa Tahun Kedua";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Class: Student, Name: " + name;
    }
}