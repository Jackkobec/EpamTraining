package com.jss.lessons.lesson6.inner.previos_inner;

/**
 * Created by Jack on 11.11.2016.
 */
public class External {
    /**
     * Simple class can contains any fields
     */
    private String privateFieldExternal;
    protected String protectedFieldExternal;
    String packageFieldExternal;
    public String publicFieldExternal;

    private static String privateStaticFieldExternal;
    public static String publicStaticFieldExternal;

    public static final String publicFinalStaticFieldExternal = "publicFinalStaticFieldExternal";

    public void callDifferentFieldsFromThePublicInnerClassByInstance() {

        /**
         * Access to the non-static fields by reference_to_external.
         * ReferenceOfInner.NameOfTheField
         */
        new Inner().privateFieldPublicInner = "new Inner().privateFieldPublicInner";
        new Inner().packageFieldPublicInner = "new Inner().packageFieldPublicInner";
        new Inner().protectedFieldPublicInner = "new Inner().protectedFieldPublicInner";
        new Inner().publicFieldPublicInner = "new Inner().publicFieldPublicInner";

        /**
         * Access to the final static fields by name of previos_inner class.
         * NameOfInner.NameOfTheField
         */
        String forShowFinalStaticField = Inner.publicFinalStaticFieldPublicInner;

    }

    /**
     * Inner class
     */
    public class Inner {

        private String privateFieldPublicInner;
        String packageFieldPublicInner;
        protected String protectedFieldPublicInner;
        public String publicFieldPublicInner;
        /**
         * Inner class cant contains static fields if they are not final
         */
       /* private static String privateStaticFieldPublicInner;
        public static String publicStaticFieldPublicInner;*/

        public static final String publicFinalStaticFieldPublicInner = "publicFinalStaticFieldExternal";

        /**
         * Call different fields form the External class
         */
        public void callDifferentFieldsFromTheExternalClass() {

            /**
             * Access by name of the field
             */
            privateFieldExternal = "privateFieldExternal";
            packageFieldExternal = "packageFieldExternal";
            protectedFieldExternal = "protectedFieldExternal";
            publicFieldExternal = "publicFieldExternal";

            privateStaticFieldExternal = "privateStaticFieldExternal";
            publicStaticFieldExternal = "publicStaticFieldExternal";

            String forShowFinalStaticField = publicFinalStaticFieldExternal;

            /**
             * Access to the non-static fields by name of the class and this.
             * NameOfExternal.this.NameOfTheExternalField
             */
            External.this.privateFieldExternal = "External.this.privateFieldExternal";
            External.this.packageFieldExternal = "External.this.packageFieldExternal";
            External.this.protectedFieldExternal = "External.this.protectedFieldExternal";
            External.this.publicFieldExternal = "External.this.publicFieldExternal";


            /**
             * Access to the non-static fields by reference_to_external.
             * ReferenceOfExternal.NameOfTheField
             */
            External external = new External();

            external.privateFieldExternal = "external.privateFieldExternal";
            external.packageFieldExternal = "external.packageFieldExternal";
            external.protectedFieldExternal = "external.protectedFieldExternal";
            external.publicFieldExternal = "external.publicFieldExternal";

        }

    }

    private class privatInner {

        private String privateFieldPrivateInner;
        protected String pritectedFieldPrivateInner;
        public String publicFieldPrivateInner;

        /**
         * Inner class cant contains static fields if they are not final
         */
        /*private static String privateStaticFieldPrivateInner;
        public static String publicStaticFieldPrivateInner;*/

        public static final String publicFinalStaticFieldPrivateInner = "publicFinalStaticFieldExternal";
    }

    public static class publicNested {
        private String privateFieldPublicNested;
        protected String pritectedFieldPublicNested;
        public String publicFieldPublicNested;

        private static String privateStaticFieldPublicNested;
        public static String publicStaticFieldPublicNested;

        public static final String publicFinalStaticFieldPublicNested = "publicFinalStaticFieldExternal";
    }

    private static class ptivateNsted {
        public static class publicNested {

            private String privateFieldPrivatNested;
            protected String pritectedFieldPrivatNested;
            public String publicFieldPrivatNested;

            private static String privateStaticFieldPrivatNested;
            public static String publicStaticFieldPrivatNested;

            public static final String publicFinalStaticFieldPrivatNested = "publicFinalStaticFieldExternal";
        }
    }


    public void methodForLocalClass() {

        /**
         * Local class haven't access modification
         */
        class Local {

            private String privateFieldLocal;
            protected String pritectedFieldLocal;
            public String publicFieldLocal;

            /**
             * Local class cant contains static fields if they are not final
             */
             /* private static String          privateStaticFieldLocal;
             public static String            publicStaticFieldLocal;*/

            public static final String publicFinalStaticFieldLocal = "publicFinalStaticFieldExternal";
        }

        /**
         * Local class cant be static
         */
        /*static class NestedLocal{
        }*/

    }

    /**
     * Getters and Setters
     *
     * @return
     */
    public String getPrivateFieldExternal() {
        return privateFieldExternal;
    }

    public void setPrivateFieldExternal(String privateFieldExternal) {
        this.privateFieldExternal = privateFieldExternal;
    }

    public static String getPrivateStaticFieldExternal() {
        return privateStaticFieldExternal;
    }

    public static void setPrivateStaticFieldExternal(String privateStaticFieldExternal) {
        External.privateStaticFieldExternal = privateStaticFieldExternal;
    }
}
