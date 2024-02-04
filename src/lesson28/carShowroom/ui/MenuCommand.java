package lesson28.carShowroom.ui;

public interface MenuCommand {
    void executeCommand();

    String getMenuName();
    boolean shouldExit();
}
