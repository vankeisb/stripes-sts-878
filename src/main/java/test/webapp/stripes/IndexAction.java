package test.webapp.stripes;

import java.util.ArrayList;
import java.util.List;
import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import net.sourceforge.stripes.validation.OneToManyTypeConverter;
import net.sourceforge.stripes.validation.Validate;

/**
 *
 */
@UrlBinding("/index.action")
public class IndexAction implements ActionBean {
	
	@DefaultHandler
	public Resolution display() {
		return new ForwardResolution("/WEB-INF/jsp/index.jsp");
	}
	
	public Resolution save() {
		return new RedirectResolution(IndexAction.class);
	}

	public List<String> getVals() {
		return vals;
	}

	public void setVals(List<String> vals) {
		this.vals = vals;
	}
		
	@Override
	public void setContext(ActionBeanContext abc) {
		this.abc = abc;
	}

	@Override
	public ActionBeanContext getContext() {
		return abc;
	}
	
	@Validate(converter = OneToManyTypeConverter.class)
	private List<String> vals;
	private ActionBeanContext abc;
}
