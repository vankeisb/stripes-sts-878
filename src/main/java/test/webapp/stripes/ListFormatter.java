package test.webapp.stripes;

import java.util.List;
import java.util.Locale;
import net.sourceforge.stripes.format.Formatter;

/**
 *
 */
public class ListFormatter implements Formatter<List> {

	@Override
	public String format(List list) {
		StringBuilder buf = new StringBuilder();
		for (Object o : list) {
			buf.append(o.toString()).append(", ");
		}
		return buf.toString();
	}
	
	@Override
	public void setFormatType(String string) {
		//Ignore
	}

	@Override
	public void setFormatPattern(String string) {
		//Ignore
	}

	@Override
	public void setLocale(Locale locale) {
		//Ignore
	}

	@Override
	public void init() {
		//Ignore
	}
}
