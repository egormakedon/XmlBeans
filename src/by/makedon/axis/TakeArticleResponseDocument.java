/*
 * An XML document type.
 * Localname: takeArticleResponse
 * Namespace: http://axis.makedon.by
 * Java type: by.makedon.axis.TakeArticleResponseDocument
 *
 * Automatically generated - do not modify.
 */
package by.makedon.axis;


/**
 * A document containing one takeArticleResponse(@http://axis.makedon.by) element.
 *
 * This is a complex type.
 */
public interface TakeArticleResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TakeArticleResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD40CCDBFC80988009E6708CFEBF50A3E").resolveHandle("takearticleresponsee014doctype");
    
    /**
     * Gets the "takeArticleResponse" element
     */
    by.makedon.axis.TakeArticleResponseDocument.TakeArticleResponse getTakeArticleResponse();
    
    /**
     * Sets the "takeArticleResponse" element
     */
    void setTakeArticleResponse(by.makedon.axis.TakeArticleResponseDocument.TakeArticleResponse takeArticleResponse);
    
    /**
     * Appends and returns a new empty "takeArticleResponse" element
     */
    by.makedon.axis.TakeArticleResponseDocument.TakeArticleResponse addNewTakeArticleResponse();
    
    /**
     * An XML takeArticleResponse(@http://axis.makedon.by).
     *
     * This is a complex type.
     */
    public interface TakeArticleResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TakeArticleResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD40CCDBFC80988009E6708CFEBF50A3E").resolveHandle("takearticleresponse5d58elemtype");
        
        /**
         * Gets the "return" element
         */
        by.makedon.axis.xsd.Article getReturn();
        
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
        void setReturn(by.makedon.axis.xsd.Article xreturn);
        
        /**
         * Appends and returns a new empty "return" element
         */
        by.makedon.axis.xsd.Article addNewReturn();
        
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
            public static by.makedon.axis.TakeArticleResponseDocument.TakeArticleResponse newInstance() {
              return (by.makedon.axis.TakeArticleResponseDocument.TakeArticleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static by.makedon.axis.TakeArticleResponseDocument.TakeArticleResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (by.makedon.axis.TakeArticleResponseDocument.TakeArticleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static by.makedon.axis.TakeArticleResponseDocument newInstance() {
          return (by.makedon.axis.TakeArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static by.makedon.axis.TakeArticleResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (by.makedon.axis.TakeArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static by.makedon.axis.TakeArticleResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.TakeArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static by.makedon.axis.TakeArticleResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.TakeArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static by.makedon.axis.TakeArticleResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.TakeArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static by.makedon.axis.TakeArticleResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.TakeArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static by.makedon.axis.TakeArticleResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.TakeArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static by.makedon.axis.TakeArticleResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.TakeArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static by.makedon.axis.TakeArticleResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.TakeArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static by.makedon.axis.TakeArticleResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.TakeArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static by.makedon.axis.TakeArticleResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.TakeArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static by.makedon.axis.TakeArticleResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.TakeArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static by.makedon.axis.TakeArticleResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.TakeArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static by.makedon.axis.TakeArticleResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.TakeArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static by.makedon.axis.TakeArticleResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.TakeArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static by.makedon.axis.TakeArticleResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.TakeArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static by.makedon.axis.TakeArticleResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (by.makedon.axis.TakeArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static by.makedon.axis.TakeArticleResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (by.makedon.axis.TakeArticleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
