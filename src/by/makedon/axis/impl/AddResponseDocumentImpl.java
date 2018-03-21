/*
 * An XML document type.
 * Localname: addResponse
 * Namespace: http://axis.makedon.by
 * Java type: by.makedon.axis.AddResponseDocument
 *
 * Automatically generated - do not modify.
 */
package by.makedon.axis.impl;
/**
 * A document containing one addResponse(@http://axis.makedon.by) element.
 *
 * This is a complex type.
 */
public class AddResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements by.makedon.axis.AddResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://axis.makedon.by", "addResponse");
    
    
    /**
     * Gets the "addResponse" element
     */
    public by.makedon.axis.AddResponseDocument.AddResponse getAddResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.AddResponseDocument.AddResponse target = null;
            target = (by.makedon.axis.AddResponseDocument.AddResponse)get_store().find_element_user(ADDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "addResponse" element
     */
    public void setAddResponse(by.makedon.axis.AddResponseDocument.AddResponse addResponse)
    {
        generatedSetterHelperImpl(addResponse, ADDRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "addResponse" element
     */
    public by.makedon.axis.AddResponseDocument.AddResponse addNewAddResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.AddResponseDocument.AddResponse target = null;
            target = (by.makedon.axis.AddResponseDocument.AddResponse)get_store().add_element_user(ADDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML addResponse(@http://axis.makedon.by).
     *
     * This is a complex type.
     */
    public static class AddResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements by.makedon.axis.AddResponseDocument.AddResponse
    {
        private static final long serialVersionUID = 1L;
        
        public AddResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://axis.makedon.by", "return");
        
        
        /**
         * Gets the "return" element
         */
        public java.lang.String getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "return" element
         */
        public org.apache.xmlbeans.XmlString xgetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "return" element
         */
        public boolean isNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "return" element
         */
        public boolean isSetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETURN$0) != 0;
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(java.lang.String xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETURN$0);
                }
                target.setStringValue(xreturn);
            }
        }
        
        /**
         * Sets (as xml) the "return" element
         */
        public void xsetReturn(org.apache.xmlbeans.XmlString xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Nils the "return" element
         */
        public void setNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "return" element
         */
        public void unsetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETURN$0, 0);
            }
        }
    }
}
