package de.epages.ws.producttype;

import static de.epages.ws.common.AssertNoError.assertNoError;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

import de.epages.ws.WebServiceTestConfiguration;
import de.epages.ws.common.model.TAttribute;
import de.epages.ws.common.model.TLocalizedValue;
import de.epages.ws.producttype.model.TCreatePreDefAttribute_Input;
import de.epages.ws.producttype.model.TCreatePreDefAttribute_Return;
import de.epages.ws.producttype.model.TCreateProductAttribute_Input;
import de.epages.ws.producttype.model.TCreateProductAttribute_Return;
import de.epages.ws.producttype.model.TCreate_Input;
import de.epages.ws.producttype.model.TCreate_Return;
import de.epages.ws.producttype.model.TDeletePreDefAttribute_Return;
import de.epages.ws.producttype.model.TDeleteProductAttribute_Return;
import de.epages.ws.producttype.model.TDelete_Return;
import de.epages.ws.producttype.model.TExistsPreDefAttribute_Return;
import de.epages.ws.producttype.model.TExistsProductAttribute_Return;
import de.epages.ws.producttype.model.TExists_Return;
import de.epages.ws.producttype.model.TGetAllPreDefAttributesInfo_Return;
import de.epages.ws.producttype.model.TGetAllProductAttributesInfo_Return;
import de.epages.ws.producttype.model.TGetInfo_Return;
import de.epages.ws.producttype.model.TGetPreDefAttributeInfo_Return;
import de.epages.ws.producttype.model.TGetProductAttributeInfo_Return;
import de.epages.ws.producttype.model.TUpdatePreDefAttribute_Input;
import de.epages.ws.producttype.model.TUpdatePreDefAttribute_Return;
import de.epages.ws.producttype.model.TUpdateProductAttribute_Input;
import de.epages.ws.producttype.model.TUpdateProductAttribute_Return;
import de.epages.ws.producttype.model.TUpdate_Input;
import de.epages.ws.producttype.model.TUpdate_Return;
import de.epages.ws.producttype.stub.Type_createPreDefAttribute_Out;
import de.epages.ws.producttype.stub.Type_createProductAttribute_Out;
import de.epages.ws.producttype.stub.Type_deletePreDefAttribute_Out;
import de.epages.ws.producttype.stub.Type_deleteProductAttribute_Out;
import de.epages.ws.producttype.stub.Type_existsPreDefAttribute_Out;
import de.epages.ws.producttype.stub.Type_existsProductAttribute_Out;
import de.epages.ws.producttype.stub.Type_getAllPreDefAttributesInfo_Out;
import de.epages.ws.producttype.stub.Type_getAllProductAttributesInfo_Out;
import de.epages.ws.producttype.stub.Type_getPreDefAttributeInfo_Out;
import de.epages.ws.producttype.stub.Type_getProductAttributeInfo_Out;
import de.epages.ws.producttype.stub.Type_updatePreDefAttribute_Out;
import de.epages.ws.producttype.stub.Type_updateProductAttribute_Out;

public class ProductTypeServiceTest {

    private static final ProductTypeServiceClientImpl productTypeService = new ProductTypeServiceClientImpl(
            new WebServiceTestConfiguration());

    private static final String SHOP_PATH = "/Shops/DemoShop/";
    private static final String PRODUCTTYPES_PATH = SHOP_PATH + "ProductTypes/";
    private static final String NOT_EXISTING_ALIAS = "NotExisting";
    private static final String NOT_EXISTING_PATH = PRODUCTTYPES_PATH + NOT_EXISTING_ALIAS;
    private static final String JAVA_TEST1_ALIAS = "javaTest1";
    private static final String JAVA_TEST1_PATH = PRODUCTTYPES_PATH + JAVA_TEST1_ALIAS;
    private static final String JAVA_TEST1_NAME_DE = "javaTest1DE";
    private static final String JAVA_TEST1_NAME_EN = "javaTest1EN";
    private static final String JAVA_TEST1_LAYOUT_BUNDLES = "BundlesTable";

    private static final String JAVA_TEST2_ALIAS = "javaTest2";
    private static final String JAVA_TEST2_PATH = PRODUCTTYPES_PATH + JAVA_TEST2_ALIAS;
    private static final String JAVA_TEST2_NAME_DE = "javaTest2DE";
    private static final String JAVA_TEST2_NAME_EN = "javaTest2EN";
    private static final String JAVA_TEST2_LAYOUT_BASE = "ImageRight";

    private static final String ATTRIBUTES_PATH = JAVA_TEST1_PATH + "/Attributes/";
    private static final String ATTRIBUTE1_ALIAS = "attribute1";
    private static final String ATTRIBUTE1_TYPE = "LocalizedString";
    private static final String ATTRIBUTE1_PATH = ATTRIBUTES_PATH + ATTRIBUTE1_ALIAS;
    private static final String ATTRIBUTE1_NAME_DE = "attribute1DE";
    private static final String ATTRIBUTE1_NAME_EN = "attribute1EN";
    private static final String ATTRIBUTE1_DESCR_DE = "attribute1descrDE";
    private static final String ATTRIBUTE1_DESCR_EN = "attribute1descrEN";

