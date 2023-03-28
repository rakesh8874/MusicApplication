package com.niit.backendc3s4mc.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "User isn't Registered in our portal")
public class UserNotFoundException extends Exception{
}
