package eCommerce;

import java.util.ArrayList;
import java.util.List;

public class Category extends CatelogComponent{
    List<CatelogComponent> children;

    public Category(String name){
        super(name);
        children = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("Category: " + this.getName());
        System.out.println("Inside " + this.getName() +" Category :");
        for(CatelogComponent c: this.children){
            c.print();
        }
    }

    public void addChild(CatelogComponent catelogComponent){
        children.add(catelogComponent);
    }

}