    private static final String ATTRIBUTE2_ALIAS = "attribute2";
    private static final String ATTRIBUTE2_PATH = ATTRIBUTES_PATH + ATTRIBUTE2_ALIAS;
    private static final String ATTRIBUTE2_TYPE = "PreDefString";
    private static final String ATTRIBUTE2_NAME_DE = "attribute2DE";
    private static final String ATTRIBUTE2_NAME_EN = "attribute2EN";
    private static final String ATTRIBUTE2_DESCR_DE = "attribute2descrDE";
    private static final String ATTRIBUTE2_DESCR_EN = "attribute2descrEN";

    private static final String PREDEF_ATTRIBUTES_PATH = ATTRIBUTE2_PATH + "/PreDefAttributes/";
    private static final String PREDEF_ATTRIBUTE1_ALIAS = "predef1";
    private static final String PREDEF_ATTRIBUTE1_PATH = PREDEF_ATTRIBUTES_PATH + PREDEF_ATTRIBUTE1_ALIAS;
    private static final String PREDEF_ATTRIBUTE1_NAME = "predef1Name";
    private static final String PREDEF_ATTRIBUTE2_ALIAS = "predef2";
    private static final String PREDEF_ATTRIBUTE2_PATH = PREDEF_ATTRIBUTES_PATH + PREDEF_ATTRIBUTE2_ALIAS;
    private static final String PREDEF_ATTRIBUTE2_NAME = "predef2Name";

    public void testGetBaseProductType() {
        String baseProductType = productTypeService.getBaseProductType();
        assertEquals(SHOP_PATH + "ProductClass", baseProductType);
    }

    public void testGetAllInfo() {
        String baseProductType = productTypeService.getBaseProductType();
        TGetInfo_Return[] productTypes = productTypeService.getAllInfo(new String[] {}, new String[] {});

        boolean javaTest1Found = false, javaTest2Found = false, baseFound = false;
        for (TGetInfo_Return productType : productTypes) {
            assertNoError(productType.getError());
            if (productType.getAlias().equals(JAVA_TEST1_ALIAS)) {
                javaTest1Found = true;
                assertEquals(JAVA_TEST1_LAYOUT_BUNDLES, productType.getLayoutContentBundles());
                TLocalizedValue[] names = productType.getName();
                for (TLocalizedValue name : names) {
                    if (name.getLanguageCode().equals("de"))
                        assertEquals(JAVA_TEST1_NAME_DE, name.getValue());
                    else if (name.getLanguageCode().equals("en"))
                        assertEquals(JAVA_TEST1_NAME_EN, name.getValue());
                }
            } else if (productType.getAlias().equals(JAVA_TEST2_ALIAS)) {
                javaTest2Found = true;
                assertEquals(JAVA_TEST2_LAYOUT_BASE, productType.getLayoutContentBase());
                TLocalizedValue[] names = productType.getName();
                for (TLocalizedValue name : names) {
                    if (name.getLanguageCode().equals("de")) {
                        assertEquals(JAVA_TEST2_NAME_DE, name.getValue());
                    } else if (name.getLanguageCode().equals("en")) {
                        assertEquals(JAVA_TEST2_NAME_EN, name.getValue());
                    }
                }
            } else if (baseProductType.equals(productType.getPath())) {
                baseFound = true;
            }
        }
        assertTrue(javaTest1Found);
        assertTrue(javaTest2Found);
        assertTrue(baseFound);

    }

    public void testGetInfo() {

        TGetInfo_Return[] productTypes = productTypeService.getInfo(new String[] { JAVA_TEST1_PATH, JAVA_TEST2_PATH, NOT_EXISTING_PATH },
                new String[] { "WebUrl" }, new String[] { "de", "en" });

        // check first created test product type
        assertEquals(JAVA_TEST1_PATH, productTypes[0].getPath());
        assertNoError(productTypes[0].getError());
        assertEquals(JAVA_TEST1_ALIAS, productTypes[0].getAlias());
        assertEquals(JAVA_TEST1_LAYOUT_BUNDLES, productTypes[0].getLayoutContentBundles());
        TLocalizedValue[] names = productTypes[0].getName();
        assertEquals(2, names.length);
        for (TLocalizedValue name : names) {
            if (name.getLanguageCode().equals("de"))
                assertEquals(JAVA_TEST1_NAME_DE, name.getValue());
            else if (name.getLanguageCode().equals("en"))
                assertEquals(JAVA_TEST1_NAME_EN, name.getValue());
        }
        TAttribute[] attributes = productTypes[0].getAttributes();
        assertEquals(1, attributes.length);
        assertEquals("WebUrl", attributes[0].getName());
        assertNotNull(attributes[0].getValue());

        // check second created test product type
        assertEquals(JAVA_TEST2_PATH, productTypes[1].getPath());
        assertNoError(productTypes[1].getError());
        assertEquals(JAVA_TEST2_ALIAS, productTypes[1].getAlias());
        assertEquals(JAVA_TEST2_LAYOUT_BASE, productTypes[1].getLayoutContentBase());
        names = productTypes[1].getName();
        assertEquals(2, names.length);
        for (TLocalizedValue name : names) {
            if (name.getLanguageCode().equals("de"))
                assertEquals(JAVA_TEST2_NAME_DE, name.getValue());
            else if (name.getLanguageCode().equals("en"))
                assertEquals(JAVA_TEST2_NAME_EN, name.getValue());
        }
        attributes = productTypes[1].getAttributes();
        assertEquals(1, attributes.length);
        assertEquals("WebUrl", attributes[0].getName());
        assertNotNull(attributes[0].getValue());

        // third element must be error
        assertNotNull(productTypes[2].getError());

    }

