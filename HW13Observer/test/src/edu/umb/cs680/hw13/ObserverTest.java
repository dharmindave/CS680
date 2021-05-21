package edu.umb.cs680.hw13;

import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw13.DJIAQuoteObservable;
import edu.umb.cs680.hw13.PieChartObserver;
import edu.umb.cs680.hw13.StockQuoteObservable;
import edu.umb.cs680.hw13.TableObserver;
import edu.umb.cs680.hw13.ThreeDObserver;

class ObserverTest {

    PieChartObserver pco = new PieChartObserver();
    TableObserver to = new TableObserver();
    ThreeDObserver threeo = new ThreeDObserver();
    DJIAQuoteObservable djiaObserver = new DJIAQuoteObservable();
    StockQuoteObservable stockObserver = new StockQuoteObservable();

    @Test
    void verifyDJIATest() {

        djiaObserver.addObserver(pco);
        djiaObserver.addObserver(to);
        djiaObserver.addObserver(threeo);
        djiaObserver.changeQuote(150);
        djiaObserver.changeQuote(250);

    }

    @Test
    void verifySTOCK() {

        stockObserver.addObserver(pco);
        stockObserver.addObserver(to);
        stockObserver.addObserver(threeo);
        stockObserver.changeQuote("dharmin", 15);
        stockObserver.changeQuote("dharmin1", 37);


    }


}