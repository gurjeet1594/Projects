class Array1{
public static void main (String []args){
int No1, No2;
float Result;
String Sign;
try{
No1 = Integer.parseInt(args[0]);
No2 = Integer.parseInt(args[2]);
Sign= args[1];
if(Sign.equals("/")){
Result = No1/No2;
}
if(Sign.equals("+")){
Result = No1+No2;
}
if(Sign.equals("*")){
Result = No1*No2;
}
if(Sign.equals("-")){
Result = No1-No2;
}
}
catch(ArrayIndexOutOfBoundsException X){
System.out.println("Only digits please");
}
catch(ArithmeticException X){
System.out.println("Only digits please");
}
catch(NumberFormatException X){
System.out.println("Only digits please");
}
}
}