    public void testExists() {

        TExists_Return[] productTypes = productTypeService.exists(new String[] { JAVA_TEST1_PATH, JAVA_TEST2_PATH, NOT_EXISTING_PATH });
        for (TExists_Return productType : productTypes) {
            assertNoError(productType.getError());
        }
        assertEquals(3, productTypes.length);
        assertEquals(JAVA_TEST1_PATH, productTypes[0].getPath());
        assertTrue(productTypes[0].getExists());
        assertEquals(JAVA_TEST2_PATH, productTypes[1].getPath());
        assertTrue(productTypes[1].getExists());
        assertEquals(NOT_EXISTING_PATH, productTypes[2].getPath());
        assertFalse(productTypes[2].getExists());

    }

    public void testCreate() {

        TCreate_Input create1 = new TCreate_Input();
        create1.setAlias(JAVA_TEST1_ALIAS);
        create1.setLayoutContentBundles(JAVA_TEST1_LAYOUT_BUNDLES);
        TLocalizedValue name1_de = new TLocalizedValue();
        name1_de.setLanguageCode("de");
        name1_de.setValue(JAVA_TEST1_NAME_DE);
        TLocalizedValue name1_en = new TLocalizedValue();
        name1_en.setLanguageCode("en");
        name1_en.setValue(JAVA_TEST1_NAME_EN);
        create1.setName(new TLocalizedValue[] { name1_de, name1_en });

        TCreate_Input create2 = new TCreate_Input();
        create2.setAlias(JAVA_TEST2_ALIAS);
        create2.setLayoutContentBase(JAVA_TEST2_LAYOUT_BASE);
        TLocalizedValue name2_de = new TLocalizedValue();
        name2_de.setLanguageCode("de");
        name2_de.setValue(JAVA_TEST2_NAME_DE);
        TLocalizedValue name2_en = new TLocalizedValue();
        name2_en.setLanguageCode("en");
        name2_en.setValue(JAVA_TEST2_NAME_EN);
        create2.setName(new TLocalizedValue[] { name2_de, name2_en });

        TCreate_Input[] createProductTypes = new TCreate_Input[] { create1, create2 };
        TCreate_Return[] productTypes = productTypeService.create(createProductTypes);

        assertEquals(createProductTypes.length, productTypes.length);

        assertEquals(JAVA_TEST1_ALIAS, productTypes[0].getAlias());
        assertNoError(productTypes[0].getError());
        assertTrue(productTypes[0].getCreated());
        assertEquals(JAVA_TEST1_PATH, productTypes[0].getPath());

        assertEquals(JAVA_TEST2_ALIAS, productTypes[1].getAlias());
        assertNoError(productTypes[1].getError());
        assertTrue(productTypes[1].getCreated());
        assertEquals(JAVA_TEST2_PATH, productTypes[1].getPath());

    }

    public void testUpdate() {

        TUpdate_Input update1 = new TUpdate_Input();
        update1.setPath(JAVA_TEST1_PATH);
        update1.setLayoutContentBundles(JAVA_TEST1_LAYOUT_BUNDLES);
        TLocalizedValue name1_de = new TLocalizedValue();
        name1_de.setLanguageCode("de");
        name1_de.setValue(JAVA_TEST1_NAME_DE + "updated");
        update1.setName(new TLocalizedValue[] { name1_de });

        TUpdate_Return[] productTypes = productTypeService.update(new TUpdate_Input[] { update1 });
        assertEquals(1, productTypes.length);
        assertEquals(JAVA_TEST1_PATH, productTypes[0].getPath());
        assertNoError(productTypes[0].getError());
        assertTrue(productTypes[0].getUpdated());

        TGetInfo_Return[] result = productTypeService.getInfo(new String[] { JAVA_TEST1_PATH }, new String[] {},
                new String[] { "de", "en" });

        assertEquals(1, result.length);
        assertEquals(JAVA_TEST1_PATH, result[0].getPath());
        assertNoError(result[0].getError());
        assertEquals(JAVA_TEST1_ALIAS, result[0].getAlias());
        assertEquals(JAVA_TEST1_LAYOUT_BUNDLES, result[0].getLayoutContentBundles());
        TLocalizedValue[] names = result[0].getName();
        assertEquals(2, names.length);
        assertEquals("de", names[0].getLanguageCode());
        assertEquals(JAVA_TEST1_NAME_DE + "updated", names[0].getValue());
        assertEquals("en", names[1].getLanguageCode());
        assertEquals(JAVA_TEST1_NAME_EN, names[1].getValue());

    }

