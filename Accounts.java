class Accounts{
public void Tax(){
System.out.println("Tax rate :"+21);
}
public void Tax(int A){
float T =(float)A*21/100;
System.out.println("Tax rate :"+T);
}
public void Tax(int B, int C){
float T =(float)B*C/100;
System.out.println("Tax rate :"+T);
}
}