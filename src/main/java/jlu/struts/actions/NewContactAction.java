package jlu.struts.actions;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class NewContactAction extends Action {
@Override
public ActionForward execute(ActionMapping mapping, ActionForm form,
		ServletRequest request, ServletResponse response) throws Exception {
	
	String personName = form.
	
	return mapping.findForward("success");
}
}