    public void testDelete() {

        TDelete_Return[] result = productTypeService.delete(new String[] { JAVA_TEST1_PATH, JAVA_TEST2_PATH, NOT_EXISTING_PATH });
        assertEquals(3, result.length);
        assertEquals(JAVA_TEST1_PATH, result[0].getPath());
        assertNoError(result[0].getError());
        assertTrue(result[0].getDeleted());

        assertEquals(JAVA_TEST2_PATH, result[1].getPath());
        assertNoError(result[1].getError());
        assertTrue(result[1].getDeleted());

        assertEquals(NOT_EXISTING_PATH, result[2].getPath());
        assertNotNull(result[2].getError());

        TExists_Return[] existsResult = productTypeService.exists(new String[] { JAVA_TEST1_PATH, JAVA_TEST2_PATH });
        assertEquals(2, existsResult.length);
        assertEquals(JAVA_TEST1_PATH, existsResult[0].getPath());
        assertNoError(existsResult[0].getError());
        assertFalse(existsResult[0].getExists());

        assertEquals(JAVA_TEST2_PATH, existsResult[1].getPath());
        assertNoError(existsResult[1].getError());
        assertFalse(existsResult[1].getExists());

    }

    public void testCreateProductAttribute() {

        TCreateProductAttribute_Input in1 = new TCreateProductAttribute_Input();
        in1.setAlias(ATTRIBUTE1_ALIAS);
        in1.setType(ATTRIBUTE1_TYPE);
        in1.setName(new TLocalizedValue[] { new TLocalizedValue("de", ATTRIBUTE1_NAME_DE), new TLocalizedValue("en", ATTRIBUTE1_NAME_EN) });
        in1.setDescription(new TLocalizedValue[] { new TLocalizedValue("de", ATTRIBUTE1_DESCR_DE),
                new TLocalizedValue("en", ATTRIBUTE1_DESCR_EN) });
        in1.setIsVisible(true);
        in1.setIsHTML(true);
        in1.setPosition(new BigInteger("8192"));

        TCreateProductAttribute_Input in2 = new TCreateProductAttribute_Input();
        in2.setAlias(ATTRIBUTE2_ALIAS);
        in2.setType(ATTRIBUTE2_TYPE);
        in2.setName(new TLocalizedValue[] { new TLocalizedValue("de", ATTRIBUTE2_NAME_DE), new TLocalizedValue("en", ATTRIBUTE2_NAME_EN) });
        in2.setDescription(new TLocalizedValue[] { new TLocalizedValue("de", ATTRIBUTE2_DESCR_DE),
                new TLocalizedValue("en", ATTRIBUTE2_DESCR_EN) });
        in2.setPosition(new BigInteger("4096"));

        TCreateProductAttribute_Input in3 = new TCreateProductAttribute_Input();
        in3.setAlias("CurrencyID"); // reserved attribute alias
        in3.setType(ATTRIBUTE1_TYPE);

        TCreateProductAttribute_Input[] in = { in1, in2, in3 };
        Type_createProductAttribute_Out result = productTypeService.createProductAttribute(JAVA_TEST1_PATH, in);
        assertNoError(result.getError());
        TCreateProductAttribute_Return[] attributes = result.getProductAttributes();
        assertNotNull(attributes);
        assertEquals(in.length, attributes.length);
        assertEquals(ATTRIBUTE1_ALIAS, attributes[0].getAlias());
        assertNoError(attributes[0].getError());
        assertEquals(ATTRIBUTE1_PATH, attributes[0].getPath());
        assertTrue(attributes[0].getCreated());
        assertEquals(ATTRIBUTE2_ALIAS, attributes[1].getAlias());
        assertNoError(attributes[1].getError());
        assertEquals(ATTRIBUTE2_PATH, attributes[1].getPath());
        assertTrue(attributes[1].getCreated());
        assertEquals("CurrencyID", attributes[2].getAlias());
        assertNotNull(attributes[2].getError());

    }

