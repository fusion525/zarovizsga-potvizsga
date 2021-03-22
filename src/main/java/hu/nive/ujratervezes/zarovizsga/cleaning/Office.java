package hu.nive.ujratervezes.zarovizsga.cleaning;

public class Office implements Cleanable {

    private String address;
    private int area;
    private int floors;
    private final int COST_PER_AREA = 100;

    public Office(String address, int area, int floors) {
        this.address = address;
        this.area = area;
        this.floors = floors;
    }


    @Override
    public int clean() {

        return area * floors * COST_PER_AREA;
    }

    @Override
    public String getAddress() {

        return this.address;

    }
}
