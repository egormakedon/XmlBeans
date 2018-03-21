/*
 * An XML document type.
 * Localname: deleteArticleResponse
 * Namespace: http://axis.makedon.by
 * Java type: by.makedon.axis.DeleteArticleResponseDocument
 *
 * Automatically generated - do not modify.
 */
package by.makedon.axis;


/**
 * A document containing one deleteArticleResponse(@http://axis.makedon.by) element.
 *
 * This is a complex type.
 */
public interface DeleteArticleResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeleteArticleResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD40CCDBFC80988009E6708CFEBF50A3E").resolveHandle("deletearticleresponsecbf8doctype");
    
    /**
     * Gets the "deleteArticleResponse" element
     */
    by.makedon.axis.DeleteArticleResponseDocument.DeleteArticleResponse getDeleteArticleResponse();
    
    /**
     * Sets the "deleteArticleResponse" element
     */
    void setDeleteArticleResponse(by.makedon.axis.DeleteArticleResponseDocument.DeleteArticleResponse deleteArticleResponse);
    
    /**
     * Appends and returns a new empty "deleteArticleResponse" element
     */
    by.makedon.axis.DeleteArticleResponseDocument.DeleteArticleResponse addNewDeleteArticleResponse();
    
    /**
     * An XML deleteArticleResponse(@http://axis.makedon.by).
     *
     * This is a complex type.
     */
    public interface DeleteArticleResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeleteArticleResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD40CCDBFC80988009E6708CFEBF50A3E").resolveHandle("deletearticleresponseec60elemtype");
        
        /**
         * Gets the "return" element
         */
        java.lang.String getReturn();
        
        /**
         * Gets (as xml) the "return" element
         */
        org.apache.xmlbeans.XmlString xgetReturn();
        
        /**
         * Tests for nil "return" element
         */
        boolean isNilReturn();
        
        /**
         * True if has "return" element
         */
        boolean isSetReturn();
        
        /**
         * Sets the "return" element
         */
        void setReturn(java.lang.String xreturn);
        
        /**
         * Sets (as xml) the "return" element
         */
        void xsetReturn(org.apache.xmlbeans.XmlString xreturn);
        
        /**
         * Nils the "return" element
         */
        void setNilReturn();
        
        /**
         * Unsets the "return" element
         */
        void unsetReturn();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static by.makedon.axis.DeleteArticleResponseDocument.DeleteArticleResponse newInstance() {
              return (by.makedon.axis.DeleteArticleResponseDocument.DeleteArticleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static by.makedon.axis.DeleteArticleResponseDocument.DeleteArticleResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (by.makedon.axis.DeleteArticleResponseDocument.DeleteArticleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static by.makedon.axis.DeleteArticleResponseDocument newInstance() {
          return (by.makedon.axis.DeleteArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static by.makedon.axis.DeleteArticleResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (by.makedon.axis.DeleteArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static by.makedon.axis.DeleteArticleResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.DeleteArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static by.makedon.axis.DeleteArticleResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.DeleteArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static by.makedon.axis.DeleteArticleResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.DeleteArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static by.makedon.axis.DeleteArticleResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.DeleteArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static by.makedon.axis.DeleteArticleResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.DeleteArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static by.makedon.axis.DeleteArticleResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.DeleteArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static by.makedon.axis.DeleteArticleResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.DeleteArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static by.makedon.axis.DeleteArticleResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.DeleteArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static by.makedon.axis.DeleteArticleResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.DeleteArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static by.makedon.axis.DeleteArticleResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.DeleteArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static by.makedon.axis.DeleteArticleResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.DeleteArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static by.makedon.axis.DeleteArticleResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.DeleteArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static by.makedon.axis.DeleteArticleResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.DeleteArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static by.makedon.axis.DeleteArticleResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.DeleteArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static by.makedon.axis.DeleteArticleResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (by.makedon.axis.DeleteArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static by.makedon.axis.DeleteArticleResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (by.makedon.axis.DeleteArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
