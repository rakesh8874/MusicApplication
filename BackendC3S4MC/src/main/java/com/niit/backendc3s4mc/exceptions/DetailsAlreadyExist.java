package com.niit.userproductservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "User Product Details are Already registered in our portal")
public class DetailsAlreadyExist extends Exception{
}
