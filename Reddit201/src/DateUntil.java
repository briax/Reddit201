import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class DateUntil {
	
	private String newDate;
	
	public DateUntil(String date){
		newDate = date;
	}
	
	public void calculateDays(){
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy MM dd");
				
		Calendar cal = new GregorianCalendar();
		
		Integer dayToday = cal.get(Calendar.DATE);
		Integer monthToday = cal.get(Calendar.MONTH) + 1;
		Integer yearToday = cal.get(Calendar.YEAR);
		
		String dayTodayString;
		String monthTodayString; 
		String yearTodayString;
		
		if(dayToday <= 9){
			dayTodayString = "0" + dayToday.toString();
		}else{
			dayTodayString = dayToday.toString();
		}
		
		if(monthToday <= 9){
			monthTodayString = "0" + monthToday.toString();
		}else{
			monthTodayString = monthToday.toString();
		}
		
		yearTodayString = yearToday.toString();
		
		String todayString = yearTodayString + " " + monthTodayString + " " + dayTodayString ;
		
		System.out.println("Todays date is: " + todayString);
		
		try{
			Date todayDate = myFormat.parse(todayString);
			Date enteredDate = myFormat.parse(newDate);
						
			long diff = enteredDate.getTime() - todayDate.getTime();
			
			System.out.println("Entered date: " + newDate);
			
			System.out.println("\tDiffernce in days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS) + "\n");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
