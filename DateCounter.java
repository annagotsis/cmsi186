public class DateCounter {
	public static boolean isLeapYear(int year) {
		if (year % 400 == 0) || (year % 4 == 0) && (year % 100 == 0) && (year > 1582);
			return true; 
	}
	public static int daysInMonth(int year, int month) {
		if (month == 01 || month == 03 || month == 05 || month == 07 || month == 08 || month == 10 || month == 12 ) {
			return 31;
		}
		else if (month == 2) {
			if (isLeapYear(year)) {
				return 29; 
			} else {
				return 28;
			}
		}
			else {
		return 30;
	}
	}
	public static boolean isValidDate(int year, int month, int day) {
		
		if (month == 01 || month == 03 || month == 05 || month == 07 || month == 08 || month == 10 || month == 12 )) && (day <= 31) && (year < 2016)  {
			return true; 
		} else if (month == 04 || month == 06 || month == 09 || month == 11) && (day <= 30) && (year < 2016) {
			return true;
			} else if (month == 02) {
				if ((isLeapYear(year)) && (day <= 29) && (year < 2016)) {
					return true;
				} else { 
					if (day <=28) && (year < 2016) {
						return true;
					}
				}
			}
			return false;
	} 
	
	public static int daysBetween(int year0, int month0, int day0, int year1, int month1, int day1) {
		
		if ((year0 >year1) || ((year1 == year0) && (month0 > month1)) || ((year1 == year0) && (month1 = month0)&& (day1 > day0))) {
				int yearx = year0; 
				year0 = year1;
				year1 = yearx; 
				int monthx = month0; 
				month0 = month1; 
				month1 = monthx; 
				int dayx = day0;
				day0 = day1; 
				day1 = dayx;
			} 
				int totalDays= 0;
			while (year1 != year0 && month1 != month0 && day1 != day0) {
				totalDays++; 
				day0 += 1;
				if(month == 01 || month == 03 || month == 05 || month == 07 || month == 08 || month == 10 || month == 12 ) && (day ==31){
					day0 = 1;
					month0 += 1; 
				} else if (month == 04 || month == 06 || month == 09 || month == 11) && (day ==30){
					day0 = 1;
					month0 += 1;
				}else if  (month == 02) {
				if ((isLeapYear(year)) && (day ==29) {
					day0 = 1;
					month0 += 1;
				} else if (day = 28) {
					day0 = 1;
					month0 += 1;
				}
				}else(month0 > 12) {
					month0 = 1; 
					year0 += 1; 
				}
			}
		return totalDays;
	}

	public static boolean hasLeapSecond(int year) {
		if (int year = {1972, 1973, 1974, 1975, 1976, 1977, 1978, 1979, 1981, 1982, 1983, 1985, 1987, 1989, 1990, 1992, 1993, 1994, 1995, 1997, 1998, 2005, 2008, 2012, 2015})
		return true;
	}
	
	public static boolean hasLeapSecond(int year, int month, int day) {
		if (int month = 06 && int day = 30) {
		{1972, 1981, 1982, 1983, 1985,1992, 1993, 1994, 1995, 1997, 1998, 2012,2015}
		return true;
		} 
		if (int month = 12 && int day = 31) {
		{1972,1973,1974,1975,1976,1977,1978,1979,1987,1989,1990,1998, 2005, 2008,}
		return true;
		} 
	}
}
	
	public static void main(String[] args) {
		int year0 = Integer.parseInt(args[0]);
		int month0 = Integer.parseInt(args[1]);
		int day0 = Integer.parseInt(args[2]);
		int year1 = Integer.parseInt(args[3]);
		int month1 = Integer.parseInt(args[4]);
		int day1 = Integer.parseInt(args[5]); 

		if (args.length == 0) {
	 		System.out.println("Usage: java DateCounter <year0> <month0> <day0> <year1> <month1> <day1>");
	} if (!(isValidDate(year0, month0, day0))) {
		System.out.println("That is not a valid date!");
	}

	}
	
