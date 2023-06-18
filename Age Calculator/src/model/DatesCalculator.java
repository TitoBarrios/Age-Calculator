package model;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DatesCalculator {
	LocalDate currentDate;

	public DatesCalculator() {
		currentDate = LocalDate.now();
	}

	public Period Age(LocalDate userBirthday) {
		Period age = Period.between(currentDate, userBirthday);
		return age;
	}

	public Period AgeComparator(LocalDate user1Birthday, LocalDate user2Birthday) {
		Period ageComparator = Period.between(user1Birthday, user2Birthday);
		return ageComparator;
	}
	
	public int DaysForNextBirthday(LocalDate userBirthday) {
	    LocalDate nextBirthday = userBirthday.withYear(currentDate.getYear());
	    if (nextBirthday.isBefore(currentDate) || nextBirthday.isEqual(currentDate)) {
	        nextBirthday = nextBirthday.plusYears(1);
	    }
		int daysForNextBirthday = Long.valueOf(ChronoUnit.DAYS.between(currentDate, nextBirthday)).intValue();
		return daysForNextBirthday;
	}

	public boolean isBirthday(LocalDate userBirthday) {
		boolean isBirthday = currentDate.equals(userBirthday);
		return isBirthday;
	}

	public int AgeInWeeks(LocalDate userBirthday) {
		int ageInWeeks = AgeInDays(userBirthday) / 7;
		return ageInWeeks;
	}

	public int AgeInDays(LocalDate userBirthday) {
		int ageInDays = Long.valueOf(ChronoUnit.DAYS.between(currentDate, userBirthday)).intValue();
		return ageInDays;
	}

	public int AgeInHours(LocalDate userBirthday) {
		int ageInHours = AgeInDays(userBirthday) * 24;
		return ageInHours;
	}

	public int AgeInMinutes(LocalDate userBirthday) {
		int ageInMinutes = AgeInHours(userBirthday) * 60;
		return ageInMinutes;
	}

	public int AgeInSeconds(LocalDate userBirthday) {
		int ageInSeconds = AgeInMinutes(userBirthday) * 60;
		return ageInSeconds;
	}
}