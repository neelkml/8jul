package neel;

import java.util.ArrayList;
import java.util.List;

public class JointLoanAccount  extends LoanAccount {
	
	public static void main(String args[])
	{
		//List<LoanAccount> account= new ArrayList<LoanAccount>();
		List<? extends Account> account= new ArrayList<LoanAccount>();
		// error //List<? super Account> account= new ArrayList<LoanAccount>();
		List< ? super JointLoanAccount> list= new ArrayList<LoanAccount>();
		List<? super JointLoanAccount> list1= new ArrayList<LoanAccount>();
	}

}
