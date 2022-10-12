package org.acme;

import lombok.Data;

@Data
public class SalesOrderLine {
	
	private String fftSrcType;
	private int lineNumber;
	private int currentStatus;
	private boolean amendable = true;
}