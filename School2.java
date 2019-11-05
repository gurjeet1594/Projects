class School2 {
    private int chem, phy, total, invalid, failed;
    public void Physics(int A) {
        if (A >= 0 && A <= 150) {
            phy = A;

        }
        if (phy < 60) {
			failed++;
        } else {
            System.out.println("invalid physics marks");
            invalid = 1;
        }
    }
    public void Chemistry(int B) {
        if (B >= 0 && B <= 150) {
            chem = B;
        }
        if (chem < 60) {
			failed++;
        } else {
            System.out.println("Invalid chemistry marks");
            invalid = 1;
        }
    }
	

    public void showResults() {
        if (invalid == 0) {
         
			 total = chem + phy;
            System.out.println("Chem:"+chem+"Phy:"+phy);
        } else {

            System.out.println("cannot calculate the result::" + invalid);
        }
		if (failed == 0) {
                System.out.println("passed exam");
            }
			if (failed ==1) {
                System.out.println("Retake exam");
            }
			if (failed == 2) {
                System.out.println("Repeat exam");
            }
			if (failed == 3) {
                System.out.println("Go home");
            }
    }
	
	
}












