package kyc;

import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class ShowTime {
	public Calendar time;

	public ShowTime(Calendar time) {
		super();
		this.time = time;
	}
	
	ShowTime(){}

	public ArrayList<ShowTime> showTimeGenerater(){
		ArrayList<ShowTime> showTimeList = new ArrayList<>();
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		Calendar time3 = Calendar.getInstance();
		Calendar time4 = Calendar.getInstance();
		Calendar time5 = Calendar.getInstance();
		Calendar time6 = Calendar.getInstance();
		
		time1.set(Calendar.HOUR, 6);
		time1.set(Calendar.MINUTE, 00);
		ShowTime showTime1 = new ShowTime(time1);
		
		time2.set(Calendar.HOUR, 9);
		time2.set(Calendar.MINUTE, 00);
		ShowTime showTime2 = new ShowTime(time2);
		
		time3.set(Calendar.HOUR, 12);
		time3.set(Calendar.MINUTE, 00);
		ShowTime showTime3 = new ShowTime(time3);
		
		time4.set(Calendar.HOUR, 15);
		time4.set(Calendar.MINUTE, 00);
		ShowTime showTime4 = new ShowTime(time4);
		
		time5.set(Calendar.HOUR, 18);
		time5.set(Calendar.MINUTE, 00);
		ShowTime showTime5 = new ShowTime(time5);
		
		time6.set(Calendar.HOUR, 21);
		time6.set(Calendar.MINUTE, 00);
		ShowTime showTime6 = new ShowTime(time6);
		
		showTimeList.add(showTime1);
		showTimeList.add(showTime2);
		showTimeList.add(showTime3);
		showTimeList.add(showTime4);
		showTimeList.add(showTime5);
		showTimeList.add(showTime6);
						
		return showTimeList;
	}	
}
