package examples;
import desmoj.core.simulator.*;

public class SimpleModel extends Model {

     // WICHTIG: Öffentlicher parameterloser Konstruktor
    public SimpleModel() {
        super(null, "SimpleModel", true, true);
    }

    public SimpleModel(Model owner, String name, boolean showInReport, boolean showInTrace) {
        super(owner, name, showInReport, showInTrace);
    }

    @Override
    public String description() {
        return "Ein einfaches Simulationsmodell.";
    }

    @Override
    public void doInitialSchedules() {
    }

    @Override
    public void init() {
        Customer firstCustomer = new Customer(this, "Kunde_1", true);
        CustomerArrivalEvent firstArrival = new CustomerArrivalEvent(this, "Erste Ankunft", true);
        firstArrival.schedule(firstCustomer, new TimeSpan(0.0));
    }
}
