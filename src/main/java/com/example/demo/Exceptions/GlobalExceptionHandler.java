package com.example.demo.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
		@ExceptionHandler(value=patientsNotFoundException.class) 
		@ResponseStatus(HttpStatus.NOT_FOUND)
		public  @ResponseBody   ErrorMessage handleEmployeeException(patientsNotFoundException exception)
		{
			return new ErrorMessage(HttpStatus.NOT_FOUND.value(),exception.getMessage());
			
		}

}
