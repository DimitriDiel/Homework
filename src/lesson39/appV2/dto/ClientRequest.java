package lesson39.appV2.dto;

public class ClientRequest {
    private int id;
    private String name;
    private String description;

    public ClientRequest(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
