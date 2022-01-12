package introexceptionthrow;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if ((name==null) || (name.isEmpty())) {
            throw new IllegalArgumentException("A név nem lehet üres!!");
        }
        if (yearOfBirth<1900){
            throw new IllegalArgumentException("A születési év minimum 1900-nak kell lennie!");
        }

        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
        Patient patient = new Patient("Kiss Géza", "123",1965);
        System.out.println("Az első beteg: "+patient.getName()+", születési ideje: "+patient.getYearOfBirth());

        Patient patient2 = new Patient(null, "222", 1962);
        System.out.println("A második beteg:"+patient2.getName()+", születési ideje: "+patient2.getYearOfBirth());
    }

}
