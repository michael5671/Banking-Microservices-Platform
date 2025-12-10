package com.michael.loans.service;

import com.michael.loans.dto.LoansDto;

public interface ILoansService {
    /**
     *
     * @param mobileNumber - mobile number of the Customer
     *
     */
    void createLoan(String mobileNumber);

    /**
     *
     * @param mobileNumber
     * @return Loan Details based on a give mobileNumber
     */
    LoansDto fetchLoan(String mobileNumber);

    /**
     *
     * @param loansDto
     * @return boolean indicating if the update of Loan details is successful or not
     */
    boolean updateLoan(LoansDto loansDto);

    /**
     *
     * @param mobileNumber
     * @return boolean indicating if the deletion of Loan details is successful or not
     */
    boolean deleteLoan(String mobileNumber);
}
