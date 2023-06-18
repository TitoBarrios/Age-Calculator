package model;

public class SpecialDates {

	// El programa reconoce el día en el cual el user nació y toma un valor
	// String para informarle lo que se celebra ese día
	public String SpecialDay(User user) {
		String message = "Fecha Invalida";
		String startingMessage = "Naciste el Día ";
		switch (user.getBirthday().getMonthValue()) {
		case 1:
			switch (user.getBirthday().getDayOfMonth()) {
			case 1:
				message = startingMessage + "de año nuevo ¡Es muy raro nacer en esta fecha!";
				break;
			case 2:
				message = startingMessage + "del Policía y el día del Introvertido";
				break;
			case 3:
				message = startingMessage + "de las Cerezas cubiertas de chocolate";
				break;
			case 4:
				message = startingMessage + "Mundial del Braille y de la Hipnosis";
				break;
			case 5:
				message = startingMessage + "de la Crema Batida o Nata Montada";
				break;
			case 6:
				message = startingMessage + "de Reyes y día Mundial de los Huérfanos de la Guerra";
				break;
			case 7:
				message = startingMessage + "del Sello Postal y este día es la Navidad Ortodoxa";
				break;
			case 8:
				message = startingMessage + "de la Electricidad Estática y del Ascenso del Globo (USA)";
				break;
			case 9:
				message = "Este día se luchó la Batalla de New Orleans";
				break;
			case 10:
				message = startingMessage + "de la Gente Peculiar";
				break;
			case 11:
				message = startingMessage + "del Agradadecimiento y día de Planificar tus Vacaciones";
				break;
			case 12:
				message = startingMessage + "Internacional de Besar a un Pelirrojo";
				break;
			case 13:
				message = startingMessage + "Mundial de la Lucha contra la Depresión, día Mundial del Chicle y del Sticker";
				break;
			case 14:
				message = startingMessage
						+ "Mundial de la Lógica, de la Cometa, de Vestir a tu mascota y este día es el Año Nuevo Ortodoxo";
				break;
			case 15:
				message = startingMessage + "Mundial de la Nieve, de la Religión y del Sombrero (USA)";
				break;
			case 16:
				message = startingMessage + "de la Croqueta, de The Beatles y de la Comida Picante";
				break;
			case 17:
				message = startingMessage + "Mundial de Bendecir a los Animales";
				break;
			case 18:
				message = startingMessage + "de Winnie The Pooh";
				break;
			case 19:
				message = startingMessage + "de las Palomitas de Maíz";
				break;
			case 20:
				message = startingMessage + "de Concienciación de los pingüinos";
				break;
			case 21:
				message = startingMessage
						+ "del Abrazo, de la Ardilla, del Mariachi, de la Meditación y del Pantalón Chandal";
				break;
			case 22:
				message = "¡Hoy es el Año Nuevo Chino!";
				break;
			case 23:
				message = startingMessage + "Mundial de la Libertad y del Community Manager";
				break;
			case 24:
				message = startingMessage + "de la Educación, de la Cultura Africana y del Periodista (España)";
				break;
			case 25:
				message = startingMessage + "de la Mujer en el Multilateralismo y de del Café Irlandés";
				break;
			case 26:
				message = startingMessage
						+ "de la Educación Ambiental, de la Aduana, del Pescador y de la Enfermedad de Kawasaki";
				break;
			case 27:
				message = startingMessage + "Internacional de la Conmemoración de las Víctimas del Holocausto";
				break;
			case 28:
				message = startingMessage + "Internacional de Lego";
				break;
			case 29:
				message = startingMessage + "Mundial contra la Lepra y día del Rompecabezas";
				break;
			case 30:
				message = startingMessage + "Internacional del Croissant";
				break;
			case 31:
				message = startingMessage + "Internacional del Mago y de la Cebra";
				break;
			}
			break;

		case 2:
			switch (user.getBirthday().getDayOfMonth()) {
			case 1:
				message = startingMessage + "Mundial del Galgo y de la Lectura en Voz Alta";
				break;
			case 2:
				message = startingMessage + "Mundial de los Humedales y de las Elecciones";
				break;
			case 3:
				message = startingMessage + "del Abogado";
				break;
			case 4:
				message = startingMessage + "Mundial contra el Cáncer y de la Fraternidad Humana";
				break;
			case 5:
				message = startingMessage + "Mundial de la Nutella";
				break;
			case 6:
				message = startingMessage + "Mundial de Bob Marley";
				break;
			case 7:
				message = startingMessage + "Internacional del Internet Seguro y de mandar una carta a un amigo";
				break;
			case 8:
				message = startingMessage + "del Nirvana";
				break;
			case 9:
				message = startingMessage + "Mundial de la Pizza y de la Lengua Griega";
				break;
			case 10:
				message = startingMessage + "Mundial de las Legumbres";
				break;
			case 11:
				message = startingMessage + "Mundial del Cine";
				break;
			case 12:
				message = startingMessage + "de Darwin y Día Mundial contra el Uso de Niños Soldado";
				break;
			case 13:
				message = startingMessage + "del Soltero";
				break;
			case 14:
				message = startingMessage + "de San Valentín";
				break;
			case 15:
				message = startingMessage + "Mundial del Hipopótamo";
				break;
			case 16:
				message = startingMessage + "de los Amores Imposibles";
				break;
			case 17:
				message = startingMessage + "del Juego Responsable";
				break;
			case 18:
				message = startingMessage + "del Pangolín y de las Ballenas";
				break;
			case 19:
				message = startingMessage + "contra la Homofobia en el Fútbol";
				break;
			case 20:
				message = startingMessage + "Internacional del Gato";
				break;
			case 21:
				message = startingMessage + "de la Lengua Moderna";
				break;
			case 22:
				message = startingMessage + "de la Encefalitis";
				break;
			case 23:
				message = startingMessage + "Internacional del Control del Mercurio";
				break;
			case 24:
				message = startingMessage + "Mundial del Barman";
				break;
			case 25:
				message = startingMessage + "del Implante Coclear";
				break;
			case 26:
				message = startingMessage + "Mundial del Pistacho";
				break;
			case 27:
				message = startingMessage + "Mundial de las ONGs y del Oso Polar";
				break;
			case 28:
				message = startingMessage + "de la Esterilización Animal";
				break;
			case 29:
				message = startingMessage + "";
				break;
			}
			break;
		case 3:
			switch (user.getBirthday().getDayOfMonth()) {
			case 1:
				message = startingMessage + "de la Cero Discriminación";
				break;
			case 2:
				message = startingMessage + "del Bienestar Mental para Adolescentes";
				break;
			case 3:
				message = startingMessage + "Mundial de la Vida Silvestre";
				break;
			case 4:
				message = startingMessage + "de la Ingeniería para el Desarrollo Sostenible";
				break;
			case 5:
				message = startingMessage + "de la Eficiencia Energética y de la Abstinenecia Digital";
				break;
			case 6:
				message = startingMessage + "del Escultor";
				break;
			case 7:
				message = startingMessage + "Mundial de los Cereales";
				break;
			case 8:
				message = startingMessage + "Internacional de la Mujer";
				break;
			case 9:
				message = startingMessage + "Mundial del Riñón, del DJ y la Totilla de Patatas";
				break;
			case 10:
				message = startingMessage + "de Mario";
				break;
			case 11:
				message = startingMessage + "Mundial de la Fontanería";
				break;
			case 12:
				message = startingMessage + "Mundial del Glaucoma";
				break;
			case 13:
				message = startingMessage + "Mundial del Cerebro";
				break;
			case 14:
				message = startingMessage + "Internacional de las Matemáticas y del Número Pi";
				break;
			case 15:
				message = startingMessage + "Mundial de los Derechos del Consumidor";
				break;
			case 16:
				message = startingMessage + "Nacional del Oso Panda (USA)";
				break;
			case 17:
				message = startingMessage + "Mundial del Sueño y de San Patricio";
				break;
			case 18:
				message = startingMessage + "Mundial del Síndrome de Edwards";
				break;
			case 19:
				message = startingMessage + "del Padre";
				break;
			case 20:
				message = startingMessage + "Internacional de la Felicidad";
				break;
			case 21:
				message = startingMessage + "Internacional de los BOsques y día del Síndrome de Down";
				break;
			case 22:
				message = startingMessage + "Mundial del Agua";
				break;
			case 23:
				message = startingMessage + "Mundial del Aprendizaje";
				break;
			case 24:
				message = startingMessage + "Mundial de la Tuberculosis";
				break;
			case 25:
				message = startingMessage + "Internacional del Waffle";
				break;
			case 26:
				message = startingMessage + "Mundial del Clima";
				break;
			case 27:
				message = startingMessage + "Mundial del Teatro";
				break;
			case 28:
				message = startingMessage + "de la Torta Selva Negra";
				break;
			case 29:
				message = startingMessage + "Mundial del Piano y día Nacional del Trasplante (España)";
				break;
			case 30:
				message = startingMessage + "Mundial del Trastorno Bipolar";
				break;
			case 31:
				message = startingMessage + "de la Torre Eiffel";
				break;
			}
			break;

		case 4:
			switch (user.getBirthday().getDayOfMonth()) {
			case 1:
				message = startingMessage + "de los Inocentes o día de las Bromas";
				break;
			case 2:
				message = startingMessage
						+ "Mundial de Concienciación sobre el Autismo y Día del Veterano y de los Caídos en la Guerra de Malvinas (Argentina)";
				break;
			case 3:
				message = startingMessage + "Mundial del Arcoíris";
				break;
			case 4:
				message = startingMessage + "Mundial de la Rata";
				break;
			case 5:
				message = startingMessage + "Internacional de la Conciencia";
				break;
			case 6:
				message = startingMessage + "Internacional del Deporte para el Desarrollo y la Paz";
				break;
			case 7:
				message = startingMessage + "Mundial de la Salud";
				break;
			case 8:
				message = startingMessage + "Internacional del Pueblo Gitano";
				break;
			case 9:
				message = startingMessage + "Nacional de Winston Churchill (USA) y día del Pago Igualitario (Argentina)";
				break;
			case 10:
				message = startingMessage + "Internacional de la Homeopatía";
				break;
			case 11:
				message = startingMessage + "Mundial del Parkinson";
				break;
			case 12:
				message = startingMessage + "Internacional de los Niños en la Calle";
				break;
			case 13:
				message = startingMessage + "Intercional del Beso";
				break;
			case 14:
				message = startingMessage + "Internacional del Portero";
				break;
			case 15:
				message = startingMessage + "Mundial del Arte y del Niño (España)";
				break;
			case 16:
				message = startingMessage + "Mundial de la Voz";
				break;
			case 17:
				message = startingMessage + "Mundial de la Hemofilia";
				break;
			case 18:
				message = startingMessage + "Internacional de los Monumentos y Sitios";
				break;
			case 19:
				message = startingMessage + "Mundial de los Simpson";
				break;
			case 20:
				message = startingMessage + "de la Lengua China";
				break;
			case 21:
				message = startingMessage + "Mundial de la Creatividad y la Innovación";
				break;
			case 22:
				message = startingMessage + "Internacional de la Madre Tierra";
				break;
			case 23:
				message = startingMessage + "de la Lengua Inglesa y la Lengua Española";
				break;
			case 24:
				message = startingMessage + "Mundial de la Meningitis";
				break;
			case 25:
				message = startingMessage + "Internacional del ADN y día Mundial de los Pingüinos";
				break;
			case 26:
				message = startingMessage + "Internacional del Pene";
				break;
			case 27:
				message = startingMessage + "del Diseño Gráfico";
				break;
			case 28:
				message = startingMessage + "Mundial de la Seguridad y la Salud en el Trabajo";
				break;
			case 29:
				message = startingMessage + "Internacional de la Danza";
				break;
			case 30:
				message = startingMessage + "Interancional del Jazz";
				break;
			}
			break;

		case 5:
			switch (user.getBirthday().getDayOfMonth()) {
			case 1:
				message = startingMessage + "Internacional de los Trabajadores";
				break;
			case 2:
				message = startingMessage + "Internacional contra el Bullying o el Acoso Escolar";
				break;
			case 3:
				message = startingMessage + "Mundial de la Libertad de Prensa";
				break;
			case 4:
				message = startingMessage + "Internacional de los Bomberos";
				break;
			case 5:
				message = startingMessage + "Internacional de la Higiene de Manos";
				break;
			case 6:
				message = startingMessage + "Internacional sin Dietas";
				break;
			case 7:
				message = startingMessage + "de la Madre y día Mundial de la Risa";
				break;
			case 8:
				message = startingMessage + "Mundial de la Cruz Roja";
				break;
			case 9:
				message = startingMessage + "de Europa";
				break;
			case 10:
				message = startingMessage + "Mundial del Lupus";
				break;
			case 11:
				message = startingMessage + "del Himno Nacional Argentino";
				break;
			case 12:
				message = startingMessage + "Internacional de la Enfermera";
				break;
			case 13:
				message = startingMessage + "Mundial de las Aves Migratorias";
				break;
			case 14:
				message = startingMessage + "Día de la Madre (Colombia, EEUU, Venezuela y otros países)";
				break;
			case 15:
				message = startingMessage + "Internacional de las Familias";
				break;
			case 16:
				message = startingMessage + "Mundial de la Luz";
				break;
			case 17:
				message = startingMessage + "Mundial del Internet";
				break;
			case 18:
				message = startingMessage + "Internacional de los Museos";
				break;
			case 19:
				message = startingMessage + "Mundial del Médico de Fmailia";
				break;
			case 20:
				message = startingMessage + "Mundial de las Abejas";
				break;
			case 21:
				message = startingMessage + "Internacional del Té";
				break;
			case 22:
				message = startingMessage + "Mundial de Pac-Man";
				break;
			case 23:
				message = startingMessage + "Internacional para la Erradicación de la Fístula Obstrética";
				break;
			case 24:
				message = startingMessage + "Europeo de los Parques Naturales";
				break;
			case 25:
				message = startingMessage + "de África";
				break;
			case 26:
				message = startingMessage + "Mundial de Drácula";
				break;
			case 27:
				message = startingMessage + "del Celiaco (España)";
				break;
			case 28:
				message = startingMessage + "Internacional del Juego";
				break;
			case 29:
				message = startingMessage + "Mundial de la Salud Digestiva";
				break;
			case 30:
				message = startingMessage + "Mundial de la Esclerosis Múltiple";
				break;
			case 31:
				message = startingMessage + "Mundial sin Tabaco";
				break;
			}
			break;

		case 6:
			switch (user.getBirthday().getDayOfMonth()) {
			case 1:
				message = startingMessage + "Mundial de los Arrecifes";
				break;
			case 2:
				message = startingMessage + "Mundial del Donut";
				break;
			case 3:
				message = startingMessage + "Mundial de la Bicicleta";
				break;
			case 4:
				message = startingMessage + "Mundial del Superviviente de Cáncer";
				break;
			case 5:
				message = startingMessage + "Mundial del Medio Ambiente";
				break;
			case 6:
				message = startingMessage + "Mundial de los Pacientes Trasplantados";
				break;
			case 7:
				message = startingMessage + "Mundial de la Inocuidad de los Alimentos";
				break;
			case 8:
				message = startingMessage + "Mundial de los OCéanos y la Lucha contra la Falsificación y la Piratería";
				break;
			case 9:
				message = startingMessage + "del Pato Donald";
				break;
			case 10:
				message = startingMessage + "Mundial de Tejer en Público";
				break;
			case 11:
				message = startingMessage + "Mundial del Cáncer de Próstata";
				break;
			case 12:
				message = startingMessage + "con el Trabajo Infantil";
				break;
			case 13:
				message = startingMessage + "Europeo de la Prevención del Cáncer de Piel";
				break;
			case 14:
				message = startingMessage + "Mundial del Donante de Sangre";
				break;
			case 15:
				message = startingMessage + "Muncial del Viento";
				break;
			case 16:
				message = startingMessage + "Mundial de las Tortugas Marinas";
				break;
			case 17:
				message = startingMessage + "Mundial de los Malabares";
				break;
			case 18:
				message = startingMessage + "Mundial del Orgullo Autista";
				break;
			case 19:
				message = startingMessage + "Internacional para la Elimianción de la VIolencia Sexual en los Conflictos";
				break;
			case 20:
				message = startingMessage + "Mundial del Refugiado y el Yellow Day (El Día más Feliz del Mundo)";
				break;
			case 21:
				message = startingMessage + "Internacional de la Celebración del Solsticio";
				break;
			case 22:
				message = startingMessage + "Mundial de las Mujeres sin Ropa Interior";
				break;
			case 23:
				message = startingMessage + "Internacional de las Viudas";
				break;
			case 24:
				message = startingMessage + "Mundial de los Pitufos";
				break;
			case 25:
				message = startingMessage + "de la Gente de Mar";
				break;
			case 26:
				message = startingMessage
						+ "Internacional de la Lucha contra el Uso Indebido y el Tráfico ilícito de Drogas";
				break;
			case 27:
				message = startingMessage + "de las Micro y Medianas Empresas";
				break;
			case 28:
				message = startingMessage + "del Orgullo LGBT o del Orgullo Gay";
				break;
			case 29:
				message = startingMessage + "Internacional de los Trópicos";
				break;
			case 30:
				message = startingMessage + "Internacional de los Asteroides";
				break;
			}
			break;

		case 7:
			switch (user.getBirthday().getDayOfMonth()) {
			case 1:
				message = startingMessage + "Internacional de las Cooperativas";
				break;
			case 2:
				message = startingMessage + "Mundial de los OVNIs";
				break;
			case 3:
				message = startingMessage + "Internacional Libre de BOlsas de Plástico";
				break;
			case 4:
				message = startingMessage + "Mundial de los Delfines en Cautiverio";
				break;
			case 5:
				message = startingMessage + "Mundial del Bikini";
				break;
			case 6:
				message = startingMessage + "Internacional de la Zoonosis";
				break;
			case 7:
				message = startingMessage + "Internacional de la Conservación del Suelo";
				break;
			case 8:
				message = startingMessage + "Mundial de la Alergia";
				break;
			case 9:
				message = startingMessage + "Internacional de la Destrucción de Armas de Fuego";
				break;
			case 10:
				message = startingMessage + "Mundial del Glut1";
				break;
			case 11:
				message = startingMessage + "Mundial de la Población";
				break;
			case 12:
				message = startingMessage + "Mundial de los Recursos Renovables e Irrenovables";
				break;
			case 13:
				message = startingMessage + "del Rock y del Director de Orquesta";
				break;
			case 14:
				message = startingMessage + "Mundial del Chimpancé";
				break;
			case 15:
				message = startingMessage + "Mundial de las Habilidades de la Juventud";
				break;
			case 16:
				message = startingMessage + "Mundial de la Serpiente";
				break;
			case 17:
				message = startingMessage + "del Emoji y del Tatuaje";
				break;
			case 18:
				message = startingMessage + "Internacional de Nelson Mandela";
				break;
			case 19:
				message = startingMessage + "Mundial de Sacar la Lengua";
				break;
			case 20:
				message = startingMessage + "Mundial del Ajedrez";
				break;
			case 21:
				message = startingMessage + "Mundial del Perro";
				break;
			case 22:
				message = startingMessage + "de la Hamaca";
				break;
			case 23:
				message = startingMessage + "de Batman";
				break;
			case 24:
				message = startingMessage + "Internacional del Tequila";
				break;
			case 25:
				message = startingMessage + "Internacional de la Mujer Afrodescendiente";
				break;
			case 26:
				message = startingMessage + "de los Abuelos";
				break;
			case 27:
				message = startingMessage + "Mundial de Andar con Zancos";
				break;
			case 28:
				message = startingMessage + "Mundial contra el Hepatitis Vírica";
				break;
			case 29:
				message = startingMessage + "Internacional del Tigre y las Alitas de Pollo";
				break;
			case 30:
				message = startingMessage + "Internacional de la Amistad";
				break;
			case 31:
				message = startingMessage + "Mundial de los Guardas Forestales";
				break;
			}
			break;

		case 8:
			switch (user.getBirthday().getDayOfMonth()) {
			case 1:
				message = startingMessage + "Mundial de la Alegría";
				break;
			case 2:
				message = startingMessage + "Mundial de la Lactancia Materna";
				break;
			case 3:
				message = startingMessage + "Internacional de la Planificación Familiar";
				break;
			case 4:
				message = startingMessage + "Internacional de la Cerveza";
				break;
			case 5:
				message = startingMessage + "Mundial de la Lactancia Materna";
				break;
			case 6:
				message = startingMessage + "Nacional de la Miel (Chile)";
				break;
			case 7:
				message = startingMessage + "Mundial de los Faros";
				break;
			case 8:
				message = startingMessage + "Internacional del Orgasmo Femenino";
				break;
			case 9:
				message = startingMessage + "Internacional de la Población Indígena";
				break;
			case 10:
				message = startingMessage + "Mundial del León";
				break;
			case 11:
				message = startingMessage + "del Nutricionista";
				break;
			case 12:
				message = startingMessage + "Mundial del Elefante";
				break;
			case 13:
				message = startingMessage + "Internacional del Armadillo";
				break;
			case 14:
				message = startingMessage + "Mundial del Lagarto";
				break;
			case 15:
				message = startingMessage + "Mundial de la Relajación";
				break;
			case 16:
				message = startingMessage + "Internacional del Ron";
				break;
			case 17:
				message = startingMessage + "Mundial del Peatón";
				break;
			case 18:
				message = startingMessage + "Mundial de la Prevención de Incendios Forestales";
				break;
			case 19:
				message = startingMessage + "Mundial de la Asistencia Humanitaria";
				break;
			case 20:
				message = startingMessage + "Mundial de las Patatas Fritas";
				break;
			case 21:
				message = startingMessage + "Internacional de Conmemoración y HOmenaje a las Víctimas del Terrorismo";
				break;
			case 22:
				message = startingMessage + "Mundial del Folclore";
				break;
			case 23:
				message = startingMessage + "Internacional para el Recuerdo del Comercio de Esclavos y su Abolición";
				break;
			case 24:
				message = startingMessage + "del Lector";
				break;
			case 25:
				message = startingMessage + "Internacional del Peluquero";
				break;
			case 26:
				message = startingMessage + "Internacional contra el Dengue";
				break;
			case 27:
				message = startingMessage + "de la Radio";
				break;
			case 28:
				message = startingMessage + "Mundial del Síndrome de Turner";
				break;
			case 29:
				message = startingMessage + "Mundial del Videojuego";
				break;
			case 30:
				message = startingMessage + "Internacional de los Desaparecidos";
				break;
			case 31:
				message = startingMessage + "Internacional de la Solidaridad";
				break;
			}
			break;

		case 9:
			switch (user.getBirthday().getDayOfMonth()) {
			case 1:
				message = startingMessage + "en el que comenzó la Segunda Guerra Mundial";
				break;
			case 2:
				message = startingMessage + "Internacional del Buitre";
				break;
			case 3:
				message = startingMessage + "Mundial de la Higiene";
				break;
			case 4:
				message = startingMessage + "Internacional del Taekwondo";
				break;
			case 5:
				message = startingMessage + "Mundial del Hermano y de la Beneficiencia";
				break;
			case 6:
				message = startingMessage + "del Trabajo (USA)";
				break;
			case 7:
				message = startingMessage + "Mundial del Pelirrojo";
				break;
			case 8:
				message = startingMessage + "Internacional de la Alfabetización";
				break;
			case 9:
				message = startingMessage + "Mundial de la Arepa";
				break;
			case 10:
				message = startingMessage + "Internacional para la Prevención del Suicidio";
				break;
			case 11:
				message = startingMessage + "de los Patriotas (USA)";
				break;
			case 12:
				message = startingMessage + "Internacional del Crochet";
				break;
			case 13:
				message = startingMessage + "Internacional del Chocolate";
				break;
			case 14:
				message = startingMessage + "Mundial de la Hepatitis Atópica";
				break;
			case 15:
				message = startingMessage + "Internacional de la Democracia";
				break;
			case 16:
				message = startingMessage + "Ineternacional de la Capa de Ozono";
				break;
			case 17:
				message = startingMessage + "Mundial de la Seguridad del Paciente";
				break;
			case 18:
				message = startingMessage + "Internacional de la Igualdad Salarial";
				break;
			case 19:
				message = startingMessage + "Mundial de Hablar Pirata";
				break;
			case 20:
				message = startingMessage + "Internacional del Deporte Universitario";
				break;
			case 21:
				message = startingMessage + "Internacional de la Paz";
				break;
			case 22:
				message = startingMessage + "Mundial sin Coche";
				break;
			case 23:
				message = startingMessage + "de Equinoccio de Otoño o Primavera (Hemisferio Sur)";
				break;
			case 24:
				message = startingMessage + "Mundial del Gorila";
				break;
			case 25:
				message = startingMessage + "Mundial del Farmacéutico";
				break;
			case 26:
				message = startingMessage + "Internacional para la Eliminación Total de Armas Nucleares";
				break;
			case 27:
				message = startingMessage + "Mundial del Turismo";
				break;
			case 28:
				message = startingMessage + "Internacional del Derecho de Acceso Universal a la Información";
				break;
			case 29:
				message = startingMessage + "Mundial del Corazón";
				break;
			case 30:
				message = startingMessage + "Internacional de la Traducción";
				break;
			}
			break;

		case 10:
			switch (user.getBirthday().getDayOfMonth()) {
			case 1:
				message = startingMessage + "Internacional de las Personas de Edad";
				break;
			case 2:
				message = startingMessage + "Internacional de la No Violencia";
				break;
			case 3:
				message = startingMessage + "Nacional de los Novios (USA, España, etc)";
				break;
			case 4:
				message = startingMessage + "Mundial de los Animales";
				break;
			case 5:
				message = startingMessage + "Mundial de los Docentes";
				break;
			case 6:
				message = startingMessage + "Internacional de la Geodiversidad";
				break;
			case 7:
				message = startingMessage + "Mundial del Algodón";
				break;
			case 8:
				message = startingMessage + "de los Tíos";
				break;
			case 9:
				message = startingMessage + "Mundial del Correo";
				break;
			case 10:
				message = startingMessage + "Mundial de la Salud Mental";
				break;
			case 11:
				message = startingMessage + "Internacional de la Niña";
				break;
			case 12:
				message = startingMessage + "Mundial de la Visión";
				break;
			case 13:
				message = startingMessage + "Internacional para la Reducción de los Desastres";
				break;
			case 14:
				message = startingMessage + "Mundial de las Aves Migratorias";
				break;
			case 15:
				message = startingMessage + "Internacional de las Mujeres Rurales";
				break;
			case 16:
				message = startingMessage + "Mundial de la Alimentación";
				break;
			case 17:
				message = startingMessage + "Internacional para la Erradicación de la Pobreza";
				break;
			case 18:
				message = startingMessage + "Mundial de la Menopausia";
				break;
			case 19:
				message = startingMessage + "Internacional de la Lucha contra el Cáncer de Mama";
				break;
			case 20:
				message = startingMessage + "Mundial de la Estadística";
				break;
			case 21:
				message = startingMessage + "Mundial del Ahorro de Energía";
				break;
			case 22:
				message = startingMessage + "Internacional de la Tartamudez";
				break;
			case 23:
				message = startingMessage + "del Médico (México)";
				break;
			case 24:
				message = startingMessage + "de las Naciones Unidas y día Mundial de Información sobre el Desarrollo";
				break;
			case 25:
				message = startingMessage + "Internacional del Artista";
				break;
			case 26:
				message = startingMessage + "de la Suegra";
				break;
			case 27:
				message = startingMessage + "Mundial del Patrimonio Audiovisual";
				break;
			case 28:
				message = startingMessage + "Mundial de la Animación";
				break;
			case 29:
				message = startingMessage + "Mundial del Ataque Cerebro Vascular";
				break;
			case 30:
				message = "¡Naciste en Halloween!";
				break;
			case 31:
				message = startingMessage + "Mundial de las Ciudades";
				break;
			}
			break;

		case 11:
			switch (user.getBirthday().getDayOfMonth()) {
			case 1:
				message = startingMessage + "de Todos los Santos";
				break;
			case 2:
				message = startingMessage
						+ "Internacional para Poner Fin a la impunidad de los Crímenes contra los Periodistas";
				break;
			case 3:
				message = startingMessage + "Mundial del Sandwich";
				break;
			case 4:
				message = startingMessage + "de la UNESCO";
				break;
			case 5:
				message = startingMessage + "Mundial de Concienciación Sobre los Sunamis";
				break;
			case 6:
				message = startingMessage
						+ "Internacional para la Prevención de Explotación del Medio Ambiente en la Guerra y los Conflictos Armados";
				break;
			case 7:
				message = startingMessage + "Internacional de la Física Médica";
				break;
			case 8:
				message = startingMessage + "Mundial de la Radiología";
				break;
			case 9:
				message = startingMessage + "del Inventor Internacional";
				break;
			case 10:
				message = startingMessage + "Mundial de la Ciecia para la Paz y el Desarrollo";
				break;
			case 11:
				message = startingMessage + "de las Librerías";
				break;
			case 12:
				message = startingMessage + "Mundial contra la Neumonía";
				break;
			case 13:
				message = startingMessage + "Mundial de la Bondad";
				break;
			case 14:
				message = startingMessage + "Mundial de la Diabetes";
				break;
			case 15:
				message = startingMessage + "Mundial  sin Alcohol";
				break;
			case 16:
				message = startingMessage + "Mundial de la Filosofía";
				break;
			case 17:
				message = startingMessage + "Internacional de los Estudiantes";
				break;
			case 18:
				message = startingMessage
						+ "Mundial para Prevenir la Explotación, los Abusos y la Violencia Sexuales contra los Niños y Promover la Sanación";
				break;
			case 19:
				message = startingMessage + "Mundial del Retrete";
				break;
			case 20:
				message = startingMessage + "de la Industrialización de África";
				break;
			case 21:
				message = startingMessage + "Mundial de la Televisión";
				break;
			case 22:
				message = startingMessage + "de la Música";
				break;
			case 23:
				message = startingMessage + "Internacional de la Palabra";
				break;
			case 24:
				message = startingMessage + "de No Comprar Nada (USA)";
				break;
			case 25:
				message = startingMessage + "Internacional de la Eliminación de la Violencia contra la Mujer";
				break;
			case 26:
				message = startingMessage + "Mundial del Olivo";
				break;
			case 27:
				message = startingMessage + "del Maestro (España)";
				break;
			case 28:
				message = startingMessage + "de Santa Catalina Labouré";
				break;
			case 29:
				message = startingMessage + "Internacional de Solidaridad con el Pueblo Palestino";
				break;
			case 30:
				message = startingMessage + "de Conmemoración de todas las víctimas de la guerra química";
				break;
			}
			break;

		case 12:
			switch (user.getBirthday().getDayOfMonth()) {
			case 1:
				message = startingMessage + "Mundial del SIDA";
				break;
			case 2:
				message = startingMessage + "Internacional para la Abolición de la Esclavitud";
				break;
			case 3:
				message = startingMessage + "Internacional de las Personas con Discapacidad";
				break;
			case 4:
				message = startingMessage + "Internacional de los Bancos";
				break;
			case 5:
				message = startingMessage + "Mundial del Suelo";
				break;
			case 6:
				message = startingMessage + "de la COnstitución (España)";
				break;
			case 7:
				message = startingMessage + "de la Aviación Civil Internacional";
				break;
			case 8:
				message = startingMessage + "de la Inmaculada Concepción";
				break;
			case 9:
				message = startingMessage + "Internacional contra la Corrupción";
				break;
			case 10:
				message = startingMessage + "de los Derechos Humanos";
				break;
			case 11:
				message = startingMessage + "Internacional de las Montañas";
				break;
			case 12:
				message = startingMessage + "Internacional de la Neutralidad";
				break;
			case 13:
				message = startingMessage + "Nacional del Cacao (USA)";
				break;
			case 14:
				message = startingMessage + "Mundial del Mono y Nacional de la Persona Obesa (España)";
				break;
			case 15:
				message = startingMessage + "Mundial del Otaku";
				break;
			case 16:
				message = startingMessage + "de la Lectura";
				break;
			case 17:
				message = startingMessage + "del Contador";
				break;
			case 18:
				message = startingMessage + "Internacional del Migrante";
				break;
			case 19:
				message = startingMessage + "Internacional del Emo";
				break;
			case 20:
				message = startingMessage + "Internacional de la Solidaridad Humana";
				break;
			case 21:
				message = startingMessage + "del Solsticio de Invierno";
				break;
			case 22:
				message = startingMessage + "Mundial del Termómetro";
				break;
			case 23:
				message = startingMessage + "Nacional de las Raíces (USA)";
				break;
			case 24:
				message = startingMessage + "de Nochebuena";
				break;
			case 25:
				message = "¡Naciste en Navidad!";
				break;
			case 26:
				message = startingMessage + "de las Cajas";
				break;
			case 27:
				message = startingMessage + "Internacional de la Solidaridad Humana";
				break;
			case 28:
				message = startingMessage + "de los Inocentes";
				break;
			case 29:
				message = startingMessage + "Mundial del Pimentero";
				break;
			case 30:
				message = startingMessage + "Internacional del Cine Indio";
				break;
			case 31:
				message = startingMessage + "de Nochevieja";
				break;
			}
			break;
		}
		return message;
	}

