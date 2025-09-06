import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays; 

/*sample tests for homework. you will need to add to these */

public class PrimeNumberFinderTest{

    //Instantiate class - this will cover the constructor of the class
    @Test
    public void instantiateClass(){
      PrimeNumberFinder myPrime=new PrimeNumberFinder();
    }

    
    //Tests for the findPrimes method (you can add to these)
    @Test
    public void testFindPrimes1() {
       List<Integer> primes = PrimeNumberFinder.findPrimes(2,8);
       List<Integer> expected = Arrays.asList(2,3,5,7);
       assertArrayEquals(expected.toArray(),primes.toArray());
    }

    //test for isPrime
   @Test
    public void testIsPrime1() {
        assertTrue(PrimeNumberFinder.isPrime(23));
    }

    //test for a non-prime number
    @Test
    public void testIsPrime2() {
        assertFalse(PrimeNumberFinder.isPrime(10));
    }
    
    //tests for the sumofP method - note the list provided is the list of primes
    // to be summed - not the lower and upper bound

    @Test
    public void sumofP1() {
	List<Integer> input = Arrays.asList(5,7);
	assertEquals(12,PrimeNumberFinder.computeSumOfPrimes(input));
    }

    // New test(s) for isPrime
    @Test
    public void negNumIsNotPrime() {
        assertFalse(PrimeNumberFinder.isPrime(-1));
    }

    @Test
    public void testDivByThreeNotPrime() {
        assertFalse(PrimeNumberFinder.isPrime(9));
    }

    @Test
    public void testDivByFiveNotPrime() {
        assertFalse(PrimeNumberFinder.isPrime(25));
    }

    @Test
    public void testLargeNotPrime() {
        assertFalse(PrimeNumberFinder.isPrime(121));
    }

    @Test
    public void testIsPrime3() {
        assertFalse(PrimeNumberFinder.isPrime(49));
    }

    // New test(s) for full coverage
    @Test
    public void sumofP2() {
        List<Integer> input = Collections.singletonList(1);
        assertEquals(1,PrimeNumberFinder.computeSumOfPrimes(input));
    }

    // Fault 1
    @Test
    public void oneIsNotPrime() {
        assertFalse(PrimeNumberFinder.isPrime(1));
    }

    // Fault 2
    @Test
    public void upperBoundShouldBeInclusive() {
        assertEquals(Collections.singletonList(5), PrimeNumberFinder.findPrimes(5,5));
    }

    // Exception 1
    @Test
    public void emptyListSum() {
        assertEquals(0, PrimeNumberFinder.computeSumOfPrimes(Collections.emptyList()));
    }
}
