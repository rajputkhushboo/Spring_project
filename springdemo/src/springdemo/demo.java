package springdemo;
import java.util.Iterator;
import java.util.List; 

public class demo {
private int x;
private int y;
private int z;
private List<String> list;
public void getZ() {
	System.out.println("product :" +(x*y));
}
public void setZ(int z) {
	this.z = z;
}
public List<String> getList() {
	return list;
}
public void setList(List<String> list) {
	this.list = list;
}
public void getX() {
	System.out.println("x is :" +x);
}
public void setX(int x) {
	this.x = x;
}
public void getY() {
	System.out.println("y is :" +y);
}

public void setY(int y) {
	this.y = y;
}
public void displayInfo(){  
   
    Iterator<String> itr=list.iterator();  
    while(itr.hasNext()){  
        System.out.println(itr.next());  
    }  
}
}