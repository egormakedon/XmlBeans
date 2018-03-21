/*
 * An XML document type.
 * Localname: takeArticleResponse
 * Namespace: http://axis.makedon.by
 * Java type: by.makedon.axis.TakeArticleResponseDocument
 *
 * Automatically generated - do not modify.
 */
package by.makedon.axis.impl;
/**
 * A document containing one takeArticleResponse(@http://axis.makedon.by) element.
 *
 * This is a complex type.
 */
public class TakeArticleResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements by.makedon.axis.TakeArticleResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public TakeArticleResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAKEARTICLERESPONSE$0 = 
        new javax.xml.namespace.QName("http://axis.makedon.by", "takeArticleResponse");
    
    
    /**
     * Gets the "takeArticleResponse" element
     */
    public by.makedon.axis.TakeArticleResponseDocument.TakeArticleResponse getTakeArticleResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.TakeArticleResponseDocument.TakeArticleResponse target = null;
            target = (by.makedon.axis.TakeArticleResponseDocument.TakeArticleResponse)get_store().find_element_user(TAKEARTICLERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "takeArticleResponse" element
     */
    public void setTakeArticleResponse(by.makedon.axis.TakeArticleResponseDocument.TakeArticleResponse takeArticleResponse)
    {
        generatedSetterHelperImpl(takeArticleResponse, TAKEARTICLERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "takeArticleResponse" element
     */
    public by.makedon.axis.TakeArticleResponseDocument.TakeArticleResponse addNewTakeArticleResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.TakeArticleResponseDocument.TakeArticleResponse target = null;
            target = (by.makedon.axis.TakeArticleResponseDocument.TakeArticleResponse)get_store().add_element_user(TAKEARTICLERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML takeArticleResponse(@http://axis.makedon.by).
     *
     * This is a complex type.
     */
    public static class TakeArticleResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements by.makedon.axis.TakeArticleResponseDocument.TakeArticleResponse
    {
        private static final long serialVersionUID = 1L;
        
        public TakeArticleResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://axis.makedon.by", "return");
        
        
        /**
         * Gets the "return" element
         */
        public by.makedon.axis.xsd.Article getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                by.makedon.axis.xsd.Article target = null;
                target = (by.makedon.axis.xsd.Article)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
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
                by.makedon.axis.xsd.Article target = null;
                target = (by.makedon.axis.xsd.Article)get_store().find_element_user(RETURN$0, 0);
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
        public void setReturn(by.makedon.axis.xsd.Article xreturn)
        {
            generatedSetterHelperImpl(xreturn, RETURN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public by.makedon.axis.xsd.Article addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                by.makedon.axis.xsd.Article target = null;
                target = (by.makedon.axis.xsd.Article)get_store().add_element_user(RETURN$0);
                return target;
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
                by.makedon.axis.xsd.Article target = null;
                target = (by.makedon.axis.xsd.Article)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (by.makedon.axis.xsd.Article)get_store().add_element_user(RETURN$0);
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
