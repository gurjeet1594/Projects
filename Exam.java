class Exams{
 public static void main (String [] args){
 float phy= 70;
 float chem= 80;
 float mat = 90;
 float total = phy+chem+mat;
 float percentage = total*100/450;
 if(percentage>=50){
   System.out.println(total);
   System.out.println(percentage);
   System.out.println("You have passed");
   }
   else{
    System.out.println("You have failed the exam");
	}
	}
	}