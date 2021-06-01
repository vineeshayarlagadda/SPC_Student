package com.g3.spc.service;

import java.util.List;

import com.g3.spc.entities.Fee;
import com.g3.spc.entities.FeeInstallment;
import com.g3.spc.entities.Student;

public interface IFeeInstallmentService {
	public FeeInstallment makePayment(FeeInstallment feeInstallment);
	public List<FeeInstallment> pendingInstallments(Student student);
	public FeeInstallment retrieveFeeInstallmentById(int id);
	public List<FeeInstallment> retrieveAllFeeInstallmentsByFee(Fee fee);
	
}
