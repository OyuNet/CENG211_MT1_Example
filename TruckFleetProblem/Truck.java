class Truck {

    private Integer id;
    private String color;
    private Integer mass;
    private Integer road;

    public Truck(Integer id, String color, Integer mass, Integer road) {
        this.id = id;
        this.color = color;
        this.mass = mass;
        this.road = road;
    }

    public String getTruckColor() {
        return new String(color);
    }

    public String setTruckColor(String color) {
        this.color = color;
        return new String(this.color);
    }

    public Integer getTruckId() {
        return Integer.valueOf(this.id);
    }

    public Integer setTruckId(Integer id) {
        this.id = id;
        return Integer.valueOf(this.id);
    }

    public Integer getMass() {
        return Integer.valueOf(this.mass);
    }

    public Integer setMass(Integer mass) {
        this.mass = mass;
        return this.mass;
    }

    public Integer getRoad() {
        return Integer.valueOf(this.road);
    }

    public Integer setRoad(Integer road) {
        this.road = road;
        return road;
    }
}
