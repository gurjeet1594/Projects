class Balance2{
public static void main(String[] args) {
int Bill,Paid,Balance,sum;
Bill=1;
Paid=50;
sum = 0;
Balance=Paid-Bill;
int fifty,twenty,ten,five,two,one;
fifty=twenty=ten=five=two=one=0;

if(Balance>=50){
fifty = Balance/50;
Balance=Balance -fifty*50;
System.out.println("50 Pounds:"+fifty);
}

if(Balance>=20){
twenty= Balance/20;
Balance=Balance-twenty*20;
System.out.println("20 Pounds:"+twenty);
}

if(Balance>=10){
ten= Balance/10;
Balance=Balance-ten*10;
System.out.println("10 Pounds:"+ten);
}

if(Balance>=5){
five = Balance/5;
Balance= Balance-five*5;
System.out.println("5 Pounds:"+five);
}
if(Balance>=2){
two= Balance/2;
Balance=Balance-two*2;
System.out.println("2 Pounds:"+two);
}
if(Balance>=1){
one= Balance/1;
Balance=Balance-one*1;
System.out.println("1 Pounds:"+one);
}
}
}