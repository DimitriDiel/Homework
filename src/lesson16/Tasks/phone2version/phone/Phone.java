package lesson16.Tasks.phone2version.phone;

public class Phone {
    private int imei;

    private SimCard simCard;

    private SimCard simCardTwo;

    private String model;

    private Case PhoneCase;



    public Phone(int imei, String model, Case phoneCase) {
        this.imei = imei;
        this.model = model;
        this.PhoneCase = phoneCase;
    }

    public int getImei() {
        return imei;
    }

    public SimCard getSimCard() {
        return simCard;
    }

    public void setSimCard(SimCard simCard) {
        this.simCard = simCard;
    }

    public Case getPhoneCase() {
        return PhoneCase;
    }

    public void setPhoneCase(Case phoneCase) {
        PhoneCase = phoneCase;
    }

    public String getModel() {
        return model;
    }

    public SimCard getSimCardTwo() {
        return simCardTwo;
    }

    public void setSimCardTwo(SimCard simCardTwo) {
        this.simCardTwo = simCardTwo;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "imei=" + imei +
                ", simCard=" + simCard +
                ", simCard2=" + simCardTwo +
                ", model='" + model + '\'' +
                ", PhoneCase=" + PhoneCase +
                '}';
    }
}
