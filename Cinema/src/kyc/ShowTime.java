package kyc;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class ShowTime {
	Calendar time;

	public ShowTime(Calendar time) {
		super();
		this.time = time;
	}
	
	ShowTime(){}

	public ArrayList<ShowTime> showTimeGenerater(){
		ArrayList<ShowTime> showTimeList = new ArrayList<>();
		Date showTimeDate = new Date();
		Calendar time = Calendar.getInstance();
				
		ShowTime showTime = new ShowTime(time);
		showTime.time.set(Calendar.HOUR, 06);
		showTime.time.set(Calendar.MINUTE, 00);
		
		showTimeList.add(showTime);
		
		System.out.println(showTime.time.getTime());
				
		return showTimeList;
	}
	
}