    public void testGetAllProductAttibutesInfo() {

        Type_getAllProductAttributesInfo_Out result = productTypeService.getAllProductAttributesInfo(JAVA_TEST1_PATH, new String[] { "de",
                "en" });

        assertNoError(result.getError());
        TGetAllProductAttributesInfo_Return[] attributes = result.getProductAttributes();
        assertNotNull(attributes);

        boolean attribute1Found = false, attribute2Found = false;
        for (TGetAllProductAttributesInfo_Return attribute : attributes) {
            if (ATTRIBUTE1_ALIAS.equals(attribute.getAlias())) {
                attribute1Found = true;
                assertEquals(ATTRIBUTE1_PATH, attribute.getPath());
                assertEquals(ATTRIBUTE1_TYPE, attribute.getType());
                assertTrue(attribute.isIsVisible());
                assertTrue(attribute.isIsHTML());
                TLocalizedValue[] names = attribute.getName();
                for (TLocalizedValue name : names) {
                    if ("de".equals(name.getLanguageCode()))
                        assertEquals(ATTRIBUTE1_NAME_DE, name.getValue());
                    else if ("en".equals(name.getLanguageCode()))
                        assertEquals(ATTRIBUTE1_NAME_EN, name.getValue());
                }
                names = attribute.getDescription();
                for (TLocalizedValue name : names) {
                    if ("de".equals(name.getLanguageCode()))
                        assertEquals(ATTRIBUTE1_DESCR_DE, name.getValue());
                    else if ("en".equals(name.getLanguageCode()))
                        assertEquals(ATTRIBUTE1_DESCR_EN, name.getValue());
                }
            }
            if (ATTRIBUTE2_ALIAS.equals(attribute.getAlias())) {
                attribute2Found = true;
                assertEquals(ATTRIBUTE2_PATH, attribute.getPath());
                assertEquals(ATTRIBUTE2_TYPE, attribute.getType());
                assertFalse(attribute.isIsVisible());
                assertFalse(attribute.isIsHTML());
                TLocalizedValue[] names = attribute.getName();
                for (TLocalizedValue name : names) {
                    if ("de".equals(name.getLanguageCode()))
                        assertEquals(ATTRIBUTE2_NAME_DE, name.getValue());
                    else if ("en".equals(name.getLanguageCode()))
                        assertEquals(ATTRIBUTE2_NAME_EN, name.getValue());
                }
                names = attribute.getDescription();
                for (TLocalizedValue name : names) {
                    if ("de".equals(name.getLanguageCode()))
                        assertEquals(ATTRIBUTE2_DESCR_DE, name.getValue());
                    else if ("en".equals(name.getLanguageCode()))
                        assertEquals(ATTRIBUTE2_DESCR_EN, name.getValue());
                }
            }
        }
        assertTrue(attribute1Found);
        assertTrue(attribute2Found);

    }

    public void testGetProductAttributeInfo() {
        Type_getProductAttributeInfo_Out result = productTypeService.getProductAttributeInfo(JAVA_TEST1_PATH, new String[] {
                ATTRIBUTE1_ALIAS, ATTRIBUTE2_ALIAS, NOT_EXISTING_ALIAS }, new String[] { "en", "de" });
        assertNoError(result.getError());
        TGetProductAttributeInfo_Return[] attributes = result.getProductAttributes();
        assertNotNull(attributes);
        assertEquals(3, attributes.length);

        assertEquals(ATTRIBUTE1_ALIAS, attributes[0].getAlias());
        assertNoError(attributes[0].getError());
        assertEquals(ATTRIBUTE1_PATH, attributes[0].getPath());
        assertEquals(ATTRIBUTE1_TYPE, attributes[0].getType());
        assertTrue(attributes[0].getIsVisible());
        assertTrue(attributes[0].getIsHTML());
        assertEquals(0, attributes[0].getPosition().intValue() % 10);

        assertEquals(ATTRIBUTE2_ALIAS, attributes[1].getAlias());
        assertNoError(attributes[1].getError());
        assertEquals(ATTRIBUTE2_PATH, attributes[1].getPath());
        assertEquals(ATTRIBUTE2_TYPE, attributes[1].getType());
        assertFalse(attributes[1].getIsVisible());
        assertFalse(attributes[1].getIsHTML());
        assertEquals(0, attributes[1].getPosition().intValue() % 10);

        assertEquals(1, attributes[0].getPosition().compareTo(attributes[1].getPosition()));

        assertNotNull(attributes[2].getError());

    }

    public void testExistsProductAttribute() {
        Type_existsProductAttribute_Out result = productTypeService.existsProductAttribute(JAVA_TEST1_PATH, new String[] {
                ATTRIBUTE1_ALIAS, ATTRIBUTE2_ALIAS, NOT_EXISTING_ALIAS });
        assertNoError(result.getError());
        TExistsProductAttribute_Return[] attributes = result.getProductAttributes();
        assertNotNull(attributes);
        assertEquals(3, attributes.length);

        assertEquals(ATTRIBUTE1_ALIAS, attributes[0].getAlias());
        assertTrue(attributes[0].isExists());
        assertEquals(ATTRIBUTE2_ALIAS, attributes[1].getAlias());
        assertTrue(attributes[1].isExists());
        assertEquals(NOT_EXISTING_ALIAS, attributes[2].getAlias());
        assertFalse(attributes[2].isExists());
    }

