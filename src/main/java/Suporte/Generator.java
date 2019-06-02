package Suporte;

import java.security.Timestamp;
import java.text.SimpleDateFormat;

public class Generator {
	public static String dataHoraParaAquivo(){
		java.sql.Timestamp ts = new java.sql.Timestamp(System.currentTimeMillis());
		return new SimpleDateFormat("ddMMyyyy").format(ts);
	}

}
