package lesson16.tasks.phone2version.phone;

import java.util.Arrays;

public class Phone {
    private int imei;

    private SimCard[] simSlots = new SimCard[2];

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


    public Case getPhoneCase() {
        return PhoneCase;
    }

    public void setPhoneCase(Case phoneCase) {
        PhoneCase = phoneCase;
    }

    public String getModel() {
        return model;
    }

    public SimCard getSimSlots(int slotNumber) {
        return simSlots[slotNumber];
    }

    public void setSimSlots(int slotNumber, SimCard simCard) {
        this.simSlots[slotNumber] = simCard;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "imei=" + imei +
                ", simCard=" + Arrays.toString(simSlots) +
                ", model='" + model + '\'' +
                ", PhoneCase=" + PhoneCase +
                '}';
    }
}
