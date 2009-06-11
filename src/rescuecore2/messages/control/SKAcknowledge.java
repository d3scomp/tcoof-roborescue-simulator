package rescuecore2.messages.control;

import rescuecore2.messages.Control;
import rescuecore2.messages.AbstractMessage;
import rescuecore2.messages.IntComponent;

/**
   A message for acknowleding a connection to the kernel.
 */
public class SKAcknowledge extends AbstractMessage implements Control {
    private IntComponent requestID;
    private IntComponent simulatorID;

    /**
       SKAcknowledge message with a undefined request ID and simulator ID components.
     */
    public SKAcknowledge() {
        super("SK_ACKNOWLEDGE", ControlMessageConstants.SK_ACKNOWLEDGE);
        requestID = new IntComponent("Request ID");
        simulatorID = new IntComponent("Simulator ID");
        addMessageComponent(requestID);
        addMessageComponent(simulatorID);
    }

    /**
       SKAcknowledge message with specific request ID and simulator ID components.
       @param requestID The value of the request ID component.
       @param simulatorID The value of the simulator ID component.
     */
    public SKAcknowledge(int requestID, int simulatorID) {
        this();
        this.requestID.setValue(requestID);
        this.simulatorID.setValue(simulatorID);
    }

    /**
       Get the request ID.
       @return The request ID component.
     */
    public int getRequestID() {
        return requestID.getValue();
    }

    /**
       Get the simulator ID.
       @return The simulator ID component.
     */
    public int getSimulatorID() {
        return simulatorID.getValue();
    }
}