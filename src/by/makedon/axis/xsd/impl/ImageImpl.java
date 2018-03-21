/*
 * XML Type:  Image
 * Namespace: http://axis.makedon.by/xsd
 * Java type: by.makedon.axis.xsd.Image
 *
 * Automatically generated - do not modify.
 */
package by.makedon.axis.xsd.impl;
/**
 * An XML Image(@http://axis.makedon.by/xsd).
 *
 * This is a complex type.
 */
public class ImageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements by.makedon.axis.xsd.Image
{
    private static final long serialVersionUID = 1L;
    
    public ImageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMAGEID$0 = 
        new javax.xml.namespace.QName("http://axis.makedon.by/xsd", "imageId");
    private static final javax.xml.namespace.QName PATH$2 = 
        new javax.xml.namespace.QName("http://axis.makedon.by/xsd", "path");
    
    
    /**
     * Gets the "imageId" element
     */
    public int getImageId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMAGEID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "imageId" element
     */
    public org.apache.xmlbeans.XmlInt xgetImageId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IMAGEID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "imageId" element
     */
    public boolean isSetImageId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMAGEID$0) != 0;
        }
    }
    
    /**
     * Sets the "imageId" element
     */
    public void setImageId(int imageId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMAGEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMAGEID$0);
            }
            target.setIntValue(imageId);
        }
    }
    
    /**
     * Sets (as xml) the "imageId" element
     */
    public void xsetImageId(org.apache.xmlbeans.XmlInt imageId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IMAGEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IMAGEID$0);
            }
            target.set(imageId);
        }
    }
    
    /**
     * Unsets the "imageId" element
     */
    public void unsetImageId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMAGEID$0, 0);
        }
    }
    
    /**
     * Gets the "path" element
     */
    public java.lang.String getPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATH$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "path" element
     */
    public org.apache.xmlbeans.XmlString xgetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATH$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "path" element
     */
    public boolean isNilPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATH$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "path" element
     */
    public boolean isSetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATH$2) != 0;
        }
    }
    
    /**
     * Sets the "path" element
     */
    public void setPath(java.lang.String path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATH$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATH$2);
            }
            target.setStringValue(path);
        }
    }
    
    /**
     * Sets (as xml) the "path" element
     */
    public void xsetPath(org.apache.xmlbeans.XmlString path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATH$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PATH$2);
            }
            target.set(path);
        }
    }
    
    /**
     * Nils the "path" element
     */
    public void setNilPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATH$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PATH$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "path" element
     */
    public void unsetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATH$2, 0);
        }
    }
}
