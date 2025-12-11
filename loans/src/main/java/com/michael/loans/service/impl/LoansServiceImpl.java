package com.michael.loans.service.impl;

import com.michael.loans.constants.LoansConstants;
import com.michael.loans.dto.LoansDto;
import com.michael.loans.entity.Loans;
import com.michael.loans.exception.LoanAlreadyExistsException;
import com.michael.loans.exception.ResourceNotFoundException;
import com.michael.loans.mapper.LoansMapper;
import com.michael.loans.repository.LoansRepository;
import com.michael.loans.service.ILoansService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class LoansServiceImpl implements ILoansService {

    private LoansRepository loansRepository;
    /**
     *
     * @param mobileNumber - mobile number of the Customer
     *
     */
    @Override
    public void createLoan(String mobileNumber) {
        Optional<Loans> optionalLoans = loansRepository.findByMobileNumber(mobileNumber);
        if(optionalLoans.isPresent()){
            throw new LoanAlreadyExistsException("Loan already registered with given mobileNumber "+mobileNumber);
        }
        loansRepository.save(createNewLoans(mobileNumber));
    }
    public Loans createNewLoans(String mobileNumber){
        Loans newLoan = new Loans();
        long randomLoanNumber = 100000000000L + new Random().nextInt(900000000);
        newLoan.setLoanNumber(Long.toString(randomLoanNumber));
        newLoan.setMobileNumber(mobileNumber);
        newLoan.setLoanType(LoansConstants.HOME_LOAN);
        newLoan.setTotalLoan(LoansConstants.NEW_LOAN_LIMIT);
        newLoan.setAmountPaid(0);
        newLoan.setOutstandingAmount(LoansConstants.NEW_LOAN_LIMIT);
        return newLoan;
    }

    /**
     *
     * @param mobileNumber
     * @return Loan Details based on a give mobileNumber
     */
    @Override
    public LoansDto fetchLoan(String mobileNumber) {
        Loans loans = loansRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new ResourceNotFoundException("Loan", "mobileNumber", mobileNumber)
        );
        return LoansMapper.mapToLoansDto(loans, new LoansDto());
    }

    /**
     *
     * @param loansDto
     * @return boolean indicating if the update of Loan details is successful or not
     */
    @Override
    public boolean updateLoan(LoansDto loansDto) {
        Loans loans = loansRepository.findByLoanNumber(loansDto.getLoanNumber()).orElseThrow(
                () -> new ResourceNotFoundException("Loan","loanNumber", loansDto.getLoanNumber())
        );
        loansRepository.save(loans);
        return true;
    }

    /**
     *
     * @param mobileNumber
     * @return boolean indicating if the deletion of Loan details is successful or not
     */
    @Override
    public boolean deleteLoan(String mobileNumber) {
        Loans loan = loansRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new ResourceNotFoundException("Loan", "numberMobile", mobileNumber)
        );
        loansRepository.deleteById(loan.getLoanId());
        return true;
    }
}
