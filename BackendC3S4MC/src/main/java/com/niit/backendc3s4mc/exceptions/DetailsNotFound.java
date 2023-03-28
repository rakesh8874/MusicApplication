package com.niit.userproductservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "User Product Details are Not Available in our Portal")
public class DetailsNotFound extends Exception{
}
