package presenter;

import model.SpecialDates;
import model.DatesCalculator;
import model.User;
import view.View;

import java.time.LocalDate;

public class Presenter {

	public User user;
	public User user1;
	public User user2;
	public DatesCalculator calculator;
	public SpecialDates specialDate;
	public View view;

	public Presenter() {
		specialDate = new SpecialDates();
		view = new View();
	}

	public void run() {
		int option = 0;
		String userName;
		int userYear;
		int userMonth;
		int userDay;

		do {view.showMessage(
					"Bienvenido a tu programa de la edad, seleccione la opción que más le convenga\n1. Datos de mi edad individual\n2. Comparación de mi edad con otro usuario\n0. Salir");
			option = view.readNumber();
			switch (option) {
			case 1:
				view.showMessage("Digite su nombre");
				userName = view.readData();
				view.showMessage("Digite su fecha de nacimiento en el siguiente orden: Año, mes y día");
				userYear = view.readNumber();
				userMonth = view.readNumber();
				userDay = view.readNumber();
				user = new User(userName, LocalDate.of(userYear, userMonth, userDay));
				view.showMessage("Usted tiene: " + user.getAge().getYears() + " años con " + user.getAge().getMonths()
						+ " meses y " + user.getAge().getDays());
				view.showMessage("Su edad en días: " + calculator.AgeInDays(user.getBirthday())
						+ "\nSu edad en semanas: " + calculator.AgeInWeeks(user.getBirthday()) + "\nSu edad en horas: "
						+ calculator.AgeInHours(user.getBirthday()) + "\nSu edad en minutos: "
						+ calculator.AgeInMinutes(user.getBirthday()) + "\nSu edad en segundos: "
						+ calculator.AgeInSeconds(user.getBirthday()));
				view.showMessage("Su signo del zodiaco es: " + specialDate.ZodiacSign(user) + "\n" + specialDate.SpecialDay(user));
				String birthdayMessage = calculator.isBirthday(user.getBirthday()) ? "¡Feliz Cumpleaños!"
						: "Días restantes para tu cumpleaños: " + calculator.DaysForNextBirthday(user.getBirthday());
				view.showMessage(birthdayMessage);
				break;
			case 2:
				view.showMessage("Usuario 1\nDigite su nombre");
				userName = view.readData();
				view.showMessage("Digite su fecha de nacimiento en el siguiente orden: Año, mes y día");
				userYear = view.readNumber();
				userMonth = view.readNumber();
				userDay = view.readNumber();
				user1 = new User(userName, LocalDate.of(userYear, userMonth, userDay));
				view.showMessage("Usuario 2\nDigite su nombre");
				userName = view.readData();
				view.showMessage("Digite su fecha de nacimiento en el siguiente orden: Año, mes y día");
				userYear = view.readNumber();
				userMonth = view.readNumber();
				userDay = view.readNumber();
				user2 = new User(userName, LocalDate.of(userYear, userMonth, userDay));
				view.showMessage("La diferencia de edad es de: "
						+ calculator.AgeComparator(user1.getBirthday(), user2.getBirthday()));
				break;
			}
		} while (option != 0);
		view.showMessage("Se ha detenido la ejecución del programa");
	}

	public static void main(String[] args) {
		Presenter fechas = new Presenter();

		fechas.run();
	}
}