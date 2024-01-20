package lesson16.tasks.phone2version.phone;

public class Case {

    private String color;

    private String material;

    public Case(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Case{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
