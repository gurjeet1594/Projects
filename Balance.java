class Balance{
public static void main(String[] args) {
int Bill,Paid,Balance,sum;
Bill=1;
Paid=50;
sum = 0;
Balance=Paid-Bill;
while(Balance>0){
sum=sum+Balance%10;
Balance=Balance/10;
System.out.println(Balance);
}
}
}