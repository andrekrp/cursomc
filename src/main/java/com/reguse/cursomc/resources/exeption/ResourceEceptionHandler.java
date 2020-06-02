package com.reguse.cursomc.resources.exeption;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.reguse.cursomc.services.exceptions.ObjectNotFondException;

@ControllerAdvice
public class ResourceEceptionHandler {
	
	@ExceptionHandler(ObjectNotFondException.class)
	public ResponseEntity<StandardError> objectNotFond(ObjectNotFondException e,
			HttpServletRequest request){
		
		StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
		
	}
	

}
