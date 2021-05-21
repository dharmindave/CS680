package edu.umb.cs680.hw013;

import static org.junit.jupiter.api.Assertions.*;


import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;

public class MulticastTest {

    private final ByteArrayOutputStream contentoutput = new ByteArrayOutputStream();
    private final ByteArrayOutputStream contenterror = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(contentoutput));
        System.setErr(new PrintStream(contenterror));
    }

    @Test
    public void DJIAEventTest() {

        DJIAQuoteObservable dq = new DJIAQuoteObservable();
        _3DObserver td = new _3DObserver();
        PiechartObserver pco = new PiechartObserver();
        TableObserver to = new TableObserver();

        dq.addEventListner(to);
        dq.addEventListner(pco);
        dq.addEventListner(td);

        dq.notifyObservers(new DJIAEvent(dq));
        assertEquals("Updating Table for DJIA quote value: Updating Piechart for DJIA quote value: Updating 3D Chart for DJIA quote value: ", contentoutput.toString());
    }

    @Test
    public void STOCKEventTest() {

        StockQuoteObservable s = new StockQuoteObservable();

        TableObserver to = new TableObserver();
        PiechartObserver pco = new PiechartObserver();
        _3DObserver td = new _3DObserver();

        s.addEventListner(to);
        s.addEventListner(pco);
        s.addEventListner(td);

        s.notifyObservers(new StockEvent(s));
        assertEquals("Updating Table for StockEvent quote value: Updating Piechart for StockEvent quote value: Updating 3D Chart for StockEvent quote value: ", contentoutput.toString());
    }
}