class Marks{
int maths,chem,bio;
private int total;
public int doResults(){
	total=maths+chem+bio;
}
public void message(){
	doResults();
	System.out.println(total);
    System.out.println("Pass");
}
}
