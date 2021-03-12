package com.bbva.bolsa;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class DownloadCsv {

	private static final String FILE_NAME = "Tesla.csv";
	private static final String FILE_URL = "https://query1.finance.yahoo.com/v7/finance/download/TSLA?period1=1583938539&period2=1615474539&interval=1d&events=history&includeAdjustedClose=true";
	
	public static void main(String[] args) {
		try (BufferedInputStream in = new BufferedInputStream(new URL(FILE_URL).openStream());
		     FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME)) {
		     byte dataBuffer[] = new byte[1024];
			 int bytesRead;
			 while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
				   fileOutputStream.write(dataBuffer, 0, bytesRead);
		     }
			 System.out.println("Tesla file downloaded");
		} catch (IOException e) {
				System.out.println(e.getMessage());
				    // handle exception
		}
	}

}
