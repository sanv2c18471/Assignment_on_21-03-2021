package demo8;

import java.util.EnumSet;
import java.util.Set;
enum DaysOfWeeks {
	SUNDAY,MONDAY,TUESDAY,WEDNESSDAY,THURSDAY,FRIDAY,SATURDAY}
		


public class Weeks {
public static void main(String[] args) {
Set <DaysOfWeeks> Set1 = EnumSet.allOf(DaysOfWeeks.class);
System.out.println("Full weeks: " +Set1);
	
Set <DaysOfWeeks> Set2 = EnumSet.of(DaysOfWeeks.SUNDAY, DaysOfWeeks.SATURDAY);
System.out.println("Weekend: " +Set2);

Set <DaysOfWeeks> Set3 = EnumSet.of(DaysOfWeeks.MONDAY,DaysOfWeeks.TUESDAY, DaysOfWeeks.WEDNESSDAY, DaysOfWeeks.THURSDAY, DaysOfWeeks.FRIDAY);
System.out.println("Week days: " +Set3);
}
}