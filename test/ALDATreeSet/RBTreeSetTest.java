package ALDATreeSet;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RBTreeSetTest {

    Set<String> treeSet = new RBTreeSet<>();

    @Test
    public void whenAddingElement_shouldAddElement() {
        assertTrue(treeSet.add("String Added"));
    }
    

}