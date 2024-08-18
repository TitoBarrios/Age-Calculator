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
		return Period.between(userBirthday, currentDate);
	}

	public Period AgeComparator(LocalDate user1Birthday, LocalDate user2Birthday) {
		return Period.between(user1Birthday, user2Birthday);
	}

	public int DaysForNextBirthday(LocalDate userBirthday) {
		LocalDate nextBirthday = userBirthday.withYear(currentDate.getYear());
		if (nextBirthday.isBefore(currentDate) || nextBirthday.isEqual(currentDate))
			nextBirthday = nextBirthday.plusYears(1);
		return Long.valueOf(ChronoUnit.DAYS.between(currentDate, nextBirthday)).intValue();
	}

	public boolean isBirthday(LocalDate userBirthday) {
		return currentDate.equals(userBirthday);
	}

	public int AgeInWeeks(LocalDate userBirthday) {
		return AgeInDays(userBirthday) / 7;
	}

	public int AgeInDays(LocalDate userBirthday) {
		return Long.valueOf(ChronoUnit.DAYS.between(userBirthday, currentDate)).intValue();
	}

	public int AgeInHours(LocalDate userBirthday) {
		return AgeInDays(userBirthday) * 24;
	}

	public int AgeInMinutes(LocalDate userBirthday) {
		return AgeInHours(userBirthday) * 60;
	}

	public int AgeInSeconds(LocalDate userBirthday) {
		return AgeInMinutes(userBirthday) * 60;
	}
}