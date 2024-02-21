package lesson39.appV2.dto;

public class ClientRequestFind {
    private int id;
    private String name;


    public ClientRequestFind(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
