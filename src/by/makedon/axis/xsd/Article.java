/*
 * XML Type:  Article
 * Namespace: http://axis.makedon.by/xsd
 * Java type: by.makedon.axis.xsd.Article
 *
 * Automatically generated - do not modify.
 */
package by.makedon.axis.xsd;


/**
 * An XML Article(@http://axis.makedon.by/xsd).
 *
 * This is a complex type.
 */
public interface Article extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Article.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD40CCDBFC80988009E6708CFEBF50A3E").resolveHandle("article12f8type");
    
    /**
     * Gets the "articleId" element
     */
    int getArticleId();
    
    /**
     * Gets (as xml) the "articleId" element
     */
    org.apache.xmlbeans.XmlInt xgetArticleId();
    
    /**
     * True if has "articleId" element
     */
    boolean isSetArticleId();
    
    /**
     * Sets the "articleId" element
     */
    void setArticleId(int articleId);
    
    /**
     * Sets (as xml) the "articleId" element
     */
    void xsetArticleId(org.apache.xmlbeans.XmlInt articleId);
    
    /**
     * Unsets the "articleId" element
     */
    void unsetArticleId();
    
    /**
     * Gets the "author" element
     */
    by.makedon.axis.xsd.Author getAuthor();
    
    /**
     * Tests for nil "author" element
     */
    boolean isNilAuthor();
    
    /**
     * True if has "author" element
     */
    boolean isSetAuthor();
    
    /**
     * Sets the "author" element
     */
    void setAuthor(by.makedon.axis.xsd.Author author);
    
    /**
     * Appends and returns a new empty "author" element
     */
    by.makedon.axis.xsd.Author addNewAuthor();
    
    /**
     * Nils the "author" element
     */
    void setNilAuthor();
    
    /**
     * Unsets the "author" element
     */
    void unsetAuthor();
    
    /**
     * Gets the "body" element
     */
    java.lang.String getBody();
    
    /**
     * Gets (as xml) the "body" element
     */
    org.apache.xmlbeans.XmlString xgetBody();
    
    /**
     * Tests for nil "body" element
     */
    boolean isNilBody();
    
    /**
     * True if has "body" element
     */
    boolean isSetBody();
    
    /**
     * Sets the "body" element
     */
    void setBody(java.lang.String body);
    
    /**
     * Sets (as xml) the "body" element
     */
    void xsetBody(org.apache.xmlbeans.XmlString body);
    
    /**
     * Nils the "body" element
     */
    void setNilBody();
    
    /**
     * Unsets the "body" element
     */
    void unsetBody();
    
    /**
     * Gets the "date" element
     */
    java.util.Calendar getDate();
    
    /**
     * Gets (as xml) the "date" element
     */
    org.apache.xmlbeans.XmlDate xgetDate();
    
    /**
     * Tests for nil "date" element
     */
    boolean isNilDate();
    
    /**
     * True if has "date" element
     */
    boolean isSetDate();
    
    /**
     * Sets the "date" element
     */
    void setDate(java.util.Calendar date);
    
    /**
     * Sets (as xml) the "date" element
     */
    void xsetDate(org.apache.xmlbeans.XmlDate date);
    
    /**
     * Nils the "date" element
     */
    void setNilDate();
    
    /**
     * Unsets the "date" element
     */
    void unsetDate();
    
    /**
     * Gets the "image" element
     */
    by.makedon.axis.xsd.Image getImage();
    
    /**
     * Tests for nil "image" element
     */
    boolean isNilImage();
    
    /**
     * True if has "image" element
     */
    boolean isSetImage();
    
    /**
     * Sets the "image" element
     */
    void setImage(by.makedon.axis.xsd.Image image);
    
    /**
     * Appends and returns a new empty "image" element
     */
    by.makedon.axis.xsd.Image addNewImage();
    
    /**
     * Nils the "image" element
     */
    void setNilImage();
    
    /**
     * Unsets the "image" element
     */
    void unsetImage();
    
    /**
     * Gets the "title" element
     */
    java.lang.String getTitle();
    
    /**
     * Gets (as xml) the "title" element
     */
    org.apache.xmlbeans.XmlString xgetTitle();
    
    /**
     * Tests for nil "title" element
     */
    boolean isNilTitle();
    
    /**
     * True if has "title" element
     */
    boolean isSetTitle();
    
    /**
     * Sets the "title" element
     */
    void setTitle(java.lang.String title);
    
    /**
     * Sets (as xml) the "title" element
     */
    void xsetTitle(org.apache.xmlbeans.XmlString title);
    
    /**
     * Nils the "title" element
     */
    void setNilTitle();
    
    /**
     * Unsets the "title" element
     */
    void unsetTitle();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static by.makedon.axis.xsd.Article newInstance() {
          return (by.makedon.axis.xsd.Article) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static by.makedon.axis.xsd.Article newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (by.makedon.axis.xsd.Article) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static by.makedon.axis.xsd.Article parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.xsd.Article) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static by.makedon.axis.xsd.Article parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.xsd.Article) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static by.makedon.axis.xsd.Article parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.xsd.Article) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static by.makedon.axis.xsd.Article parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.xsd.Article) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static by.makedon.axis.xsd.Article parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.xsd.Article) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static by.makedon.axis.xsd.Article parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.xsd.Article) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static by.makedon.axis.xsd.Article parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.xsd.Article) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static by.makedon.axis.xsd.Article parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.xsd.Article) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static by.makedon.axis.xsd.Article parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.xsd.Article) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static by.makedon.axis.xsd.Article parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.xsd.Article) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static by.makedon.axis.xsd.Article parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.xsd.Article) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static by.makedon.axis.xsd.Article parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.xsd.Article) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static by.makedon.axis.xsd.Article parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.xsd.Article) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static by.makedon.axis.xsd.Article parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.xsd.Article) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static by.makedon.axis.xsd.Article parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (by.makedon.axis.xsd.Article) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static by.makedon.axis.xsd.Article parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (by.makedon.axis.xsd.Article) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
