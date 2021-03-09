package Fecha;

import java.util.StringTokenizer;

class Fecha {
	
	private int dia;
	
	private int mes;
	
	private int anyo;

	private static final String[] DIAS_TEXTO = new String[] { "domingo", "lunes", "martes", "miercoles", "jueves", "viernes",
			"sabado"};

	private static final String[] MESES_TEXTO = new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio",
			"julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" };

	/**
	 *  Constructor por defecto
	 *  Inicializa una fecha a dia 1-1-1
	 */
	public Fecha() {
		// tu codigo aqui
		this.dia=1;
		this.mes=1;
		this.anyo=1;
	}

	/**
	 *  Inicializa la fecha a partir de los parámetros recibidos
	 */
	public Fecha(int dia, int mes, int anyo) {
		// Tu código aquí
		this.dia=dia;
		this.mes=mes;
		this.anyo=anyo;
	}

	/**
	 * Crea una fecha a partir de otra fecha pasada como argumento
	 *
	 * Deberemos hacer uso de los métodos consultores para inicializar nuestra clase
	 * @param fecha
	 */
	public Fecha(Fecha fecha) {
		// Tu código aquí

	}

	/**
	 * Inicializa la fecha a partir de otra pasada en formato String dd/mm/yyyy
	 *
	 * Deberemos trocearlas de forma que asignemos el día més y año a cada uno de los atributoe
	 * @param fecha
	 */
	public Fecha(String fecha) {
		// Tu código aquí
	}

	/**
	 * Modifica la fecha actual a partir de los datos pasados como argumento
	 */
	public void set(int dia, int mes, int anyo) {
		// Tu código aquí
		this.dia=dia;
		this.mes=mes;
		this.anyo=anyo;
	}

	/**
	 * Devuelve el día de la semana que representa por la Fecha actual
	 * @return @dia
	 */
	public int getDia() {

		return this.dia;
	}

	/**
	 * Devuelve el mes que representa la Fecha actual
	 * @return @mes
	 */
	public int getMes(){

		return this.mes;
	}

	/**
	 * Devuelve el año que representa la Fecha actual
	 * @return @mes
	 */
	public int getAnyo(){
		return this.anyo;
	}

	/**
	 * Muestra por pantalla la fecha en formato español dd-mm-yyyy
	 */
	public void mostrarFormatoES()  {
		// Tu código aquí
		System.out.println(this.dia+"-"+this.mes+"-"+this.anyo);
	}

	/**
	 * Muestra por pantalla la fecha en formato inglés yyyy-mm-dd
	 */
	public void mostrarFormatoGB() {
		// Tu código aquí
		System.out.println(this.anyo+"-"+this.mes+"-"+this.anyo);
	}

	/**
	 * Muestra por pantalla la fecha en formato texto dd-mmmmm-yyyy
	 */
	public void mostrarFormatoTexto() {
		// Tu código aquí
		System.out.println(this.dia+"-"+MESES_TEXTO[this.mes-1]+"-"+this.anyo);
	}

	/**
	 * Retorna un booleano indicando si la fecha del objeto es igual a la fecha pasada como
	 * argumento
	 *
	 * @return boolean
	 */
	public boolean isEqual(Fecha otraFecha) {
		return false;
	}

	/**
	 * Retorna el dia correspondiente de la semana en formato String
	 * @return String
	 */
	public String getDiaSemana() {
		return null;
	}

	/**
	 * Solo Festivo sábado o domingo
	 * @return boolean
	 */
	public boolean isFestivo() {
		if (getDiaSemana().equals("domingo") || getDiaSemana().equals("sabado")){
			return true;
		}else {
			return false;
		}
	}

	/**
	 * Devuelve un objeto de tipo fecha que representa una fecha añadiendo  @numDias
	 * A la fecha Actual. El número máximo de dias a restar es 30
	 *
	 * @return boolean
	 */
	public Fecha anyadir(int numDias){
		return null;
	}

	/**
	 * Devuelve un objeto de tipo fecha que representa una fecha restando @numDias
	 * A la fecha Actual. El número máximo de dias a restar es 30
	 *
	 * @return boolean
	 */
	public Fecha restar(int numDias){
		return null;
	}

	public boolean isCorrecta(){
		if (dia>0 &&dia<31){
			return true;
		}else {
			return false;
		}
	}

	/**
	 * Retorna el dia correspondiente de la semana en formato caracter
	 * @return char
	 */
	private String getMesTexto() {
		return null;
	}

	/**
	 * Devuelve el número de dias transcurridos desde el 1-1-1
	 *
	 * @return int
	 */
	private int getDiasTranscurridosOrigen() {
		return 0;
	}

	/**
	 * Devuelve el número de dias transcurridos en el anyo actual
	 *
	 * @return int
	 */
	private int getDiasTranscurridosAnyo() {
		return 0;
	}

	/**
	 * Indica si el año pasado como argumento es bisiesto
	 * Un año es bisiesto si es divisible por 4 a su vez 100 por 400
	 *
	 * @return boolean
	 */
	private boolean isBisiesto(int anyo){
		if (anyo % 4 == 0 && anyo % 100 != 0 ||anyo % 400 ==0){
			return true;
		}else {
			return false;
		}
	}

	/**
	 *  Calcula el número de días que tiene el mes representado por la fecha actual
	 *
	 *  @return int total dias mes en curso
	 */
	private int getDiasMes(int mes, int anyo) {
		int mes_febrero=0;
		if (isBisiesto(anyo)){
			mes_febrero=29;
		}else {
			mes_febrero=28;
		}
		if (MESES_TEXTO[mes].equals("febrero")){
			for (int i = 0; i < mes_febrero; i++) {

			}
		}

		return 0;
	}

	/**
	 * Calcula el número total de dias que tiene el año pasado como argumento
	 *
	 * @return int total dias anyo en curso
	 */
	public int getDiasAnyo(int anyo){
		if (isBisiesto(anyo)){
			return 366;
		}else {
			return 365;
		}
	}
}