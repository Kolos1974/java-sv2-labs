package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<FamilyMember> familyMembers;

    public Family() {
        this.familyMembers = new ArrayList<>();
    }

    public List<FamilyMember> getFamilyMembers() {
        return familyMembers;
    }

    public void addFamilyMember(FamilyMember element){
        familyMembers.add(element);
    }


    public List<Integer> getAgesOfFamilyMembersWithNameGiven(String firstName) {
        List<Integer> result = new ArrayList<>();
        for (FamilyMember element : familyMembers){
            if (element.getName().contains(firstName)){
                result.add(element.getAge());
            }
        }
        return result;
    }
}
