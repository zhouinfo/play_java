package com.thoughtworks.davenkin.servlet;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class ExplorerRequestAttributeListener implements ServletRequestAttributeListener
{
    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent)
    {
        System.out.println(String.format(" Request Attribute added: %s = %s",servletRequestAttributeEvent.getName(), servletRequestAttributeEvent.getValue().toString()));
    }

    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
