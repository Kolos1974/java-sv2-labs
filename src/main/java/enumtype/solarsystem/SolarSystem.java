package enumtype.solarsystem;

public enum SolarSystem {
    MERCUR(0), VENUS(0), EARTH(1), MARS(2), JUPITER(12), SATURN(13),  URANUS(6), NEPTUN(9), PLUTO(0);

    private final int moons;

    SolarSystem(int moons) {
        this.moons = moons;
    }

    public int getMoons() {
        return moons;
    }
}
