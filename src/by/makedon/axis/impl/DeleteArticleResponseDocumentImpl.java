/*
 * An XML document type.
 * Localname: deleteArticleResponse
 * Namespace: http://axis.makedon.by
 * Java type: by.makedon.axis.DeleteArticleResponseDocument
 *
 * Automatically generated - do not modify.
 */
package by.makedon.axis.impl;
/**
 * A document containing one deleteArticleResponse(@http://axis.makedon.by) element.
 *
 * This is a complex type.
 */
public class DeleteArticleResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements by.makedon.axis.DeleteArticleResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeleteArticleResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEARTICLERESPONSE$0 = 
        new javax.xml.namespace.QName("http://axis.makedon.by", "deleteArticleResponse");
    
    
    /**
     * Gets the "deleteArticleResponse" element
     */
    public by.makedon.axis.DeleteArticleResponseDocument.DeleteArticleResponse getDeleteArticleResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.DeleteArticleResponseDocument.DeleteArticleResponse target = null;
            target = (by.makedon.axis.DeleteArticleResponseDocument.DeleteArticleResponse)get_store().find_element_user(DELETEARTICLERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "deleteArticleResponse" element
     */
    public void setDeleteArticleResponse(by.makedon.axis.DeleteArticleResponseDocument.DeleteArticleResponse deleteArticleResponse)
    {
        generatedSetterHelperImpl(deleteArticleResponse, DELETEARTICLERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "deleteArticleResponse" element
     */
    public by.makedon.axis.DeleteArticleResponseDocument.DeleteArticleResponse addNewDeleteArticleResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.DeleteArticleResponseDocument.DeleteArticleResponse target = null;
            target = (by.makedon.axis.DeleteArticleResponseDocument.DeleteArticleResponse)get_store().add_element_user(DELETEARTICLERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML deleteArticleResponse(@http://axis.makedon.by).
     *
     * This is a complex type.
     */
    public static class DeleteArticleResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements by.makedon.axis.DeleteArticleResponseDocument.DeleteArticleResponse
    {
        private static final long serialVersionUID = 1L;
        
        public DeleteArticleResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
