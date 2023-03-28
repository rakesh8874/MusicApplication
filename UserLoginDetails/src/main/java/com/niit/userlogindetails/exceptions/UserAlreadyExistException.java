package com.niit.backendc3s4mc.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "User has already registered in our portal")
public class UserAlreadyExistException extends Exception{
}
