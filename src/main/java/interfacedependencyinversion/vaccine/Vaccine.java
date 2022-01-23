package interfacedependencyinversion.vaccine;

import java.util.List;

public interface Vaccine {

    public abstract List<Person> getVaccinationList();

    public abstract void generateVaccinationList(List<Person> registrated);

}
