
package estruturas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {
    @Test 
    void newTreeIsEmpty() {
        PrefixTree tree = new PrefixTree();
        boolean expected = true;
        boolean actual = tree.isEmpty(); 
        assertEquals(expected, actual);
    }

    @Test 
    void newTreeHasSizeZero() {
        PrefixTree tree = new PrefixTree();
        int expected = 0;
        int actual = tree.size(); 
        assertEquals(expected, actual);
    }

    @Test 
    void afterAddTreeIsNotEmpty() {
        PrefixTree tree = new PrefixTree();
        tree.add("a");
        boolean expected = false;
        boolean actual = tree.isEmpty(); 
        assertEquals(expected, actual);
    }

    @Test 
    void addAHasSizeOne() {
        PrefixTree tree = new PrefixTree();
        tree.add("a");
        int expected = 1;
        int actual = tree.size(); 
        assertEquals(expected, actual);
    }


    @Test 
    void addFirstWord() {
        PrefixTree tree = new PrefixTree();
        tree.add("casa");
        int expected = 4;
        int actual = tree.size(); 
        assertEquals(expected, actual);
    }    



    @Test 
    void addTwoWordsSamePrefix() {
        PrefixTree tree = new PrefixTree();
        tree.add("aa");
        tree.add("ab");
        int expected = 3;
        int actual = tree.size(); 
        assertEquals(expected, actual);
    }   
}
