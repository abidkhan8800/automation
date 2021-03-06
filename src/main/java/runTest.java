import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import TestCases.CDCDMode;
import TestCases.CDCMode;
import TestCases.CDDCMode;
import TestCases.CDMode;
import TestCases.CFCDCMode;
import TestCases.CFCMode;
import TestCases.CMode;
import TestCases.CleaningMode;
import TestCases.DMode;
import TestCases.FlushingMode;
import TestCases.FluxCMode;
import TestCases.FluxCVMode;
import TestCases.NWPMode;
import TestCases.VacuumMode;  

public class runTest {
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	   
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));  
		// TODO Auto-generated method stub
		CMode.main(null);
		now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		DMode.main(null);
		now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		CDMode.main(null);
		now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		CDCMode.main(null);
		now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		CFCMode.main(null);
		now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		CDCDMode.main(null);
		now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		CDDCMode.main(null);
		now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		CFCDCMode.main(null);
		now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		VacuumMode.main(null);
	    now = LocalDateTime.now();  
		System.out.println(dtf.format(now));  
		FlushingMode.main(null);
	    now = LocalDateTime.now();  
		System.out.println(dtf.format(now));  
		CleaningMode.main(null);
	    now = LocalDateTime.now();  
		System.out.println(dtf.format(now));  
		FluxCVMode.main(null);
	    now = LocalDateTime.now();  
		System.out.println(dtf.format(now));  
		FluxCMode.main(null);
	    now = LocalDateTime.now();  
		System.out.println(dtf.format(now));
		NWPMode.main(null);
	    now = LocalDateTime.now();  
		System.out.println(dtf.format(now));

	}

}
