package org.edi.sample.models;

public class NameSegment {
	
	private String recordType;

	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	@Override
	public String toString() {
		return "[recordType=" + recordType + "]";
	}

}
