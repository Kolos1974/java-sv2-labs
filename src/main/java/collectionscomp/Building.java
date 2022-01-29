package collectionscomp;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Building implements Comparable<Building>{
    private String address;
    private int area;
    private int levels;

    public Building(String address, int area, int levels) {
        this.address = address;
        this.area = area;
        this.levels = levels;
    }

    @Override
    public int compareTo(Building o) {
        // return this.levels - ((Building) o).levels;
        return Integer.valueOf(levels).compareTo(o.levels);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return levels == building.levels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(levels);
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", area=" + area +
                ", levels=" + levels +
                '}';
    }

    public static void main(String[] args) {
        //Set<Building> buildings = new TreeSet<>();
        TreeSet<Building> tset = new TreeSet<>();
        tset.add(new Building("Bartók 1",56, 2));
        tset.add(new Building("Bartók 2", 60, 1));
        tset.add(new Building("Bartók 3", 85, 6));
        tset.add(new Building("Bartók 4", 45,3));
        tset.add(new Building("Bartók 5", 45,3));

        System.out.println(tset);

    }
}