    public void testUpdateProductAttribute() {
        TUpdateProductAttribute_Input in1 = new TUpdateProductAttribute_Input();
        in1.setAlias(ATTRIBUTE1_ALIAS);
        in1.setIsHTML(false);
        in1.setDescription(new TLocalizedValue[] { new TLocalizedValue("en", ATTRIBUTE1_DESCR_EN + "updated") });
        in1.setPosition(new BigInteger("1"));

        TUpdateProductAttribute_Input in2 = new TUpdateProductAttribute_Input();
        in2.setAlias(ATTRIBUTE2_ALIAS);
        in2.setIsVisible(true);
        in2.setName(new TLocalizedValue[] { new TLocalizedValue("de", ATTRIBUTE2_NAME_DE + "updated") });

        TUpdateProductAttribute_Input in3 = new TUpdateProductAttribute_Input();
        in3.setAlias(NOT_EXISTING_ALIAS);

        Type_updateProductAttribute_Out result = productTypeService.updateProductAttribute(JAVA_TEST1_PATH,
                new TUpdateProductAttribute_Input[] { in1, in2, in3 });

        assertNoError(result.getError());
        TUpdateProductAttribute_Return[] attributes = result.getProductAttributes();
        assertNotNull(attributes);
        assertEquals(3, attributes.length);

        assertEquals(ATTRIBUTE1_ALIAS, attributes[0].getAlias());
        assertNoError(attributes[0].getError());
        assertTrue(attributes[0].getUpdated());

        assertEquals(ATTRIBUTE2_ALIAS, attributes[1].getAlias());
        assertNoError(attributes[1].getError());
        assertTrue(attributes[1].getUpdated());

        assertEquals(NOT_EXISTING_ALIAS, attributes[2].getAlias());
        assertNotNull(attributes[2].getError());

        Type_getProductAttributeInfo_Out result2 = productTypeService.getProductAttributeInfo(JAVA_TEST1_PATH, new String[] {
                ATTRIBUTE1_ALIAS, ATTRIBUTE2_ALIAS }, new String[] { "en", "de" });
        assertNoError(result2.getError());
        TGetProductAttributeInfo_Return[] attributes2 = result2.getProductAttributes();
        assertNotNull(attributes2);
        assertEquals(2, attributes2.length);

        assertEquals(ATTRIBUTE1_ALIAS, attributes2[0].getAlias());
        assertNoError(attributes2[0].getError());
        assertEquals(ATTRIBUTE1_PATH, attributes2[0].getPath());
        assertTrue(attributes2[0].getIsVisible());
        assertFalse(attributes2[0].getIsHTML());
        assertEquals(0, attributes2[0].getPosition().intValue() % 10);
        TLocalizedValue[] descriptions = attributes2[0].getDescription();
        assertEquals(2, descriptions.length);
        for (TLocalizedValue description : descriptions) {
            if ("de".equals(description.getLanguageCode()))
                assertEquals(ATTRIBUTE1_DESCR_DE, description.getValue());
            else if ("en".equals(description.getLanguageCode()))
                assertEquals(ATTRIBUTE1_DESCR_EN + "updated", description.getValue());
        }

        assertEquals(ATTRIBUTE2_ALIAS, attributes2[1].getAlias());
        assertNoError(attributes2[1].getError());
        assertEquals(ATTRIBUTE2_PATH, attributes2[1].getPath());
        assertTrue(attributes2[1].getIsVisible());
        assertFalse(attributes2[1].getIsHTML());
        assertEquals(0, attributes2[1].getPosition().intValue() % 10);
        TLocalizedValue[] names = attributes2[1].getName();
        assertEquals(2, names.length);
        for (TLocalizedValue name : names) {
            if ("de".equals(name.getLanguageCode()))
                assertEquals(ATTRIBUTE2_NAME_DE + "updated", name.getValue());
            else if ("en".equals(name.getLanguageCode()))
                assertEquals(ATTRIBUTE2_NAME_EN, name.getValue());
        }
        assertNotEquals(attributes2[0].getPosition(), attributes2[1].getPosition());
    }

    public void testDeleteProductAttribute() {
        Type_deleteProductAttribute_Out result = productTypeService.deleteProductAttribute(JAVA_TEST1_PATH, new String[] {
                ATTRIBUTE1_ALIAS, NOT_EXISTING_ALIAS });
        assertNoError(result.getError());
        TDeleteProductAttribute_Return[] attributes = result.getProductAttributes();
        assertNotNull(attributes);
        assertEquals(2, attributes.length);

        assertEquals(ATTRIBUTE1_ALIAS, attributes[0].getAlias());
        assertNoError(attributes[0].getError());
        assertTrue(attributes[0].getDeleted());

        assertEquals(NOT_EXISTING_ALIAS, attributes[1].getAlias());
        assertNotNull(attributes[1].getError());

        Type_existsProductAttribute_Out result2 = productTypeService.existsProductAttribute(JAVA_TEST1_PATH,
                new String[] { ATTRIBUTE1_ALIAS });
        assertNoError(result.getError());
        TExistsProductAttribute_Return[] attributes2 = result2.getProductAttributes();
        assertNotNull(attributes2);
        assertEquals(1, attributes2.length);
        assertEquals(ATTRIBUTE1_ALIAS, attributes2[0].getAlias());
        assertFalse(attributes2[0].isExists());
    }

