package main.java;

import java.util.HashSet;
import java.util.Set;

public class Node {
    public String name;
    public Set<Node> children;

    public Node(String name) {
        this.name = name;
    }

    public void addChild(Node child){
        this.children = new HashSet<>();
        this.children.add(child);
    }

    public Set<Node> getChildren(){
        return children;
    }


}
