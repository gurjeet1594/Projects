class Main{
public static void main(String []args){
Marks X,Y;
X = new Marks();
Y = new Marks();
X.message();
X.maths =89;
X.bio=60;
X.chem=90;
X.doResults();

Y.message();
Y.maths =65;
Y.bio=55;
Y.chem=60;
Y.doResults();
}
}