package date_Time_Calender;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Date d= new Date();
			
			SimpleDateFormat sdf= new SimpleDateFormat("yyyy-mm-dd");
			// from converting date to string old format..
			
			//String strdate=sdf.format(d);
			System.out.println(d);
	}

}
