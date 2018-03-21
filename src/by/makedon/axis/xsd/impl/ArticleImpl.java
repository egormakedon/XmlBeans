/*
 * XML Type:  Article
 * Namespace: http://axis.makedon.by/xsd
 * Java type: by.makedon.axis.xsd.Article
 *
 * Automatically generated - do not modify.
 */
package by.makedon.axis.xsd.impl;
/**
 * An XML Article(@http://axis.makedon.by/xsd).
 *
 * This is a complex type.
 */
public class ArticleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements by.makedon.axis.xsd.Article
{
    private static final long serialVersionUID = 1L;
    
    public ArticleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARTICLEID$0 = 
        new javax.xml.namespace.QName("http://axis.makedon.by/xsd", "articleId");
    private static final javax.xml.namespace.QName AUTHOR$2 = 
        new javax.xml.namespace.QName("http://axis.makedon.by/xsd", "author");
    private static final javax.xml.namespace.QName BODY$4 = 
        new javax.xml.namespace.QName("http://axis.makedon.by/xsd", "body");
    private static final javax.xml.namespace.QName DATE$6 = 
        new javax.xml.namespace.QName("http://axis.makedon.by/xsd", "date");
    private static final javax.xml.namespace.QName IMAGE$8 = 
        new javax.xml.namespace.QName("http://axis.makedon.by/xsd", "image");
    private static final javax.xml.namespace.QName TITLE$10 = 
        new javax.xml.namespace.QName("http://axis.makedon.by/xsd", "title");
    
    
    /**
     * Gets the "articleId" element
     */
    public int getArticleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARTICLEID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "articleId" element
     */
    public org.apache.xmlbeans.XmlInt xgetArticleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ARTICLEID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "articleId" element
     */
    public boolean isSetArticleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARTICLEID$0) != 0;
        }
    }
    
    /**
     * Sets the "articleId" element
     */
    public void setArticleId(int articleId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARTICLEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARTICLEID$0);
            }
            target.setIntValue(articleId);
        }
    }
    
    /**
     * Sets (as xml) the "articleId" element
     */
    public void xsetArticleId(org.apache.xmlbeans.XmlInt articleId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ARTICLEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ARTICLEID$0);
            }
            target.set(articleId);
        }
    }
    
    /**
     * Unsets the "articleId" element
     */
    public void unsetArticleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARTICLEID$0, 0);
        }
    }
    
    /**
     * Gets the "author" element
     */
    public by.makedon.axis.xsd.Author getAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.xsd.Author target = null;
            target = (by.makedon.axis.xsd.Author)get_store().find_element_user(AUTHOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "author" element
     */
    public boolean isNilAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.xsd.Author target = null;
            target = (by.makedon.axis.xsd.Author)get_store().find_element_user(AUTHOR$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "author" element
     */
    public boolean isSetAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHOR$2) != 0;
        }
    }
    
    /**
     * Sets the "author" element
     */
    public void setAuthor(by.makedon.axis.xsd.Author author)
    {
        generatedSetterHelperImpl(author, AUTHOR$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "author" element
     */
    public by.makedon.axis.xsd.Author addNewAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.xsd.Author target = null;
            target = (by.makedon.axis.xsd.Author)get_store().add_element_user(AUTHOR$2);
            return target;
        }
    }
    
    /**
     * Nils the "author" element
     */
    public void setNilAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.xsd.Author target = null;
            target = (by.makedon.axis.xsd.Author)get_store().find_element_user(AUTHOR$2, 0);
            if (target == null)
            {
                target = (by.makedon.axis.xsd.Author)get_store().add_element_user(AUTHOR$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "author" element
     */
    public void unsetAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHOR$2, 0);
        }
    }
    
    /**
     * Gets the "body" element
     */
    public java.lang.String getBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BODY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "body" element
     */
    public org.apache.xmlbeans.XmlString xgetBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BODY$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "body" element
     */
    public boolean isNilBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BODY$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "body" element
     */
    public boolean isSetBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BODY$4) != 0;
        }
    }
    
    /**
     * Sets the "body" element
     */
    public void setBody(java.lang.String body)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BODY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BODY$4);
            }
            target.setStringValue(body);
        }
    }
    
    /**
     * Sets (as xml) the "body" element
     */
    public void xsetBody(org.apache.xmlbeans.XmlString body)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BODY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BODY$4);
            }
            target.set(body);
        }
    }
    
    /**
     * Nils the "body" element
     */
    public void setNilBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BODY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BODY$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "body" element
     */
    public void unsetBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BODY$4, 0);
        }
    }
    
    /**
     * Gets the "date" element
     */
    public java.util.Calendar getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "date" element
     */
    public org.apache.xmlbeans.XmlDate xgetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATE$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "date" element
     */
    public boolean isNilDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATE$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "date" element
     */
    public boolean isSetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATE$6) != 0;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(java.util.Calendar date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATE$6);
            }
            target.setCalendarValue(date);
        }
    }
    
    /**
     * Sets (as xml) the "date" element
     */
    public void xsetDate(org.apache.xmlbeans.XmlDate date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATE$6);
            }
            target.set(date);
        }
    }
    
    /**
     * Nils the "date" element
     */
    public void setNilDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATE$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "date" element
     */
    public void unsetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATE$6, 0);
        }
    }
    
    /**
     * Gets the "image" element
     */
    public by.makedon.axis.xsd.Image getImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.xsd.Image target = null;
            target = (by.makedon.axis.xsd.Image)get_store().find_element_user(IMAGE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "image" element
     */
    public boolean isNilImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.xsd.Image target = null;
            target = (by.makedon.axis.xsd.Image)get_store().find_element_user(IMAGE$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "image" element
     */
    public boolean isSetImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMAGE$8) != 0;
        }
    }
    
    /**
     * Sets the "image" element
     */
    public void setImage(by.makedon.axis.xsd.Image image)
    {
        generatedSetterHelperImpl(image, IMAGE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "image" element
     */
    public by.makedon.axis.xsd.Image addNewImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.xsd.Image target = null;
            target = (by.makedon.axis.xsd.Image)get_store().add_element_user(IMAGE$8);
            return target;
        }
    }
    
    /**
     * Nils the "image" element
     */
    public void setNilImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            by.makedon.axis.xsd.Image target = null;
            target = (by.makedon.axis.xsd.Image)get_store().find_element_user(IMAGE$8, 0);
            if (target == null)
            {
                target = (by.makedon.axis.xsd.Image)get_store().add_element_user(IMAGE$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "image" element
     */
    public void unsetImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMAGE$8, 0);
        }
    }
    
    /**
     * Gets the "title" element
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" element
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "title" element
     */
    public boolean isNilTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "title" element
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLE$10) != 0;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$10);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" element
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$10);
            }
            target.set(title);
        }
    }
    
    /**
     * Nils the "title" element
     */
    public void setNilTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "title" element
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLE$10, 0);
        }
    }
}