    public void testCreatePreDefAttribute() {
        TCreatePreDefAttribute_Input in1 = new TCreatePreDefAttribute_Input();
        in1.setAlias(PREDEF_ATTRIBUTE1_ALIAS);
        in1.setValueString(PREDEF_ATTRIBUTE1_NAME);
        in1.setPosition(new BigInteger("32"));

        TCreatePreDefAttribute_Input in2 = new TCreatePreDefAttribute_Input();
        in2.setAlias(PREDEF_ATTRIBUTE2_ALIAS);
        in2.setValueString(PREDEF_ATTRIBUTE2_NAME);
        in2.setPosition(new BigInteger("33"));

        TCreatePreDefAttribute_Input in3 = new TCreatePreDefAttribute_Input();
        in3.setAlias(PREDEF_ATTRIBUTE2_ALIAS);

        Type_createPreDefAttribute_Out result = productTypeService.createPreDefAttribute(ATTRIBUTE2_PATH,
                new TCreatePreDefAttribute_Input[] { in1, in2, in3 });

        assertNoError(result.getError());
        TCreatePreDefAttribute_Return[] predefs = result.getPreDefAttributes();
        assertNotNull(predefs);
        assertEquals(3, predefs.length);

        assertEquals(PREDEF_ATTRIBUTE1_ALIAS, predefs[0].getAlias());
        assertNoError(predefs[0].getError());
        assertEquals(PREDEF_ATTRIBUTE1_PATH, predefs[0].getPath());
        assertTrue(predefs[0].getCreated());

        assertEquals(PREDEF_ATTRIBUTE2_ALIAS, predefs[1].getAlias());
        assertNoError(predefs[1].getError());
        assertEquals(PREDEF_ATTRIBUTE2_PATH, predefs[1].getPath());
        assertTrue(predefs[1].getCreated());

        assertEquals(PREDEF_ATTRIBUTE2_ALIAS, predefs[2].getAlias());
        assertNotNull(predefs[2].getError());
    }

    public void testGetAllPreDefAttributesInfo() {

        Type_getAllPreDefAttributesInfo_Out result = productTypeService.getAllPreDefAttributesInfo(ATTRIBUTE2_PATH, new String[] {});
        assertNoError(result.getError());
        TGetAllPreDefAttributesInfo_Return[] predefs = result.getPreDefAttributes();
        assertNotNull(predefs);

        boolean predef1Found = false, predef2Found = false;
        for (TGetAllPreDefAttributesInfo_Return predef : predefs) {
            if (PREDEF_ATTRIBUTE1_ALIAS.equals(predef.getAlias())) {
                predef1Found = true;
                assertEquals(PREDEF_ATTRIBUTE1_PATH, predef.getPath());
                assertEquals(PREDEF_ATTRIBUTE1_NAME, predef.getValueString());
                assertNull(predef.getValueLocString());
            } else if (PREDEF_ATTRIBUTE2_ALIAS.equals(predef.getAlias())) {
                predef2Found = true;
                assertEquals(PREDEF_ATTRIBUTE2_PATH, predef.getPath());
                assertEquals(PREDEF_ATTRIBUTE2_NAME, predef.getValueString());
                assertNull(predef.getValueLocString());
            }
        }
        assertTrue(predef1Found);
        assertTrue(predef2Found);
    }

    public void testGetPreDefAttributeInfo() {
        Type_getPreDefAttributeInfo_Out result = productTypeService.getPreDefAttributeInfo(ATTRIBUTE2_PATH, new String[] {
                PREDEF_ATTRIBUTE1_ALIAS, PREDEF_ATTRIBUTE2_ALIAS, NOT_EXISTING_ALIAS }, new String[] {});
        assertNoError(result.getError());
        TGetPreDefAttributeInfo_Return[] predefs = result.getPreDefAttributes();
        assertNotNull(predefs);
        assertEquals(3, predefs.length);

        assertEquals(PREDEF_ATTRIBUTE1_ALIAS, predefs[0].getAlias());
        assertNoError(predefs[0].getError());
        assertEquals(PREDEF_ATTRIBUTE1_PATH, predefs[0].getPath());
        assertEquals(PREDEF_ATTRIBUTE1_NAME, predefs[0].getValueString());
        assertNull(predefs[0].getValueLocString());
        assertEquals(0, predefs[0].getPosition().intValue() % 10);

        assertEquals(PREDEF_ATTRIBUTE2_ALIAS, predefs[1].getAlias());
        assertNoError(predefs[1].getError());
        assertEquals(PREDEF_ATTRIBUTE2_PATH, predefs[1].getPath());
        assertEquals(PREDEF_ATTRIBUTE2_NAME, predefs[1].getValueString());
        assertNull(predefs[1].getValueLocString());
        assertEquals(0, predefs[1].getPosition().intValue() % 10);

        assertEquals(-1, predefs[0].getPosition().compareTo(predefs[1].getPosition()));

        assertEquals(NOT_EXISTING_ALIAS, predefs[2].getAlias());
        assertNotNull(predefs[2].getError());
    }

    public void testExistsPreDefAttribute() {
        Type_existsPreDefAttribute_Out result = productTypeService.existsPreDefAttribute(ATTRIBUTE2_PATH, new String[] {
                PREDEF_ATTRIBUTE1_ALIAS, PREDEF_ATTRIBUTE2_ALIAS, NOT_EXISTING_ALIAS });
        assertNoError(result.getError());
        TExistsPreDefAttribute_Return[] predefs = result.getPreDefAttributes();
        assertNotNull(predefs);
        assertEquals(3, predefs.length);

        assertEquals(PREDEF_ATTRIBUTE1_ALIAS, predefs[0].getAlias());
        assertTrue(predefs[0].isExists());

        assertEquals(PREDEF_ATTRIBUTE2_ALIAS, predefs[1].getAlias());
        assertTrue(predefs[1].isExists());

        assertEquals(NOT_EXISTING_ALIAS, predefs[2].getAlias());
        assertFalse(predefs[2].isExists());
    }

