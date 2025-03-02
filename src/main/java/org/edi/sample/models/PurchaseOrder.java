package org.edi.sample.models;

import java.util.List;

public class PurchaseOrder {

	private ISARecord recordType;
	private FunctionalGroup functionalGroup;
	private TransactionSet transactionSet;
	private BeginChangeSet beginChangeSet;
	private List<Reference> reference;
	private NameSegment nameSegment;
	private List<LineItem> lineItem;

	private String transactionTotals;
	private String transactionSetEnd;
	private String functionGroupEnd;
	private String interchangeControl;
	public ISARecord getRecordType() {
		return recordType;
	}
	public void setRecordType(ISARecord recordType) {
		this.recordType = recordType;
	}
	public FunctionalGroup getFunctionalGroup() {
		return functionalGroup;
	}
	public void setFunctionalGroup(FunctionalGroup functionalGroup) {
		this.functionalGroup = functionalGroup;
	}
	public TransactionSet getTransactionSet() {
		return transactionSet;
	}
	public void setTransactionSet(TransactionSet transactionSet) {
		this.transactionSet = transactionSet;
	}
	public BeginChangeSet getBeginChangeSet() {
		return beginChangeSet;
	}
	public void setBeginChangeSet(BeginChangeSet beginChangeSet) {
		this.beginChangeSet = beginChangeSet;
	}
	public List<Reference> getReference() {
		return reference;
	}
	public void setReference(List<Reference> reference) {
		this.reference = reference;
	}
	public NameSegment getNameSegment() {
		return nameSegment;
	}
	public void setNameSegment(NameSegment nameSegment) {
		this.nameSegment = nameSegment;
	}
	public List<LineItem> getLineItem() {
		return lineItem;
	}
	public void setLineItem(List<LineItem> lineItem) {
		this.lineItem = lineItem;
	}
	public String getTransactionTotals() {
		return transactionTotals;
	}
	public void setTransactionTotals(String transactionTotals) {
		this.transactionTotals = transactionTotals;
	}
	public String getTransactionSetEnd() {
		return transactionSetEnd;
	}
	public void setTransactionSetEnd(String transactionSetEnd) {
		this.transactionSetEnd = transactionSetEnd;
	}
	public String getFunctionGroupEnd() {
		return functionGroupEnd;
	}
	public void setFunctionGroupEnd(String functionGroupEnd) {
		this.functionGroupEnd = functionGroupEnd;
	}
	public String getInterchangeControl() {
		return interchangeControl;
	}
	public void setInterchangeControl(String interchangeControl) {
		this.interchangeControl = interchangeControl;
	}
	@Override
	public String toString() {
		return "PurchaseOrder [recordType=" + recordType + ", functionalGroup=" + functionalGroup + ", transactionSet="
				+ transactionSet + ", beginChangeSet=" + beginChangeSet + ", reference=" + reference + ", nameSegment="
				+ nameSegment + ", lineItem=" + lineItem + ", transactionTotals=" + transactionTotals
				+ ", transactionSetEnd=" + transactionSetEnd + ", functionGroupEnd=" + functionGroupEnd
				+ ", interchangeControl=" + interchangeControl + "]";
	}
	
	
}