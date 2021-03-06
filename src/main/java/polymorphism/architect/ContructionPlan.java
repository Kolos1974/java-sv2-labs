package polymorphism.architect;

public class ContructionPlan extends PermitPlan{
    private int sheetsOfConstructionDrawings;

    public ContructionPlan(int pagesOfDocumentation, String title, String nameOfClient, String addressOfBuilding, int sheetsOfConstructionDrawings) {
        super(pagesOfDocumentation, title, nameOfClient, addressOfBuilding);
        this.sheetsOfConstructionDrawings = sheetsOfConstructionDrawings;
    }

    public int getSheetsOfConstructionDrawings() {
        return sheetsOfConstructionDrawings;
    }

}
