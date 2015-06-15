package jlu.struts.actions;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.branfuse.contact.models.Contact;

public class ListContactsAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		List<Contact> contacts = new ArrayList<>();
		Contact c = new Contact();
		c.setPersonName("mock");
		contacts.add(c);
		request.setAttribute("contacts", contacts);
		return mapping.findForward("view");

	}
}
