/*
 * An XML document type.
 * Localname: takeArticle
 * Namespace: http://axis.makedon.by
 * Java type: by.makedon.axis.TakeArticleDocument
 *
 * Automatically generated - do not modify.
 */
package by.makedon.axis.impl;
/**
 * A document containing one takeArticle(@http://axis.makedon.by) element.
 *
 * This is a complex type.
 */
public class TakeArticleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements by.makedon.axis.TakeArticleDocument
{
    private static final long serialVersionUID = 1L;
    
    public TakeArticleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAKEARTICLE$0 = 
        new javax.xml.namespace.QName("http://axis.makedon.by", "takeArticle");
    
    
    /**
     * Gets the "takeArticle" element
     */
    public by.makedon.axis.TakeArticleDocument.TakeArticle getTakeArticle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.TakeArticleDocument.TakeArticle target = null;
            target = (by.makedon.axis.TakeArticleDocument.TakeArticle)get_store().find_element_user(TAKEARTICLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "takeArticle" element
     */
    public void setTakeArticle(by.makedon.axis.TakeArticleDocument.TakeArticle takeArticle)
    {
        generatedSetterHelperImpl(takeArticle, TAKEARTICLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "takeArticle" element
     */
    public by.makedon.axis.TakeArticleDocument.TakeArticle addNewTakeArticle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.TakeArticleDocument.TakeArticle target = null;
            target = (by.makedon.axis.TakeArticleDocument.TakeArticle)get_store().add_element_user(TAKEARTICLE$0);
            return target;
        }
    }
    /**
     * An XML takeArticle(@http://axis.makedon.by).
     *
     * This is a complex type.
     */
    public static class TakeArticleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements by.makedon.axis.TakeArticleDocument.TakeArticle
    {
        private static final long serialVersionUID = 1L;
        
        public TakeArticleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ARGS0$0 = 
            new javax.xml.namespace.QName("http://axis.makedon.by", "args0");
        
        
        /**
         * Gets the "args0" element
         */
        public java.lang.String getArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARGS0$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "args0" element
         */
        public org.apache.xmlbeans.XmlString xgetArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARGS0$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "args0" element
         */
        public boolean isNilArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARGS0$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "args0" element
         */
        public boolean isSetArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ARGS0$0) != 0;
            }
        }
        
        /**
         * Sets the "args0" element
         */
        public void setArgs0(java.lang.String args0)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARGS0$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARGS0$0);
                }
                target.setStringValue(args0);
            }
        }
        
        /**
         * Sets (as xml) the "args0" element
         */
        public void xsetArgs0(org.apache.xmlbeans.XmlString args0)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARGS0$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARGS0$0);
                }
                target.set(args0);
            }
        }
        
        /**
         * Nils the "args0" element
         */
        public void setNilArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARGS0$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARGS0$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "args0" element
         */
        public void unsetArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ARGS0$0, 0);
            }
        }
    }
}
