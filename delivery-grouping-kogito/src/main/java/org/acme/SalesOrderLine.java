package org.acme;

import lombok.Data;

@Data
public class SalesOrderLine {

	private String shippingMethodCode;
	private String ean;
	private String fftSrcType;
	private int lineNumber;
	private String fftSiteId;
}