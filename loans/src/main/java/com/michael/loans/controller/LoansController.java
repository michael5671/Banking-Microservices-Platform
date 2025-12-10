package com.michael.loans.controller;

import com.michael.loans.dto.LoansDto;
import com.michael.loans.dto.RepsonseDto;
import jakarta.validation.constraints.Pattern;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api", produces = {MediaType.APPLICATION_JSON_VALUE})
public class LoansController {

}
