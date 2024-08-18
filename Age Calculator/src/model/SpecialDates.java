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
						return startingMessage + "de año nuevo ¡Es muy raro nacer en esta fecha!";
					case 2:
						return startingMessage + "del Policía y el día del Introvertido";
					case 3:
						return startingMessage + "de las Cerezas cubiertas de chocolate";
					case 4:
						return startingMessage + "Mundial del Braille y de la Hipnosis";
					case 5:
						return startingMessage + "de la Crema Batida o Nata Montada";
					case 6:
						return startingMessage + "de Reyes y día Mundial de los Huérfanos de la Guerra";
					case 7:
						return startingMessage + "del Sello Postal y este día es la Navidad Ortodoxa";
					case 8:
						return startingMessage + "de la Electricidad Estática y del Ascenso del Globo (USA)";
					case 9:
						return "Este día se luchó la Batalla de New Orleans";
					case 10:
						return startingMessage + "de la Gente Peculiar";
					case 11:
						return startingMessage + "del Agradecimiento y día de Planificar tus Vacaciones";
					case 12:
						return startingMessage + "Internacional de Besar a un Pelirrojo";
					case 13:
						return startingMessage
								+ "Mundial de la Lucha contra la Depresión, día Mundial del Chicle y del Sticker";
					case 14:
						return startingMessage
								+ "Mundial de la Lógica, de la Cometa, de Vestir a tu mascota y este día es el Año Nuevo Ortodoxo";
					case 15:
						return startingMessage + "Mundial de la Nieve, de la Religión y del Sombrero (USA)";
					case 16:
						return startingMessage + "de la Croqueta, de The Beatles y de la Comida Picante";
					case 17:
						return startingMessage + "Mundial de Bendecir a los Animales";
					case 18:
						return startingMessage + "de Winnie The Pooh";
					case 19:
						return startingMessage + "de las Palomitas de Maíz";
					case 20:
						return startingMessage + "de Concienciación de los pingüinos";
					case 21:
						return startingMessage
								+ "del Abrazo, de la Ardilla, del Mariachi, de la Meditación y del Pantalón Chandal";
					case 22:
						return "¡Hoy es el Año Nuevo Chino!";
					case 23:
						return startingMessage + "Mundial de la Libertad y del Community Manager";
					case 24:
						return startingMessage + "de la Educación, de la Cultura Africana y del Periodista (España)";
					case 25:
						return startingMessage + "de la Mujer en el Multilateralismo y de del Café Irlandés";
					case 26:
						return startingMessage
								+ "de la Educación Ambiental, de la Aduana, del Pescador y de la Enfermedad de Kawasaki";
					case 27:
						return startingMessage + "Internacional de la Conmemoración de las Víctimas del Holocausto";
					case 28:
						return startingMessage + "Internacional de Lego";
					case 29:
						return startingMessage + "Mundial contra la Lepra y día del Rompecabezas";
					case 30:
						return startingMessage + "Internacional del Croissant";
					case 31:
						return startingMessage + "Internacional del Mago y de la Cebra";
				}
				break;
			case 2:
				switch (user.getBirthday().getDayOfMonth()) {
					case 1:
						return startingMessage + "Mundial del Galgo y de la Lectura en Voz Alta";
					case 2:
						return startingMessage + "Mundial de los Humedales y de las Elecciones";
					case 3:
						return startingMessage + "del Abogado";
					case 4:
						return startingMessage + "Mundial contra el Cáncer y de la Fraternidad Humana";
					case 5:
						return startingMessage + "Mundial de la Nutella";
					case 6:
						return startingMessage + "Mundial de Bob Marley";
					case 7:
						return startingMessage + "Internacional del Internet Seguro y de mandar una carta a un amigo";
					case 8:
						return startingMessage + "del Nirvana";
					case 9:
						return startingMessage + "Mundial de la Pizza y de la Lengua Griega";
					case 10:
						return startingMessage + "Mundial de las Legumbres";
					case 11:
						return startingMessage + "Mundial del Cine";
					case 12:
						return startingMessage + "de Darwin y Día Mundial contra el Uso de Niños Soldado";
					case 13:
						return startingMessage + "del Soltero";
					case 14:
						return startingMessage + "de San Valentín";

					case 15:
						return startingMessage + "Mundial del Hipopótamo";
					case 16:
						return startingMessage + "de los Amores Imposibles";
					case 17:
						return startingMessage + "del Juego Responsable";
					case 18:
						return startingMessage + "del Pangolín y de las Ballenas";
					case 19:
						return startingMessage + "contra la Homofobia en el Fútbol";
					case 20:
						return startingMessage + "Internacional del Gato";
					case 21:
						return startingMessage + "de la Lengua Moderna";
					case 22:
						return startingMessage + "de la Encefalitis";
					case 23:
						return startingMessage + "Internacional del Control del Mercurio";
					case 24:
						return startingMessage + "Mundial del Barman";
					case 25:
						return startingMessage + "del Implante Coclear";
					case 26:
						return startingMessage + "Mundial del Pistacho";
					case 27:
						return startingMessage + "Mundial de las ONGs y del Oso Polar";
					case 28:
						return startingMessage + "de la Esterilización Animal";
					case 29:
						return startingMessage + "";
				}
				break;
			case 3:
				switch (user.getBirthday().getDayOfMonth()) {
					case 1:
						return startingMessage + "de la Cero Discriminación";
					case 2:
						return startingMessage + "del Bienestar Mental para Adolescentes";
					case 3:
						return startingMessage + "Mundial de la Vida Silvestre";
					case 4:
						return startingMessage + "de la Ingeniería para el Desarrollo Sostenible";
					case 5:
						return startingMessage + "de la Eficiencia Energética y de la Abstinencia Digital";
					case 6:
						return startingMessage + "del Escultor";
					case 7:
						return startingMessage + "Mundial de los Cereales";
					case 8:
						return startingMessage + "Internacional de la Mujer";
					case 9:
						return startingMessage + "Mundial del Riñón, del DJ y la Tortilla de Patatas";
					case 10:
						return startingMessage + "de Mario";
					case 11:
						return startingMessage + "Mundial de la Fontanería";
					case 12:
						return startingMessage + "Mundial del Glaucoma";
					case 13:
						return startingMessage + "Mundial del Cerebro";
					case 14:
						return startingMessage + "Internacional de las Matemáticas y del Número Pi";
					case 15:
						return startingMessage + "Mundial de los Derechos del Consumidor";
					case 16:
						return startingMessage + "Nacional del Oso Panda (USA)";
					case 17:
						return startingMessage + "Mundial del Sueño y de San Patricio";
					case 18:
						return startingMessage + "Mundial del Síndrome de Edwards";
					case 19:
						return startingMessage + "del Padre";
					case 20:
						return startingMessage + "Internacional de la Felicidad";
					case 21:
						return startingMessage + "Internacional de los BOsques y día del Síndrome de Down";
					case 22:
						return startingMessage + "Mundial del Agua";
					case 23:
						return startingMessage + "Mundial del Aprendizaje";
					case 24:
						return startingMessage + "Mundial de la Tuberculosis";
					case 25:
						return startingMessage + "Internacional del Waffle";
					case 26:
						return startingMessage + "Mundial del Clima";
					case 27:
						return startingMessage + "Mundial del Teatro";
					case 28:
						return startingMessage + "de la Torta Selva Negra";
					case 29:
						return startingMessage + "Mundial del Piano y día Nacional del Trasplante (España)";
					case 30:
						return startingMessage + "Mundial del Trastorno Bipolar";
					case 31:
						return startingMessage + "de la Torre Eiffel";
				}
				break;
			case 4:
				switch (user.getBirthday().getDayOfMonth()) {
					case 1:
						return startingMessage + "de los Inocentes o día de las Bromas";
					case 2:
						return startingMessage
								+ "Mundial de Concienciación sobre el Autismo y Día del Veterano y de los Caídos en la Guerra de Malvinas (Argentina)";
					case 3:
						return startingMessage + "Mundial del Arcoíris";
					case 4:
						return startingMessage + "Mundial de la Rata";
					case 5:
						return startingMessage + "Internacional de la Conciencia";
					case 6:
						return startingMessage + "Internacional del Deporte para el Desarrollo y la Paz";
					case 7:
						return startingMessage + "Mundial de la Salud";
					case 8:
						return startingMessage + "Internacional del Pueblo Gitano";
					case 9:
						return startingMessage
								+ "Nacional de Winston Churchill (USA) y día del Pago Igualitario (Argentina)";
					case 10:
						return startingMessage + "Internacional de la Homeopatía";
					case 11:
						return startingMessage + "Mundial del Parkinson";
					case 12:
						return startingMessage + "Internacional de los Niños en la Calle";
					case 13:
						return startingMessage + "Internacional del Beso";
					case 14:
						return startingMessage + "Internacional del Portero";
					case 15:
						return startingMessage + "Mundial del Arte y del Niño (España)";
					case 16:
						return startingMessage + "Mundial de la Voz";
					case 17:
						return startingMessage + "Mundial de la Hemofilia";
					case 18:
						return startingMessage + "Internacional de los Monumentos y Sitios";
					case 19:
						return startingMessage + "Mundial de los Simpson";
					case 20:
						return startingMessage + "de la Lengua China";
					case 21:
						return startingMessage + "Mundial de la Creatividad y la Innovación";
					case 22:
						return startingMessage + "Internacional de la Madre Tierra";
					case 23:
						return startingMessage + "de la Lengua Inglesa y la Lengua Española";
					case 24:
						return startingMessage + "Mundial de la Meningitis";
					case 25:
						return startingMessage + "Internacional del ADN y día Mundial de los Pingüinos";
					case 26:
						return startingMessage + "Internacional del Pene";
					case 27:
						return startingMessage + "del Diseño Gráfico";
					case 28:
						return startingMessage + "Mundial de la Seguridad y la Salud en el Trabajo";
					case 29:
						return startingMessage + "Internacional de la Danza";
					case 30:
						return startingMessage + "Internacional del Jazz";
				}
				break;
			case 5:
				switch (user.getBirthday().getDayOfMonth()) {
					case 1:
						return startingMessage + "Internacional de los Trabajadores";
					case 2:
						return startingMessage + "Internacional contra el Bullying o el Acoso Escolar";
					case 3:
						return startingMessage + "Mundial de la Libertad de Prensa";
					case 4:
						return startingMessage + "Internacional de los Bomberos";
					case 5:
						return startingMessage + "Internacional de la Higiene de Manos";
					case 6:
						return startingMessage + "Internacional sin Dietas";
					case 7:
						return startingMessage + "de la Madre y día Mundial de la Risa";
					case 8:
						return startingMessage + "Mundial de la Cruz Roja";
					case 9:
						return startingMessage + "de Europa";
					case 10:
						return startingMessage + "Mundial del Lupus";
					case 11:
						return startingMessage + "del Himno Nacional Argentino";
					case 12:
						return startingMessage + "Internacional de la Enfermera";
					case 13:
						return startingMessage + "Mundial de las Aves Migratorias";
					case 14:
						return startingMessage + "Día de la Madre (Colombia, USA, Venezuela y otros países)";
					case 15:
						return startingMessage + "Internacional de las Familias";
					case 16:
						return startingMessage + "Mundial de la Luz";
					case 17:
						return startingMessage + "Mundial del Internet";
					case 18:
						return startingMessage + "Internacional de los Museos";
					case 19:
						return startingMessage + "Mundial del Médico de Familia";
					case 20:
						return startingMessage + "Mundial de las Abejas";
					case 21:
						return startingMessage + "Internacional del Té";
					case 22:
						return startingMessage + "Mundial de Pac-Man";
					case 23:
						return startingMessage + "Internacional para la Erradicación de la Fístula Obstrética";
					case 24:
						return startingMessage + "Europeo de los Parques Naturales";
					case 25:
						return startingMessage + "de África";
					case 26:
						return startingMessage + "Mundial de Drácula";
					case 27:
						return startingMessage + "del Celiaco (España)";
					case 28:
						return startingMessage + "Internacional del Juego";
					case 29:
						return startingMessage + "Mundial de la Salud Digestiva";
					case 30:
						return startingMessage + "Mundial de la Esclerosis Múltiple";
					case 31:
						return startingMessage + "Mundial sin Tabaco";
				}
				break;
			case 6:
				switch (user.getBirthday().getDayOfMonth()) {
					case 1:
						return startingMessage + "Mundial de los Arrecifes";
					case 2:
						return startingMessage + "Mundial del Donut";
					case 3:
						return startingMessage + "Mundial de la Bicicleta";
					case 4:
						return startingMessage + "Mundial del Superviviente de Cáncer";
					case 5:
						return startingMessage + "Mundial del Medio Ambiente";
					case 6:
						return startingMessage + "Mundial de los Pacientes Trasplantados";
					case 7:
						return startingMessage + "Mundial de la Inocuidad de los Alimentos";
					case 8:
						return startingMessage
								+ "Mundial de los OCéanos y la Lucha contra la Falsificación y la Piratería";
					case 9:
						return startingMessage + "del Pato Donald";
					case 10:
						return startingMessage + "Mundial de Tejer en Público";
					case 11:
						return startingMessage + "Mundial del Cáncer de Próstata";
					case 12:
						return startingMessage + "con el Trabajo Infantil";
					case 13:
						return startingMessage + "Europeo de la Prevención del Cáncer de Piel";
					case 14:
						return startingMessage + "Mundial del Donante de Sangre";
					case 15:
						return startingMessage + "Mundial del Viento";
					case 16:
						return startingMessage + "Mundial de las Tortugas Marinas";
					case 17:
						return startingMessage + "Mundial de los Malabares";
					case 18:
						return startingMessage + "Mundial del Orgullo Autista";
					case 19:
						return startingMessage
								+ "Internacional para la Eliminación de la Violencia Sexual en los Conflictos";
					case 20:
						return startingMessage + "Mundial del Refugiado y el Yellow Day (El Día más Feliz del Mundo)";
					case 21:
						return startingMessage + "Internacional de la Celebración del Solsticio";
					case 22:
						return startingMessage + "Mundial de las Mujeres sin Ropa Interior";
					case 23:
						return startingMessage + "Internacional de las Viudas";
					case 24:
						return startingMessage + "Mundial de los Pitufos";
					case 25:
						return startingMessage + "de la Gente de Mar";
					case 26:
						return startingMessage
								+ "Internacional de la Lucha contra el Uso Indebido y el Tráfico ilícito de Drogas";
					case 27:
						return startingMessage + "de las Micro y Medianas Empresas";
					case 28:
						return startingMessage + "del Orgullo LGBT o del Orgullo Gay";
					case 29:
						return startingMessage + "Internacional de los Trópicos";
					case 30:
						return startingMessage + "Internacional de los Asteroides";
				}
				break;
			case 7:
				switch (user.getBirthday().getDayOfMonth()) {
					case 1:
						return startingMessage + "Internacional de las Cooperativas";
					case 2:
						return startingMessage + "Mundial de los OVNIs";
					case 3:
						return startingMessage + "Internacional Libre de BOlsas de Plástico";
					case 4:
						return startingMessage + "Mundial de los Delfines en Cautiverio";
					case 5:
						return startingMessage + "Mundial del Bikini";
					case 6:
						return startingMessage + "Internacional de la Zoonosis";
					case 7:
						return startingMessage + "Internacional de la Conservación del Suelo";
					case 8:
						return startingMessage + "Mundial de la Alergia";
					case 9:
						return startingMessage + "Internacional de la Destrucción de Armas de Fuego";
					case 10:
						return startingMessage + "Mundial del Glut1";
					case 11:
						return startingMessage + "Mundial de la Población";
					case 12:
						return startingMessage + "Mundial de los Recursos Renovables e Irrenovables";
					case 13:
						return startingMessage + "del Rock y del Director de Orquesta";
					case 14:
						return startingMessage + "Mundial del Chimpancé";
					case 15:
						return startingMessage + "Mundial de las Habilidades de la Juventud";
					case 16:
						return startingMessage + "Mundial de la Serpiente";
					case 17:
						return startingMessage + "del Emoji y del Tatuaje";
					case 18:
						return startingMessage + "Internacional de Nelson Mandela";
					case 19:
						return startingMessage + "Mundial de Sacar la Lengua";
					case 20:
						return startingMessage + "Mundial del Ajedrez";
					case 21:
						return startingMessage + "Mundial del Perro";
					case 22:
						return startingMessage + "de la Hamaca";
					case 23:
						return startingMessage + "de Batman";
					case 24:
						return startingMessage + "Internacional del Tequila";
					case 25:
						return startingMessage + "Internacional de la Mujer Afrodescendiente";
					case 26:
						return startingMessage + "de los Abuelos";
					case 27:
						return startingMessage + "Mundial de Andar con Zancos";
					case 28:
						return startingMessage + "Mundial contra el Hepatitis Vírica";
					case 29:
						return startingMessage + "Internacional del Tigre y las Alitas de Pollo";
					case 30:
						return startingMessage + "Internacional de la Amistad";
					case 31:
						return startingMessage + "Mundial de los Guardas Forestales";
				}
				break;
			case 8:
				switch (user.getBirthday().getDayOfMonth()) {
					case 1:
						return startingMessage + "Mundial de la Alegría";
					case 2:
						return startingMessage + "Mundial de la Lactancia Materna";
					case 3:
						return startingMessage + "Internacional de la Planificación Familiar";
					case 4:
						return startingMessage + "Internacional de la Cerveza";
					case 5:
						return startingMessage + "Mundial de la Lactancia Materna";
					case 6:
						return startingMessage + "Nacional de la Miel (Chile)";
					case 7:
						return startingMessage + "Mundial de los Faros";
					case 8:
						return startingMessage + "Internacional del Orgasmo Femenino";
					case 9:
						return startingMessage + "Internacional de la Población Indígena";
					case 10:
						return startingMessage + "Mundial del León";
					case 11:
						return startingMessage + "del Nutricionista";
					case 12:
						return startingMessage + "Mundial del Elefante";
					case 13:
						return startingMessage + "Internacional del Armadillo";
					case 14:
						return startingMessage + "Mundial del Lagarto";
					case 15:
						return startingMessage + "Mundial de la Relajación";
					case 16:
						return startingMessage + "Internacional del Ron";
					case 17:
						return startingMessage + "Mundial del Peatón";
					case 18:
						return startingMessage + "Mundial de la Prevención de Incendios Forestales";
					case 19:
						return startingMessage + "Mundial de la Asistencia Humanitaria";
					case 20:
						return startingMessage + "Mundial de las Patatas Fritas";
					case 21:
						return startingMessage
								+ "Internacional de Conmemoración y HOmenaje a las Víctimas del Terrorismo";
					case 22:
						return startingMessage + "Mundial del Folclore";
					case 23:
						return startingMessage
								+ "Internacional para el Recuerdo del Comercio de Esclavos y su Abolición";
					case 24:
						return startingMessage + "del Lector";
					case 25:
						return startingMessage + "Internacional del Peluquero";
					case 26:
						return startingMessage + "Internacional contra el Dengue";
					case 27:
						return startingMessage + "de la Radio";
					case 28:
						return startingMessage + "Mundial del Síndrome de Turner";
					case 29:
						return startingMessage + "Mundial del Videojuego";
					case 30:
						return startingMessage + "Internacional de los Desaparecidos";
					case 31:
						return startingMessage + "Internacional de la Solidaridad";
				}
				break;
			case 9:
				switch (user.getBirthday().getDayOfMonth()) {
					case 1:
						return startingMessage + "en el que comenzó la Segunda Guerra Mundial";
					case 2:
						return startingMessage + "Internacional del Buitre";
					case 3:
						return startingMessage + "Mundial de la Higiene";
					case 4:
						return startingMessage + "Internacional del Taekwondo";
					case 5:
						return startingMessage + "Mundial del Hermano y de la Beneficencia";
					case 6:
						return startingMessage + "del Trabajo (USA)";
					case 7:
						return startingMessage + "Mundial del Pelirrojo";
					case 8:
						return startingMessage + "Internacional de la Alfabetización";
					case 9:
						return startingMessage + "Mundial de la Arepa";
					case 10:
						return startingMessage + "Internacional para la Prevención del Suicidio";
					case 11:
						return startingMessage + "de los Patriotas (USA)";
					case 12:
						return startingMessage + "Internacional del Crochet";
					case 13:
						return startingMessage + "Internacional del Chocolate";
					case 14:
						return startingMessage + "Mundial de la Hepatitis Atópica";
					case 15:
						return startingMessage + "Internacional de la Democracia";
					case 16:
						return startingMessage + "Internacional de la Capa de Ozono";
					case 17:
						return startingMessage + "Mundial de la Seguridad del Paciente";
					case 18:
						return startingMessage + "Internacional de la Igualdad Salarial";
					case 19:
						return startingMessage + "Mundial de Hablar Pirata";
					case 20:
						return startingMessage + "Internacional del Deporte Universitario";
					case 21:
						return startingMessage + "Internacional de la Paz";
					case 22:
						return startingMessage + "Mundial sin Coche";
					case 23:
						return startingMessage + "de Equinoccio de Otoño o Primavera (Hemisferio Sur)";
					case 24:
						return startingMessage + "Mundial del Gorila";
					case 25:
						return startingMessage + "Mundial del Farmacéutico";
					case 26:
						return startingMessage + "Internacional para la Eliminación Total de Armas Nucleares";
					case 27:
						return startingMessage + "Mundial del Turismo";
					case 28:
						return startingMessage + "Internacional del Derecho de Acceso Universal a la Información";
					case 29:
						return startingMessage + "Mundial del Corazón";
					case 30:
						return startingMessage + "Internacional de la Traducción";
				}
				break;
			case 10:
				switch (user.getBirthday().getDayOfMonth()) {
					case 1:
						return startingMessage + "Internacional de las Personas de Edad";
					case 2:
						return startingMessage + "Internacional de la No Violencia";
					case 3:
						return startingMessage + "Nacional de los Novios (USA, España, etc)";
					case 4:
						return startingMessage + "Mundial de los Animales";
					case 5:
						return startingMessage + "Mundial de los Docentes";
					case 6:
						return startingMessage + "Internacional de la Geodiversidad";
					case 7:
						return startingMessage + "Mundial del Algodón";
					case 8:
						return startingMessage + "de los Tíos";
					case 9:
						return startingMessage + "Mundial del Correo";
					case 10:
						return startingMessage + "Mundial de la Salud Mental";
					case 11:
						return startingMessage + "Internacional de la Niña";
					case 12:
						return startingMessage + "Mundial de la Visión";
					case 13:
						return startingMessage + "Internacional para la Reducción de los Desastres";
					case 14:
						return startingMessage + "Mundial de las Aves Migratorias";
					case 15:
						return startingMessage + "Internacional de las Mujeres Rurales";
					case 16:
						return startingMessage + "Mundial de la Alimentación";
					case 17:
						return startingMessage + "Internacional para la Erradicación de la Pobreza";
					case 18:
						return startingMessage + "Mundial de la Menopausia";
					case 19:
						return startingMessage + "Internacional de la Lucha contra el Cáncer de Mama";
					case 20:
						return startingMessage + "Mundial de la Estadística";
					case 21:
						return startingMessage + "Mundial del Ahorro de Energía";
					case 22:
						return startingMessage + "Internacional de la Tartamudez";
					case 23:
						return startingMessage + "del Médico (México)";
					case 24:
						return startingMessage
								+ "de las Naciones Unidas y día Mundial de Información sobre el Desarrollo";
					case 25:
						return startingMessage + "Internacional del Artista";
					case 26:
						return startingMessage + "de la Suegra";
					case 27:
						return startingMessage + "Mundial del Patrimonio Audiovisual";
					case 28:
						return startingMessage + "Mundial de la Animación";
					case 29:
						return startingMessage + "Mundial del Ataque Cerebro Vascular";
					case 30:
						return "¡Naciste en Halloween!";
					case 31:
						return startingMessage + "Mundial de las Ciudades";
				}
				break;
			case 11:
				switch (user.getBirthday().getDayOfMonth()) {
					case 1:
						return startingMessage + "de Todos los Santos";
					case 2:
						return startingMessage
								+ "Internacional para Poner Fin a la impunidad de los Crímenes contra los Periodistas";
					case 3:
						return startingMessage + "Mundial del Sandwich";
					case 4:
						return startingMessage + "de la UNESCO";
					case 5:
						return startingMessage + "Mundial de Concienciación Sobre los Sunamis";
					case 6:
						return startingMessage
								+ "Internacional para la Prevención de Explotación del Medio Ambiente en la Guerra y los Conflictos Armados";
					case 7:
						return startingMessage + "Internacional de la Física Médica";
					case 8:
						return startingMessage + "Mundial de la Radiología";
					case 9:
						return startingMessage + "del Inventor Internacional";
					case 10:
						return startingMessage + "Mundial de la Ciencia para la Paz y el Desarrollo";
					case 11:
						return startingMessage + "de las Librerías";
					case 12:
						return startingMessage + "Mundial contra la Neumonía";
					case 13:
						return startingMessage + "Mundial de la Bondad";
					case 14:
						return startingMessage + "Mundial de la Diabetes";
					case 15:
						return startingMessage + "Mundial  sin Alcohol";
					case 16:
						return startingMessage + "Mundial de la Filosofía";
					case 17:
						return startingMessage + "Internacional de los Estudiantes";
					case 18:
						return startingMessage
								+ "Mundial para Prevenir la Explotación, los Abusos y la Violencia Sexuales contra los Niños y Promover la Sanación";
					case 19:
						return startingMessage + "Mundial del Retrete";
					case 20:
						return startingMessage + "de la Industrialización de África";
					case 21:
						return startingMessage + "Mundial de la Televisión";
					case 22:
						return startingMessage + "de la Música";
					case 23:
						return startingMessage + "Internacional de la Palabra";
					case 24:
						return startingMessage + "de No Comprar Nada (USA)";
					case 25:
						return startingMessage + "Internacional de la Eliminación de la Violencia contra la Mujer";
					case 26:
						return startingMessage + "Mundial del Olivo";
					case 27:
						return startingMessage + "del Maestro (España)";
					case 28:
						return startingMessage + "de Santa Catalina Labouré";
					case 29:
						return startingMessage + "Internacional de Solidaridad con el Pueblo Palestino";
					case 30:
						return startingMessage + "de Conmemoración de todas las víctimas de la guerra química";
				}
				break;
			case 12:
				switch (user.getBirthday().getDayOfMonth()) {
					case 1:
						return startingMessage + "Mundial del SIDA";
					case 2:
						return startingMessage + "Internacional para la Abolición de la Esclavitud";
					case 3:
						return startingMessage + "Internacional de las Personas con Discapacidad";
					case 4:
						return startingMessage + "Internacional de los Bancos";
					case 5:
						return startingMessage + "Mundial del Suelo";
					case 6:
						return startingMessage + "de la COnstitución (España)";
					case 7:
						return startingMessage + "de la Aviación Civil Internacional";
					case 8:
						return startingMessage + "de la Inmaculada Concepción";
					case 9:
						return startingMessage + "Internacional contra la Corrupción";
					case 10:
						return startingMessage + "de los Derechos Humanos";
					case 11:
						return startingMessage + "Internacional de las Montañas";
					case 12:
						return startingMessage + "Internacional de la Neutralidad";
					case 13:
						return startingMessage + "Nacional del Cacao (USA)";
					case 14:
						return startingMessage + "Mundial del Mono y Nacional de la Persona Obesa (España)";
					case 15:
						return startingMessage + "Mundial del Otaku";
					case 16:
						return startingMessage + "de la Lectura";
					case 17:
						return startingMessage + "del Contador";
					case 18:
						return startingMessage + "Internacional del Migrante";
					case 19:
						return startingMessage + "Internacional del Emo";
					case 20:
						return startingMessage + "Internacional de la Solidaridad Humana";
					case 21:
						return startingMessage + "del Solsticio de Invierno";
					case 22:
						return startingMessage + "Mundial del Termómetro";
					case 23:
						return startingMessage + "Nacional de las Raíces (USA)";
					case 24:
						return startingMessage + "de Nochebuena";
					case 25:
						return "¡Naciste en Navidad!";
					case 26:
						return startingMessage + "de las Cajas";
					case 27:
						return startingMessage + "Internacional de la Solidaridad Humana";
					case 28:
						return startingMessage + "de los Inocentes";
					case 29:
						return startingMessage + "Mundial del Pimentero";
					case 30:
						return startingMessage + "Internacional del Cine Indio";
					case 31:
						return startingMessage + "de Nochevieja";
				}
				break;
		}
		return message;
	}

	// El programa identifica el signo zodiacal al cual pertenece el user
	public String ZodiacSign(User user) {
		String zodiacSign = " ";
		if ((user.getBirthday().getMonthValue() == 12 && user.getBirthday().getDayOfMonth() >= 22)
				|| (user.getBirthday().getMonthValue() == 1 && user.getBirthday().getDayOfMonth() <= 19)) {
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
			zodiacSign = "No es válido";
			return zodiacSign;
		}
	}
}