package com.bbva.bolsa;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class LecturaCsv {
	private static final String FILE_NAME = "Tesla.csv";
	
	public static void main(String[] args) {
        try (var fr = new FileReader(FILE_NAME, StandardCharsets.UTF_8);
        	 var reader = new CSVReader(fr)) {

        	var rows = reader.readAll();

            for (var row : rows) {
            	
                for (var columnData : row) {
                    System.out.format("%s ", columnData);
                }

                System.out.println();
            }
        }
        catch(IOException e){
        	System.out.println(e.getMessage());
        }catch(CsvException e){
        	System.out.println(e.getMessage());
        }
	}

}
