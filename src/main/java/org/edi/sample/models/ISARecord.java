package org.edi.sample.models;

import java.util.Date;

public class ISARecord {
	private String recordType;
	private String sender;
	private String receiver;
	private Date date;
	private String time;
	private String version;
	private String controlNumber;
	public String getRecordType() {
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getControlNumber() {
		return controlNumber;
	}
	public void setControlNumber(String controlNumber) {
		this.controlNumber = controlNumber;
	}
	@Override
	public String toString() {
		return "PurchaseOrder [recordType=" + recordType + ", sender=" + sender + ", receiver=" + receiver + ", date="
				+ date + ", time=" + time + ", version=" + version + ", controlNumber=" + controlNumber + "]";
	}
	

}
