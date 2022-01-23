package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine{
    private List<Person> vaccinationList;

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        vaccinationList = new ArrayList<>();
        for (Person element: registrated){
            if ((element.getPregnant()==Pregnancy.NO) &&  (element.getChronic()==ChronicDisease.NO) && (element.getAge()<=65)) {
                vaccinationList.add(element);
            }
        }
        for (Person element: registrated){
            if ((element.getPregnant()==Pregnancy.NO) &&  (element.getChronic()==ChronicDisease.NO) && (element.getAge()>65)) {
                vaccinationList.add(element);
            }
        }
    }
}
