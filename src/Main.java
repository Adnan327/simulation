import desmoj.extensions.experimentation.ui.ExperimentStarterApplication;

public class Main {
    public static void main(String[] args) {
         // Neues Fenster (GUI-Anwendung von DESMO-J)
        ExperimentStarterApplication gui = new ExperimentStarterApplication();

        // Titel setzen
        gui.setTitle("Leeres DESMO-J Fenster");

        // Größe setzen
        gui.setSize(800, 600);

        // Fenster sichtbar machen
        gui.setVisible(true);
    }
}