package com.michael.loans.service.impl;

import com.michael.loans.dto.LoansDto;
import com.michael.loans.service.ILoansService;

public class LoansServiceImpl implements ILoansService {
    /**
     *
     * @param mobileNumber - mobile number of the Customer
     *
     */
    @Override
    public void createLoan(String mobileNumber) {

    }

    /**
     *
     * @param mobileNumber
     * @return Loan Details based on a give mobileNumber
     */
    @Override
    public LoansDto fetchLoan(String mobileNumber) {
        return null;
    }

    /**
     *
     * @param loansDto
     * @return boolean indicating if the update of Loan details is successful or not
     */
    @Override
    public boolean updateLoan(LoansDto loansDto) {
        return false;
    }

    /**
     *
     * @param mobileNumber
     * @return boolean indicating if the deletion of Loan details is successful or not
     */
    @Override
    public boolean deleteLoan(String mobileNumber) {
        return false;
    }
}
