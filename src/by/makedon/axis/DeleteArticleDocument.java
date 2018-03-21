/*
 * An XML document type.
 * Localname: deleteArticle
 * Namespace: http://axis.makedon.by
 * Java type: by.makedon.axis.DeleteArticleDocument
 *
 * Automatically generated - do not modify.
 */
package by.makedon.axis;


/**
 * A document containing one deleteArticle(@http://axis.makedon.by) element.
 *
 * This is a complex type.
 */
public interface DeleteArticleDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeleteArticleDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD40CCDBFC80988009E6708CFEBF50A3E").resolveHandle("deletearticlecf79doctype");
    
    /**
     * Gets the "deleteArticle" element
     */
    by.makedon.axis.DeleteArticleDocument.DeleteArticle getDeleteArticle();
    
    /**
     * Sets the "deleteArticle" element
     */
    void setDeleteArticle(by.makedon.axis.DeleteArticleDocument.DeleteArticle deleteArticle);
    
    /**
     * Appends and returns a new empty "deleteArticle" element
     */
    by.makedon.axis.DeleteArticleDocument.DeleteArticle addNewDeleteArticle();
    
    /**
     * An XML deleteArticle(@http://axis.makedon.by).
     *
     * This is a complex type.
     */
    public interface DeleteArticle extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeleteArticle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD40CCDBFC80988009E6708CFEBF50A3E").resolveHandle("deletearticlec862elemtype");
        
        /**
         * Gets the "args0" element
         */
        by.makedon.axis.xsd.Article getArgs0();
        
        /**
         * Tests for nil "args0" element
         */
        boolean isNilArgs0();
        
        /**
         * True if has "args0" element
         */
        boolean isSetArgs0();
        
        /**
         * Sets the "args0" element
         */
        void setArgs0(by.makedon.axis.xsd.Article args0);
        
        /**
         * Appends and returns a new empty "args0" element
         */
        by.makedon.axis.xsd.Article addNewArgs0();
        
        /**
         * Nils the "args0" element
         */
        void setNilArgs0();
        
        /**
         * Unsets the "args0" element
         */
        void unsetArgs0();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static by.makedon.axis.DeleteArticleDocument.DeleteArticle newInstance() {
              return (by.makedon.axis.DeleteArticleDocument.DeleteArticle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static by.makedon.axis.DeleteArticleDocument.DeleteArticle newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (by.makedon.axis.DeleteArticleDocument.DeleteArticle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static by.makedon.axis.DeleteArticleDocument newInstance() {
          return (by.makedon.axis.DeleteArticleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static by.makedon.axis.DeleteArticleDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (by.makedon.axis.DeleteArticleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static by.makedon.axis.DeleteArticleDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.DeleteArticleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static by.makedon.axis.DeleteArticleDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.DeleteArticleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static by.makedon.axis.DeleteArticleDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.DeleteArticleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static by.makedon.axis.DeleteArticleDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.DeleteArticleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static by.makedon.axis.DeleteArticleDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.DeleteArticleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static by.makedon.axis.DeleteArticleDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.DeleteArticleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static by.makedon.axis.DeleteArticleDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.DeleteArticleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static by.makedon.axis.DeleteArticleDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.DeleteArticleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static by.makedon.axis.DeleteArticleDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.DeleteArticleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static by.makedon.axis.DeleteArticleDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.DeleteArticleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static by.makedon.axis.DeleteArticleDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.DeleteArticleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static by.makedon.axis.DeleteArticleDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.DeleteArticleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static by.makedon.axis.DeleteArticleDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.DeleteArticleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static by.makedon.axis.DeleteArticleDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.DeleteArticleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static by.makedon.axis.DeleteArticleDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (by.makedon.axis.DeleteArticleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static by.makedon.axis.DeleteArticleDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (by.makedon.axis.DeleteArticleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
