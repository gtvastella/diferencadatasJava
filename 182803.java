import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoUnit;


class Main {

	public static void main(String[] args) throws IOException {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		LocalDate[] datas = new LocalDate[2];
		
		for(int i =0;i<2;i++) {
			String dt = reader.readLine();
			dt = dt.replaceAll("\\s+","");
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
		   
			try {
				LocalDate data = LocalDate.parse(dt, dtf);
;
		    	datas[i] = data;
		    } catch( DateTimeParseException ex) {
		    	System.out.println("Data invalida: " + dt);
		    	return;
		    }
		}
		
		
	    System.out.println(Math.abs(ChronoUnit.DAYS.between(datas[0], datas[1])));
	}
	
	
}

