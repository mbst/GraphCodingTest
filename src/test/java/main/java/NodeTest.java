package main.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    public void testCorrectChild(){
        Node a = new Node("a");
        Node b = new Node("b");
        a.addChild(b);

        assertEquals(a.getChildren().stream().findAny().get(), b);
    }
}