/*
 * An XML document type.
 * Localname: takeArticleList
 * Namespace: http://axis.makedon.by
 * Java type: by.makedon.axis.TakeArticleListDocument
 *
 * Automatically generated - do not modify.
 */
package by.makedon.axis.impl;
/**
 * A document containing one takeArticleList(@http://axis.makedon.by) element.
 *
 * This is a complex type.
 */
public class TakeArticleListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements by.makedon.axis.TakeArticleListDocument
{
    private static final long serialVersionUID = 1L;
    
    public TakeArticleListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAKEARTICLELIST$0 = 
        new javax.xml.namespace.QName("http://axis.makedon.by", "takeArticleList");
    
    
    /**
     * Gets the "takeArticleList" element
     */
    public by.makedon.axis.TakeArticleListDocument.TakeArticleList getTakeArticleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.TakeArticleListDocument.TakeArticleList target = null;
            target = (by.makedon.axis.TakeArticleListDocument.TakeArticleList)get_store().find_element_user(TAKEARTICLELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "takeArticleList" element
     */
    public void setTakeArticleList(by.makedon.axis.TakeArticleListDocument.TakeArticleList takeArticleList)
    {
        generatedSetterHelperImpl(takeArticleList, TAKEARTICLELIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "takeArticleList" element
     */
    public by.makedon.axis.TakeArticleListDocument.TakeArticleList addNewTakeArticleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.TakeArticleListDocument.TakeArticleList target = null;
            target = (by.makedon.axis.TakeArticleListDocument.TakeArticleList)get_store().add_element_user(TAKEARTICLELIST$0);
            return target;
        }
    }
    /**
     * An XML takeArticleList(@http://axis.makedon.by).
     *
     * This is a complex type.
     */
    public static class TakeArticleListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements by.makedon.axis.TakeArticleListDocument.TakeArticleList
    {
        private static final long serialVersionUID = 1L;
        
        public TakeArticleListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
