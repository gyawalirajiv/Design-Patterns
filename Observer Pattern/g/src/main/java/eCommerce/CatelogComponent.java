package eCommerce;

import java.util.ArrayList;
import java.util.List;

public abstract class CatelogComponent {

    private final String name;

    public CatelogComponent(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract void print();

}
