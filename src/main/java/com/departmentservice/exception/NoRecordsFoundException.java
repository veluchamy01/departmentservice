/**
 * 
 */
package com.departmentservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author mrvel
 *
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NoRecordsFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1987035802594717279L;
	private final String message;

	public NoRecordsFoundException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
