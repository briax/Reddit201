import java.util.ArrayList;

public class Reddit201 {
	public static void main(String[] args) {
		
		ArrayList<String> dates = new ArrayList<String>();
		
		dates.add("2015 07 04");
		dates.add("2015 10 31");
		dates.add("2015 12 24");
		dates.add("2016 1 1");
		dates.add("2016 2 9");
		dates.add("2020 1 1");
		dates.add("2020 2 9");
		dates.add("2020 3 1");
		dates.add("3015 2 9");
		
		for(String date : dates){
			DateUntil newDate = new DateUntil(date);
			newDate.calculateDays();
		}
	}
}
