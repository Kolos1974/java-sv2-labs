package introexceptionthrow;

public class Validation {


    public void validateName(String name){
        if ((name == null) || (name.isBlank()) || (name.isEmpty())){
            throw new IllegalArgumentException("A név nem lehet üres!!");
        }
    }

    public void validateAge(String age){
        if ((age== null) || (age.isEmpty())) {
            throw new IllegalArgumentException("Nem adott meg értéket!!");
        }

        int ageNumber;
        try {
            ageNumber = Integer.parseInt(age);
        } catch (NumberFormatException nfe){
            throw new NumberFormatException("Hibás a megadott érték");
        }

        if ((ageNumber<0) || (ageNumber>120)) {
            throw new IllegalArgumentException("Az értéknek 0 és 120 között kell lennie!");
        }
    }
}