    public void testUpdatePreDefAttibute() {
        TUpdatePreDefAttribute_Input in1 = new TUpdatePreDefAttribute_Input();
        in1.setAlias(PREDEF_ATTRIBUTE1_ALIAS);
        in1.setValueString(PREDEF_ATTRIBUTE1_NAME + "updated");
        in1.setPosition(new BigInteger("99999"));

        TUpdatePreDefAttribute_Input in2 = new TUpdatePreDefAttribute_Input();
        in2.setAlias(NOT_EXISTING_ALIAS);

        Type_updatePreDefAttribute_Out result = productTypeService.updatePreDefAttribute(ATTRIBUTE2_PATH,
                new TUpdatePreDefAttribute_Input[] { in1, in2 });
        assertNoError(result.getError());
        TUpdatePreDefAttribute_Return[] predefs = result.getPreDefAttributes();
        assertNotNull(predefs);
        assertEquals(2, predefs.length);

        assertEquals(PREDEF_ATTRIBUTE1_ALIAS, predefs[0].getAlias());
        assertNoError(predefs[0].getError());
        assertTrue(predefs[0].getUpdated());

        assertEquals(NOT_EXISTING_ALIAS, predefs[1].getAlias());
        assertNotNull(predefs[1].getError());

        Type_getPreDefAttributeInfo_Out result2 = productTypeService.getPreDefAttributeInfo(ATTRIBUTE2_PATH, new String[] {
                PREDEF_ATTRIBUTE1_ALIAS, PREDEF_ATTRIBUTE2_ALIAS }, new String[] {});
        assertNoError(result2.getError());
        TGetPreDefAttributeInfo_Return[] predefs2 = result2.getPreDefAttributes();
        assertNotNull(predefs2);
        assertEquals(2, predefs2.length);

        assertEquals(PREDEF_ATTRIBUTE1_ALIAS, predefs2[0].getAlias());
        assertNoError(predefs2[0].getError());
        assertEquals(PREDEF_ATTRIBUTE1_NAME + "updated", predefs2[0].getValueString());
        assertNull(predefs2[0].getValueLocString());
        assertEquals(0, predefs2[0].getPosition().intValue() % 10);

        assertEquals(PREDEF_ATTRIBUTE2_ALIAS, predefs2[1].getAlias());
        assertNoError(predefs2[1].getError());
        assertEquals(PREDEF_ATTRIBUTE2_NAME, predefs2[1].getValueString());
        assertNull(predefs2[1].getValueLocString());
        assertEquals(0, predefs2[1].getPosition().intValue() % 10);

        assertTrue(0 != predefs2[0].getPosition().compareTo(predefs2[1].getPosition()));
    }

    public void testDeletePreDefAttribute() {
        Type_deletePreDefAttribute_Out result = productTypeService.deletePreDefAttribute(ATTRIBUTE2_PATH, new String[] {
                PREDEF_ATTRIBUTE2_ALIAS, NOT_EXISTING_ALIAS });
        assertNoError(result.getError());
        TDeletePreDefAttribute_Return[] predefs = result.getPreDefAttributes();
        assertNotNull(predefs);
        assertEquals(2, predefs.length);

        assertEquals(PREDEF_ATTRIBUTE2_ALIAS, predefs[0].getAlias());
        assertNoError(predefs[0].getError());
        assertTrue(predefs[0].getDeleted());

        assertEquals(NOT_EXISTING_ALIAS, predefs[1].getAlias());
        assertNotNull(predefs[1].getError());

        Type_existsPreDefAttribute_Out result2 = productTypeService.existsPreDefAttribute(ATTRIBUTE2_PATH,
                new String[] { PREDEF_ATTRIBUTE2_ALIAS });
        assertNoError(result2.getError());
        TExistsPreDefAttribute_Return[] predefs2 = result2.getPreDefAttributes();
        assertNotNull(predefs2);
        assertEquals(1, predefs2.length);

        assertEquals(PREDEF_ATTRIBUTE2_ALIAS, predefs2[0].getAlias());
        assertFalse(predefs2[0].isExists());
    }

    @Before
    public void deleteIfExist() {
        TExists_Return[] existsResult = productTypeService.exists(new String[] { JAVA_TEST1_PATH, JAVA_TEST2_PATH });

        for (TExists_Return e : existsResult) {
            if (e.getExists()) {
                productTypeService.delete(new String[] { e.getPath() });
            }
        }
    }

    /**
     * test everything
     */
    @Test
    public void testAll() {
        testGetBaseProductType();
        testCreate();
        testGetAllInfo();
        testGetInfo();
        testExists();
        testUpdate();

        testCreateProductAttribute();
        testGetAllProductAttibutesInfo();
        testGetProductAttributeInfo();
        testExistsProductAttribute();
        testUpdateProductAttribute();

        testCreatePreDefAttribute();
        testGetAllPreDefAttributesInfo();
        testGetPreDefAttributeInfo();
        testExistsPreDefAttribute();
        testUpdatePreDefAttibute();
        testDeletePreDefAttribute();

        testDeleteProductAttribute();

        testDelete();
    }
}
