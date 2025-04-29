package examples;
import desmoj.extensions.experimentation.ui.ExperimentStarterApplication;
import desmoj.extensions.experimentation.util.ExperimentRunner;

public class Gui {
    public static void main(String[] args) {
        
         // Neues Fenster (GUI-Anwendung von DESMO-J)
        ExperimentStarterApplication gui = new ExperimentStarterApplication(SimpleModel.class, ExperimentRunner.class);

        // Titel setzen
        gui.setTitle("Leeres DESMO-J Fenster");
        // Größe setzen
        gui.setSize(800, 600);
        // Fenster sichtbar machen
        gui.setVisible(true);
        // Fenster zentrieren
        gui.setLocationRelativeTo(null);
        // Schließen der Anwendung beim Fensterschließen
        gui.setDefaultCloseOperation(ExperimentStarterApplication.EXIT_ON_CLOSE);
    }
}

