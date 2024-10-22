package genericutilities;




import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
/*
 * This class contains reusable methods toperform java related operations
 * @author Ravi
 */
public class JavaUtility {
	/*
	 * This method returns random number within the specified limit 
	 * @param limit
	 * @return int
	 */
	public int generateRandom(int limit) {
		Random random = new Random();
		return random.nextInt(limit);
		
	}
	/*
	 * This method parses string to any data type
	 * @param monthName
	 * @param monthName
	 * @return int
	 */
	
	public Object convertStringToanyDataType(DataType dataType,String Value) {
		Object obj = null;
		if(dataType.toString().equalsIgnoreCase("int"))
			obj = Integer.parseInt(Value);
		else if(dataType.toString().equalsIgnoreCase("long"))
			obj = Long.parseLong(Value);
		
			else if(dataType.toString().equalsIgnoreCase("double"))
				obj = Double.parseDouble(Value);
			
				else if(dataType.toString().equalsIgnoreCase("boolean"))
					obj = Boolean.parseBoolean(Value);
				else 
					System.out.println("Invalid data type");
		
		return obj;
		
	}
	/*
	 * This method fetches system date and time
	 * @return String
	 */
	public String getCurrentTime() {
		Date date= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy_hh-mm-ss");
		return sdf.format(date);
		
	}
	
	/*
	 * This method waits for the given time
	 * @param time
	 */
	public void await(long time) {
		try {
			Thread.sleep(time);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	/*
	 * This method converts the month name to number
	 * @param monthName
	 * @return int
	 */
	public int convertMonthToNum(String monthName) {
		return DateTimeFormatter.ofPattern("MMM").withLocale(Locale.ENGLISH).parse(monthName).get(ChronoField.MONTH_OF_YEAR);
	}
 
}
