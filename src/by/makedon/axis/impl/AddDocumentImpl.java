/*
 * An XML document type.
 * Localname: add
 * Namespace: http://axis.makedon.by
 * Java type: by.makedon.axis.AddDocument
 *
 * Automatically generated - do not modify.
 */
package by.makedon.axis.impl;
/**
 * A document containing one add(@http://axis.makedon.by) element.
 *
 * This is a complex type.
 */
public class AddDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements by.makedon.axis.AddDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADD$0 = 
        new javax.xml.namespace.QName("http://axis.makedon.by", "add");
    
    
    /**
     * Gets the "add" element
     */
    public by.makedon.axis.AddDocument.Add getAdd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.AddDocument.Add target = null;
            target = (by.makedon.axis.AddDocument.Add)get_store().find_element_user(ADD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "add" element
     */
    public void setAdd(by.makedon.axis.AddDocument.Add add)
    {
        generatedSetterHelperImpl(add, ADD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "add" element
     */
    public by.makedon.axis.AddDocument.Add addNewAdd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.AddDocument.Add target = null;
            target = (by.makedon.axis.AddDocument.Add)get_store().add_element_user(ADD$0);
            return target;
        }
    }
    /**
     * An XML add(@http://axis.makedon.by).
     *
     * This is a complex type.
     */
    public static class AddImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements by.makedon.axis.AddDocument.Add
    {
        private static final long serialVersionUID = 1L;
        
        public AddImpl(org.apache.xmlbeans.SchemaType sType)
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
