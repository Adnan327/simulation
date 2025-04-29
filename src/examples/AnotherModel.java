package examples;

import desmoj.core.simulator.*;

public class AnotherModel extends Model {

     // WICHTIG: Öffentlicher parameterloser Konstruktor
    public AnotherModel() {
        super(null, "AnotherModel", true, true);
    }

    public AnotherModel(Model owner, String name, boolean showInReport, boolean showInTrace) {
        super(owner, name, showInReport, showInTrace);
    }

    @Override
    public String description() {
        return "Ein einfaches Simulationsmodell.";
    }

    @Override
    public void doInitialSchedules() {
        // Noch keine Events geplant
    }

    @Override
    public void init() {
    }
}