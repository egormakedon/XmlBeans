/*
 * An XML document type.
 * Localname: add
 * Namespace: http://axis.makedon.by
 * Java type: by.makedon.axis.AddDocument
 *
 * Automatically generated - do not modify.
 */
package by.makedon.axis;


/**
 * A document containing one add(@http://axis.makedon.by) element.
 *
 * This is a complex type.
 */
public interface AddDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD40CCDBFC80988009E6708CFEBF50A3E").resolveHandle("add1223doctype");
    
    /**
     * Gets the "add" element
     */
    by.makedon.axis.AddDocument.Add getAdd();
    
    /**
     * Sets the "add" element
     */
    void setAdd(by.makedon.axis.AddDocument.Add add);
    
    /**
     * Appends and returns a new empty "add" element
     */
    by.makedon.axis.AddDocument.Add addNewAdd();
    
    /**
     * An XML add(@http://axis.makedon.by).
     *
     * This is a complex type.
     */
    public interface Add extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Add.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD40CCDBFC80988009E6708CFEBF50A3E").resolveHandle("adde036elemtype");
        
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
            public static by.makedon.axis.AddDocument.Add newInstance() {
              return (by.makedon.axis.AddDocument.Add) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static by.makedon.axis.AddDocument.Add newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (by.makedon.axis.AddDocument.Add) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static by.makedon.axis.AddDocument newInstance() {
          return (by.makedon.axis.AddDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static by.makedon.axis.AddDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (by.makedon.axis.AddDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static by.makedon.axis.AddDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.AddDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static by.makedon.axis.AddDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.AddDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static by.makedon.axis.AddDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.AddDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static by.makedon.axis.AddDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.AddDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static by.makedon.axis.AddDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.AddDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static by.makedon.axis.AddDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.AddDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static by.makedon.axis.AddDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.AddDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static by.makedon.axis.AddDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.AddDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static by.makedon.axis.AddDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.AddDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static by.makedon.axis.AddDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (by.makedon.axis.AddDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static by.makedon.axis.AddDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.AddDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static by.makedon.axis.AddDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.AddDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static by.makedon.axis.AddDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.AddDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static by.makedon.axis.AddDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (by.makedon.axis.AddDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static by.makedon.axis.AddDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (by.makedon.axis.AddDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static by.makedon.axis.AddDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (by.makedon.axis.AddDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
