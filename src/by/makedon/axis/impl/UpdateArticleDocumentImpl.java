/*
 * An XML document type.
 * Localname: updateArticle
 * Namespace: http://axis.makedon.by
 * Java type: by.makedon.axis.UpdateArticleDocument
 *
 * Automatically generated - do not modify.
 */
package by.makedon.axis.impl;
/**
 * A document containing one updateArticle(@http://axis.makedon.by) element.
 *
 * This is a complex type.
 */
public class UpdateArticleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements by.makedon.axis.UpdateArticleDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateArticleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEARTICLE$0 = 
        new javax.xml.namespace.QName("http://axis.makedon.by", "updateArticle");
    
    
    /**
     * Gets the "updateArticle" element
     */
    public by.makedon.axis.UpdateArticleDocument.UpdateArticle getUpdateArticle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.UpdateArticleDocument.UpdateArticle target = null;
            target = (by.makedon.axis.UpdateArticleDocument.UpdateArticle)get_store().find_element_user(UPDATEARTICLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "updateArticle" element
     */
    public void setUpdateArticle(by.makedon.axis.UpdateArticleDocument.UpdateArticle updateArticle)
    {
        generatedSetterHelperImpl(updateArticle, UPDATEARTICLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "updateArticle" element
     */
    public by.makedon.axis.UpdateArticleDocument.UpdateArticle addNewUpdateArticle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.UpdateArticleDocument.UpdateArticle target = null;
            target = (by.makedon.axis.UpdateArticleDocument.UpdateArticle)get_store().add_element_user(UPDATEARTICLE$0);
            return target;
        }
    }
    /**
     * An XML updateArticle(@http://axis.makedon.by).
     *
     * This is a complex type.
     */
    public static class UpdateArticleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements by.makedon.axis.UpdateArticleDocument.UpdateArticle
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateArticleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ARGS0$0 = 
            new javax.xml.namespace.QName("http://axis.makedon.by", "args0");
        
        
        /**
         * Gets the "args0" element
         */
        public by.makedon.axis.xsd.Article getArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                by.makedon.axis.xsd.Article target = null;
                target = (by.makedon.axis.xsd.Article)get_store().find_element_user(ARGS0$0, 0);
                if (target == null)
                {
                    return null;
                }
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
                by.makedon.axis.xsd.Article target = null;
                target = (by.makedon.axis.xsd.Article)get_store().find_element_user(ARGS0$0, 0);
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
        public void setArgs0(by.makedon.axis.xsd.Article args0)
        {
            generatedSetterHelperImpl(args0, ARGS0$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "args0" element
         */
        public by.makedon.axis.xsd.Article addNewArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                by.makedon.axis.xsd.Article target = null;
                target = (by.makedon.axis.xsd.Article)get_store().add_element_user(ARGS0$0);
                return target;
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
                by.makedon.axis.xsd.Article target = null;
                target = (by.makedon.axis.xsd.Article)get_store().find_element_user(ARGS0$0, 0);
                if (target == null)
                {
                    target = (by.makedon.axis.xsd.Article)get_store().add_element_user(ARGS0$0);
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
