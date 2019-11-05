class Paper{
private int TotalMarks,per;
public Paper(int marks){
TotalMarks =marks;
}
public void Results(int Y){
float Per = (float)Y*100/TotalMarks;
if(Per>=60){
System.out.println("You have passed the exam");}
else{
System.out.println("You have failed the exam");
}

}
}