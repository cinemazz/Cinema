package kyc;

import java.util.Calendar;

public class GetValidDate {
	public Calendar getDateTime(String strDatetime) {

	      Calendar cal = Calendar.getInstance();
	      String[] strSplitDate = strDatetime.split("-");
	      cal.set(Integer.parseInt(strSplitDate[0]), Integer.parseInt(strSplitDate[1]), Integer.parseInt(strSplitDate[2]));
	      return cal;
	   }
	public Boolean getValidDate(String strStart, String strEnd, String strValue) {
	      Calendar calStart = getDateTime(strStart);
	      Calendar calEnd = getDateTime(strEnd);
	      Calendar calValue = getDateTime(strValue);
	      Boolean bValid = false;
	      if (calStart.before(calValue) && calEnd.after(calValue)) {
	         bValid = true;
	      }
	      return bValid;

	   }
}
