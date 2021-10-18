package io.github.idelvane.customermanagement.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;


/**
 * Classe que implementa método utilitários para API.
 * 
 * @author Idelvane
 */
public class CustomerApiUtil {
	
	/**
	 * Representa o API version nos requests/responses header
	 */
	public static final String HEADER_CUSTOMER_MANAGEMENT_API_VERSION = "customer-management-api-version";
	
	/**
	 * Representa a chave da API no requests/responses header
	 */
	public static final String HEADER_API_KEY = "X-api-key";
	
	
	private CustomerApiUtil() {}
	
	
	/**
	 * Formata data no formato yyyy-MM-dd.
	 * 
	 * 
	 * @return <code>DateTimeFormatter</code> object
	 */
	public static DateTimeFormatter getDateFormater() {
		return DateTimeFormatter.ofPattern("yyyy-MM-dd");
	}
	
	/**
	 * Formata data no formato yyyy-MM-dd'T'HH:mm:ss.SSS'Z'.
	 * 
	 * @return <code>DateTimeFormatter</code> object
	 */
	public static DateTimeFormatter getDateTimeFormater() {
		return DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
	}
	
	/**
	 * Converte uma String em LocalDateTime.
	 * 
	 * @param dateString
	 * 
	 * @return <code>LocalDateTime</code> object
	 * @throws ParseException
	 */
	public static LocalDateTime convertStringToLocalDateTime(String dateString) throws ParseException{
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        Date date = inputFormat.parse(dateString);
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	}
	
	/**
	 * Converte um LocalDate em LocalDateTime 
	 * 
	 * 
	 * @param date
	 * @return <code>LocalDateTime</code> object
	 */
	public static LocalDateTime convertLocalDateToLocalDateTime(LocalDate date) {
		return date.atTime(0, 0, 0);
	}
	
}
