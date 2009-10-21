package hotel.util;

import java.util.Calendar;

/**
 * Classe utilitária para lidar com Diárias, Períodos e Etc...
 * @author rodrigoy
 *
 */
public class CalendarUtils {
	
	static final long DIA_MS = 1000 * 60 * 60 * 24;
	
	/**
	 * Retorna os dias que existem entre duas datas
	 * @param start - data inicio
	 * @param end - data fim
	 * @return
	 */
	public static long days(Calendar start, Calendar end) {
		return (end.getTimeInMillis() - start.getTimeInMillis()) / DIA_MS;
	}
	
	/**
	 * Retorna um calendar do tipo day/month/year 00:00:00
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	public static Calendar getStart(int year, int month, int day) {  
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, day, 0, 0, 0);
		return calendar;
	}

	/**
	 * Retorna um calendar do tipo day/month/year 23:59:59
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	public static Calendar getEnd(int year, int month, int day) {  
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, day, 23, 59, 59);
		return calendar;
	}
}
