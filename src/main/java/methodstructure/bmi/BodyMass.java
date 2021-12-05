package methodstructure.bmi;

public class BodyMass {
    private double weight;
    private double height;

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getBodyMassIndex(){
        return weight/(height*height);
    }

    public BmiCategory getBody(){
        double result = getBodyMassIndex();
        if (result<18.5) {
            return BmiCategory.UNDERWEIGHT;
        }
        if (result>25) {
            return BmiCategory.OVERHEIGHT;
        }
        return BmiCategory.NORMAL;
    }

    public boolean isThinnerThan(BodyMass other){
        if (this.getBodyMassIndex()<other.getBodyMassIndex()) {
            return true;
        }
        return false;

    }

}
