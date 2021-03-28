package edu.umb.cs680.hw01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeGeneratorTest {
    @Test

    public  void constructortest() {
        PrimeGenerator primenumbers=new PrimeGenerator(1,100);
        primenumbers.generatePrimes();

//		LinkedList <String> asserted = new LinkedList<String>();
//		Iterator<Long> it = asserted.iterator();
//	    while(it.hasNext()) {
//		System.out.print(it.next() + ", ");
//		}
        Long[] expectprimes= {2L,3L,5L,7L,11L, 13L, 17L, 19L, 23L, 29L, 31L, 37L, 41L, 43L, 47L, 53L, 59L, 61L, 67L, 71L, 73L, 79L, 83L, 89L, 97L};
        assertArrayEquals(expectprimes,primenumbers.getPrimes().toArray() ,"done with the primes");
    }

    @Test
    public void iseven() {
        PrimeGenerator primenumbers=new PrimeGenerator(1,100);
        boolean expected =true;
        boolean asserted =primenumbers.isEven(10);
        assertEquals(expected,asserted);
    }
    @Test
    public void isprime() {
        PrimeGenerator primenumbers=new PrimeGenerator(1,100);
        boolean expected =true;
        boolean asserted =primenumbers.isPrime(3);
        assertEquals(expected,asserted);
    }
    @Test
    public  void Constructortest() {
        PrimeGenerator primenumbers = new PrimeGenerator(1,10);
        primenumbers.generatePrimes();

        Long[] expectprimes= {2L,3L,5L,7L};
        assertArrayEquals(expectprimes,primenumbers.getPrimes().toArray() ,"done with the primes");
    }

    

}

