package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public interface ValidationService {
    boolean validatePassword(String password)throws TooLongException,TooShortException;
    boolean validateUsername(String username)throws NameExistsException;
}
