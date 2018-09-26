import java.time.*;
import java.time.temporal.*;
public class DataTimeEx
{
	public static void main(String[] args) 
	{
/*		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		MonthDay md=MonthDay.now();
		System.out.println(md);
		YearMonth ym=YearMonth.now();
				System.out.println(ym);
			ld=LocalDate.of(2017,12,25);
					System.out.println(ld);
*/


//			LocalDateTime ldt=LocalDateTime.now();
//			System.out.println(ldt);
//			System.out.println("Year="+ldt.getYear());				System.out.println("Month="+ldt.getMonth());
//			System.out.println("Day="+ldt.getDayOfMonth());
LocalDate today=LocalDate.now();
LocalDate bday=LocalDate.of(1996,7,4);
LocalDate rdate=LocalDate.of(2017,5,23);
Period p=Period.between(bday,today);
System.out.println("Year="+p.getYears());
System.out.println("Month="+p.getMonths());
System.out.println("Days="+p.getDays());
long delay=ChronoUnit.DAYS.between(rdate,today);
System.out.println("Delay in days"+delay);


	}
}