	// El programa identifica el signo zodiacal al cual pertenece el user
	public String ZodiacSign(User user) {
		String zodiacSign = " ";
		if ((user.getBirthday().getMonthValue() == 12 && user.getBirthday().getDayOfMonth() >= 22) || (user.getBirthday().getMonthValue() == 1 && user.getBirthday().getDayOfMonth() <= 19)) {
			zodiacSign = "Capricornio";
			return zodiacSign;
		} else if ((user.getBirthday().getMonthValue() == 1 && user.getBirthday().getDayOfMonth() >= 20)
				|| (user.getBirthday().getMonthValue() == 2 && user.getBirthday().getDayOfMonth() <= 18)) {
			zodiacSign = "Acuario";
			return zodiacSign;
		} else if ((user.getBirthday().getMonthValue() == 2 && user.getBirthday().getDayOfMonth() >= 19)
				|| (user.getBirthday().getMonthValue() == 3 && user.getBirthday().getDayOfMonth() <= 20)) {
			zodiacSign = "Piscis";
			return zodiacSign;
		} else if ((user.getBirthday().getMonthValue() == 3 && user.getBirthday().getDayOfMonth() >= 21)
				|| (user.getBirthday().getMonthValue() == 4 && user.getBirthday().getDayOfMonth() <= 19)) {
			zodiacSign = "Aries";
			return zodiacSign;
		} else if ((user.getBirthday().getMonthValue() == 4 && user.getBirthday().getDayOfMonth() >= 20)
				|| (user.getBirthday().getMonthValue() == 5 && user.getBirthday().getDayOfMonth() <= 20)) {
			zodiacSign = "Tauro";
			return zodiacSign;
		} else if ((user.getBirthday().getMonthValue() == 5 && user.getBirthday().getDayOfMonth() >= 21)
				|| (user.getBirthday().getMonthValue() == 6 && user.getBirthday().getDayOfMonth() <= 20)) {
			zodiacSign = "Géminis";
			return zodiacSign;
		} else if ((user.getBirthday().getMonthValue() == 6 && user.getBirthday().getDayOfMonth() >= 21)
				|| (user.getBirthday().getMonthValue() == 7 && user.getBirthday().getDayOfMonth() <= 22)) {
			zodiacSign = "Cáncer";
			return zodiacSign;
		} else if ((user.getBirthday().getMonthValue() == 7 && user.getBirthday().getDayOfMonth() >= 23)
				|| (user.getBirthday().getMonthValue() == 8 && user.getBirthday().getDayOfMonth() <= 22)) {
			zodiacSign = "Leo";
			return zodiacSign;
		} else if ((user.getBirthday().getMonthValue() == 8 && user.getBirthday().getDayOfMonth() >= 23)
				|| (user.getBirthday().getMonthValue() == 9 && user.getBirthday().getDayOfMonth() <= 22)) {
			zodiacSign = "Virgo";
			return zodiacSign;
		} else if ((user.getBirthday().getMonthValue() == 9 && user.getBirthday().getDayOfMonth() >= 23)
				|| (user.getBirthday().getMonthValue() == 10 && user.getBirthday().getDayOfMonth() <= 22)) {
			zodiacSign = "Libra";
			return zodiacSign;
		} else if ((user.getBirthday().getMonthValue() == 10 && user.getBirthday().getDayOfMonth() >= 23)
				|| (user.getBirthday().getMonthValue() == 11 && user.getBirthday().getDayOfMonth() <= 21)) {
			zodiacSign = "Escorpio";
			return zodiacSign;
		} else if ((user.getBirthday().getMonthValue() == 11 && user.getBirthday().getDayOfMonth() >= 22)
				|| (user.getBirthday().getMonthValue() == 12 && user.getBirthday().getDayOfMonth() <= 21)) {
			zodiacSign = "Sagitario";
			return zodiacSign;
		} else {
			zodiacSign = "No es válida";
			return zodiacSign;
		}
	}
}