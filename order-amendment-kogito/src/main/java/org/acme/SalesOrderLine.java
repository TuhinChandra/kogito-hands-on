package org.acme;

import lombok.Data;

@Data
public class SalesOrderLine {
	
	private String fftSrcType;
	private int lineNumber;
	private Status currentStatus;
	private boolean amendable = true;
}