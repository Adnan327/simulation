import desmoj.core.simulator.*;

public class CustomerArrivalEvent extends Event<Customer> {

    public CustomerArrivalEvent(Model owner, String name, boolean showInTrace) {
        super(owner, name, showInTrace);
    }

    @Override
    public void eventRoutine(Customer customer) {
        sendTraceNote("Ein Kunde ist angekommen!");

        Customer newCustomer = new Customer(getModel(), "Neuer Kunde", true);
        CustomerArrivalEvent nextArrival = new CustomerArrivalEvent(getModel(), "Next Arrival", true);
        nextArrival.schedule(newCustomer, new TimeSpan(5.0));
    }
}
