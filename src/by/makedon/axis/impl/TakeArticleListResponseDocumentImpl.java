/*
 * An XML document type.
 * Localname: takeArticleListResponse
 * Namespace: http://axis.makedon.by
 * Java type: by.makedon.axis.TakeArticleListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package by.makedon.axis.impl;
/**
 * A document containing one takeArticleListResponse(@http://axis.makedon.by) element.
 *
 * This is a complex type.
 */
public class TakeArticleListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements by.makedon.axis.TakeArticleListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public TakeArticleListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAKEARTICLELISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://axis.makedon.by", "takeArticleListResponse");
    
    
    /**
     * Gets the "takeArticleListResponse" element
     */
    public by.makedon.axis.TakeArticleListResponseDocument.TakeArticleListResponse getTakeArticleListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.TakeArticleListResponseDocument.TakeArticleListResponse target = null;
            target = (by.makedon.axis.TakeArticleListResponseDocument.TakeArticleListResponse)get_store().find_element_user(TAKEARTICLELISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "takeArticleListResponse" element
     */
    public void setTakeArticleListResponse(by.makedon.axis.TakeArticleListResponseDocument.TakeArticleListResponse takeArticleListResponse)
    {
        generatedSetterHelperImpl(takeArticleListResponse, TAKEARTICLELISTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "takeArticleListResponse" element
     */
    public by.makedon.axis.TakeArticleListResponseDocument.TakeArticleListResponse addNewTakeArticleListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.TakeArticleListResponseDocument.TakeArticleListResponse target = null;
            target = (by.makedon.axis.TakeArticleListResponseDocument.TakeArticleListResponse)get_store().add_element_user(TAKEARTICLELISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML takeArticleListResponse(@http://axis.makedon.by).
     *
     * This is a complex type.
     */
    public static class TakeArticleListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements by.makedon.axis.TakeArticleListResponseDocument.TakeArticleListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public TakeArticleListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://axis.makedon.by", "return");
        
        
        /**
         * Gets array of all "return" elements
         */
        public by.makedon.axis.xsd.Article[] getReturnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RETURN$0, targetList);
                by.makedon.axis.xsd.Article[] result = new by.makedon.axis.xsd.Article[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "return" element
         */
        public by.makedon.axis.xsd.Article getReturnArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                by.makedon.axis.xsd.Article target = null;
                target = (by.makedon.axis.xsd.Article)get_store().find_element_user(RETURN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "return" element
         */
        public boolean isNilReturnArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                by.makedon.axis.xsd.Article target = null;
                target = (by.makedon.axis.xsd.Article)get_store().find_element_user(RETURN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "return" element
         */
        public int sizeOfReturnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETURN$0);
            }
        }
        
        /**
         * Sets array of all "return" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setReturnArray(by.makedon.axis.xsd.Article[] xreturnArray)
        {
            check_orphaned();
            arraySetterHelper(xreturnArray, RETURN$0);
        }
        
        /**
         * Sets ith "return" element
         */
        public void setReturnArray(int i, by.makedon.axis.xsd.Article xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                by.makedon.axis.xsd.Article target = null;
                target = (by.makedon.axis.xsd.Article)get_store().find_element_user(RETURN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Nils the ith "return" element
         */
        public void setNilReturnArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                by.makedon.axis.xsd.Article target = null;
                target = (by.makedon.axis.xsd.Article)get_store().find_element_user(RETURN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "return" element
         */
        public by.makedon.axis.xsd.Article insertNewReturn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                by.makedon.axis.xsd.Article target = null;
                target = (by.makedon.axis.xsd.Article)get_store().insert_element_user(RETURN$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "return" element
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
         * Removes the ith "return" element
         */
        public void removeReturn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETURN$0, i);
            }
        }
    }
}
