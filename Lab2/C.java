public class C extends B{

 protected int x;

 public C(){

 	super();
 	x = 20;

 }


public int accessMyx(){

return x;

}

public int accessxParent(){

return super.x;

}

public int accessxGrandParent(){

return super.xvalueParent();

}



}