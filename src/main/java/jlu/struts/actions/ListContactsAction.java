package jlu.struts.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.brainfuse.contact.dataaccess.BasicAccess;
import com.brainfuse.contact.dataaccess.IoConstansts;
import com.branfuse.contact.models.Contact;

public class ListContactsAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		BasicAccess<Contact> contactDao = (BasicAccess<Contact>) getServlet().getServletContext().getAttribute(IoConstansts.BASIC_ACCESS_CONTACT_NAME);
		request.setAttribute("contacts", contactDao.find());
		return mapping.findForward("view");

	}
}
