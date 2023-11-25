package com.transportSys.actiontable;

import com.transportSys.customers.CustomersWindow;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class CustomerAddAction extends AbstractAction {
    private CustomersWindow customersWindow;

    public CustomerAddAction(CustomersWindow window) {
        super("Add"); // "Add" is the name of the action
        this.customersWindow = window;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Generate and set the customer number when the action is triggered
        String customerNumber = customersWindow.generateCustomerNumber();
        customersWindow.setCustomerNumber(customerNumber);

        // Here, add any additional logic you need to handle for the add action
        // For example, opening a dialog to add a new customer, validating inputs, etc.
    }
}
