package jaxb;


import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AdapterDate extends XmlAdapter<String, Date> {

	private static final ThreadLocal<DateFormat> dateFormat = new ThreadLocal<DateFormat>() {

		 @Override
	        protected DateFormat initialValue() {
	            return new SimpleDateFormat("dd/MM/yyyy");
	        }
	    };

	@Override
	public Date unmarshal(String v) throws Exception {
		return dateFormat.get().parse(v);
	}

	@Override
	public String marshal(Date v) throws Exception {
		return dateFormat.get().format(v);
	}

	

}
