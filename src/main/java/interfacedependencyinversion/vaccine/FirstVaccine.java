package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine{
    private List<Person> vaccinationList;

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        vaccinationList = new ArrayList<>();
        for (Person element : registrated){
            if (element.getPregnant()==Pregnancy.YES){
                vaccinationList.add(element);
            }
        }
        for (Person element : registrated){
            if (element.getAge()>65){
                vaccinationList.add(element);
            }
        }
        for (Person element : registrated){
            if ((element.getAge()<=65) && (element.getPregnant()==Pregnancy.NO)){
                vaccinationList.add(element);
            }
        }
    }
}
