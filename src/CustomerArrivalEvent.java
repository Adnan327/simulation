import desmoj.core.simulator.*;

public class CustomerArrivalEvent extends Event<Customer> {

    public CustomerArrivalEvent(Model owner, String name, boolean showInTrace) {
        super(owner, name, showInTrace);
    }

    @Override
    public void eventRoutine(Customer customer) {
        sendTraceNote("Kunde " + customer.getName() + " ist angekommen!");

        // neuen Kunden erzeugen
        int nextId = Integer.parseInt(customer.getName().split("_")[1].split("#")[0]) + 1;
        Customer nextCustomer = new Customer(getModel(), "Kunde_" + nextId, true);

        // neues Event erzeugen und planen
        CustomerArrivalEvent nextArrival = new CustomerArrivalEvent(getModel(), "Ankunft_" + nextId, true);
        nextArrival.schedule(nextCustomer, new TimeSpan(5.0));
    }
}
