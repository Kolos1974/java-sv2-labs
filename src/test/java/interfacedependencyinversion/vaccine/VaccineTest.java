package interfacedependencyinversion.vaccine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VaccineTest {
    Vaccine vaccine;
    List<Person> peoples;

    @BeforeEach
    void init(){
        peoples = new ArrayList<>();
        peoples.add(new Person("Kiss József", 23, ChronicDisease.NO, Pregnancy.NO));
        peoples.add(new Person("Kiss Ágnes", 21, ChronicDisease.NO, Pregnancy.YES));
        peoples.add(new Person("Horvát Béla", 73, ChronicDisease.YES, Pregnancy.NO));
        peoples.add(new Person("Nagy Péter", 53, ChronicDisease.NO, Pregnancy.NO));
        peoples.add(new Person("Nagy Anna", 33, ChronicDisease.YES, Pregnancy.NO));
        peoples.add(new Person("Szabó József", 63, ChronicDisease.NO, Pregnancy.NO));
        peoples.add(new Person("Szabó Emma", 23, ChronicDisease.YES, Pregnancy.YES));


    }


    @Test
    void testFirstVaccine(){
        vaccine = new FirstVaccine();
        vaccine.generateVaccinationList(peoples);
        assertEquals(7, vaccine.getVaccinationList().size());
        assertEquals(Pregnancy.YES, vaccine.getVaccinationList().get(0).getPregnant());
        assertEquals(Pregnancy.NO, vaccine.getVaccinationList().get(vaccine.getVaccinationList().size()-1).getPregnant());


        //System.out.println(vaccine.getVaccinationList());
    }

    @Test
    void testSecondVaccine(){
        vaccine = new SecondVaccine();
        vaccine.generateVaccinationList(peoples);

        assertEquals(3, vaccine.getVaccinationList().size());
        assertTrue(vaccine.getVaccinationList().get(0).getAge()<=65);

        //System.out.println(vaccine.getVaccinationList());
    }



}