package polymorphism.architect;

import recursion.Palindrome;

public class Architect {

    public static void main(String[] args) {
        Plan plan1 = new SketchPlan(12,"SketchPlan");
        Plan plan2 = new PermitPlan(13,"PermitPlan", "Hid Zrt", "Mol székház");
        Plan plan3 = new ContructionPlan(15, "Construction", "Client", "Address", 25);

        SketchPlan sketchPlan1 = new SketchPlan(12,"SketchPlan");
        SketchPlan sketchPlan2 = new PermitPlan(13,"PermitPlan", "Hid Zrt", "Mol székház");
        SketchPlan sketchPlan3 = new ContructionPlan(15, "Construction", "Client", "Address", 25);

        Header header1 = new PermitPlan(13,"PermitPlan", "Hid Zrt", "Mol székház");
        Header header2 = new ContructionPlan(15, "Construction", "Client", "Address", 25);

        PermitPlan permitPlan1 = new PermitPlan(13,"PermitPlan", "Hid Zrt", "Mol székház");
        PermitPlan permitPlan2 = new ContructionPlan(15, "Construction", "Client", "Address", 25);

        ContructionPlan contructionPlan = new ContructionPlan(15, "Construction", "Client", "Address", 25);

        System.out.println(plan1.getPagesOfDocumentation());
        System.out.println(plan2.getPagesOfDocumentation());
        System.out.println(plan3.getPagesOfDocumentation());

        System.out.println(sketchPlan1.getPagesOfDocumentation()+" "+ sketchPlan1.getTitle());
        System.out.println(sketchPlan2.getPagesOfDocumentation()+" "+ sketchPlan2.getTitle());
        System.out.println(sketchPlan3.getPagesOfDocumentation()+" "+ sketchPlan3.getTitle());

        System.out.println(header1.getAddressOfBuilding()+" "+header1.getNameOfClient());
        System.out.println(header2.getAddressOfBuilding()+" "+header2.getNameOfClient());

        System.out.println(permitPlan1.getAddressOfBuilding()+" "+permitPlan1.getNameOfClient()+" "+permitPlan1.getHeader());
        System.out.println(permitPlan2.getAddressOfBuilding()+" "+permitPlan2.getNameOfClient()+" "+permitPlan2.getHeader());

        System.out.println(contructionPlan.getTitle()+" "+contructionPlan.getHeader()+" "+contructionPlan.getAddressOfBuilding()+" "+
                            contructionPlan.getNameOfClient());

    }
}
