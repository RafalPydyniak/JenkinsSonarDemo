package com.pydyniak.demo.web.portlet;

import com.pydyniak.demo.model.Employee;
import com.pydyniak.demo.service.EmployeeLocalService;
import com.pydyniak.demo.web.constants.DemoWebPortletKeys;

import java.io.IOException;
import java.util.List;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * Just a dummy class (badly written) for demo purposes
 * @author rafal.pydyniak
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=DemoWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + DemoWebPortletKeys.demo_web,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class DemoWebPortlet extends MVCPortlet {
	@Reference
	private EmployeeLocalService employee_local_service;
	/**
	 * Just a dummy method (badly written) for demo purposes
	 * @return
	 */
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) {
		List<Employee> findEmployeesWithNullLastName = employee_local_service.findEmployeesWithNullLastName();
	}
}