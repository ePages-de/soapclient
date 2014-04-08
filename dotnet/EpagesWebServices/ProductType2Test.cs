using System;
using EpagesWebServices.ProductTypeService2Ref;
using NUnit.Framework;
using System.Collections;

namespace EpagesWebServices
{

    /// <summary>
    /// NUnit test for ProductTypeService2
    /// </summary>
    [TestFixture]
    public class ProductType2Test : WebServiceConfiguration
    {
        ProductTypeService2 productTypeService;

        public const string SHOP_PATH = "/Shops/DemoShop/";
        public const string PRODUCTTYPES_PATH         = SHOP_PATH + "ProductTypes/";
        public const string NOT_EXISTING_ALIAS        = "NotExisting";
        public const string NOT_EXISTING_PATH         = PRODUCTTYPES_PATH + NOT_EXISTING_ALIAS;
        public const string NET_TEST1_ALIAS          = "netTest1";
        public const string NET_TEST1_PATH           = PRODUCTTYPES_PATH + NET_TEST1_ALIAS;
        public const string NET_TEST1_NAME_DE        = "netTest1DE";
        public const string NET_TEST1_NAME_EN        = "netTest1EN";
        public const string NET_TEST1_LAYOUT_BUNDLES = "BundlesTable";

        public const string NET_TEST2_ALIAS          = "netTest2";
        public const string NET_TEST2_PATH           = PRODUCTTYPES_PATH + NET_TEST2_ALIAS;
        public const string NET_TEST2_NAME_DE        = "netTest2DE";
        public const string NET_TEST2_NAME_EN        = "netTest2EN";
        public const string NET_TEST2_LAYOUT_BASE    = "ImageRight";

        public const string ATTRIBUTES_PATH     = NET_TEST1_PATH + "/Attributes/";
        public const string ATTRIBUTE1_ALIAS    = "attribute1";
        public const string ATTRIBUTE1_TYPE     = "LocalizedString";
        public const string ATTRIBUTE1_PATH     = ATTRIBUTES_PATH + ATTRIBUTE1_ALIAS;
        public const string ATTRIBUTE1_NAME_DE  = "attribute1DE";
        public const string ATTRIBUTE1_NAME_EN  = "attribute1EN";
        public const string ATTRIBUTE1_DESCR_DE = "attribute1descrDE";
        public const string ATTRIBUTE1_DESCR_EN = "attribute1descrEN";
    
        public const string ATTRIBUTE2_ALIAS    = "attribute2";
        public const string ATTRIBUTE2_PATH     = ATTRIBUTES_PATH + ATTRIBUTE2_ALIAS;
        public const string ATTRIBUTE2_TYPE     = "PreDefString";
        public const string ATTRIBUTE2_NAME_DE  = "attribute2DE";
        public const string ATTRIBUTE2_NAME_EN  = "attribute2EN";
        public const string ATTRIBUTE2_DESCR_DE = "attribute2descrDE";
        public const string ATTRIBUTE2_DESCR_EN = "attribute2descrEN";
    
        public const string PREDEF_ATTRIBUTES_PATH  = ATTRIBUTE2_PATH + "/PreDefAttributes/";
        public const string PREDEF_ATTRIBUTE1_ALIAS = "predef1";
        public const string PREDEF_ATTRIBUTE1_PATH  = PREDEF_ATTRIBUTES_PATH + PREDEF_ATTRIBUTE1_ALIAS;
        public const string PREDEF_ATTRIBUTE1_NAME  = "predef1Name";
        public const string PREDEF_ATTRIBUTE2_ALIAS = "predef2";
        public const string PREDEF_ATTRIBUTE2_PATH  = PREDEF_ATTRIBUTES_PATH + PREDEF_ATTRIBUTE2_ALIAS;
        public const string PREDEF_ATTRIBUTE2_NAME = "predef2Name";


        [SetUp]
        public void Init()
        {
            productTypeService = new ProductTypeService2();
            productTypeService.Credentials = new System.Net.NetworkCredential(WEBSERVICE_LOGIN, WEBSERVICE_PASSWORD);
            productTypeService.PreAuthenticate = true;
            productTypeService.Url = WEBSERVICE_URL;
        }

        /// <summary>
        /// test getBaseProductType
        /// </summary>
        public void testGetBaseProductType() 
        {
            Console.WriteLine("ProductTypeTest: testGetBaseProductType start");
     	
    	    String baseProductType = productTypeService.getBaseProductType();
            Assert.AreEqual(SHOP_PATH + "ProductClass", baseProductType);

            Console.WriteLine("ProductTypeTest: testGetBaseProductType end");
        }

        /// <summary>
        /// test create
        /// </summary>
        public void testCreate()
        {
            Console.WriteLine("ProductTypeTest: testCreate start");

            TCreate_Input create1 = new TCreate_Input();
            create1.Alias = NET_TEST1_ALIAS;
            create1.LayoutContentBundles = NET_TEST1_LAYOUT_BUNDLES;
            TLocalizedValue name1_de = new TLocalizedValue();
            name1_de.LanguageCode = "de";
            name1_de.Value = NET_TEST1_NAME_DE;
            TLocalizedValue name1_en = new TLocalizedValue();
            name1_en.LanguageCode = "en";
            name1_en.Value = NET_TEST1_NAME_EN;
            create1.Name = new TLocalizedValue[] { name1_de, name1_en };

            TCreate_Input create2 = new TCreate_Input();
            create2.Alias = NET_TEST2_ALIAS;
            create2.LayoutContentBase = NET_TEST2_LAYOUT_BASE;
            TLocalizedValue name2_de = new TLocalizedValue();
            name2_de.LanguageCode = "de";
            name2_de.Value = NET_TEST2_NAME_DE;
            TLocalizedValue name2_en = new TLocalizedValue();
            name2_en.LanguageCode = "en";
            name2_en.Value = NET_TEST2_NAME_EN;
            create2.Name = new TLocalizedValue[] { name2_de, name2_en };

            TCreate_Input[] createProductTypes = new TCreate_Input[] { create1, create2 };
            TCreate_Return[] productTypes = productTypeService.create(createProductTypes);

            Assert.AreEqual(createProductTypes.Length, productTypes.Length);

            Assert.AreEqual(NET_TEST1_ALIAS, productTypes[0].Alias);
            Assert.IsNull(productTypes[0].Error);
            Assert.IsTrue(productTypes[0].created);
            Assert.AreEqual(NET_TEST1_PATH, productTypes[0].Path);

            Assert.AreEqual(NET_TEST2_ALIAS, productTypes[1].Alias);
            Assert.IsNull(productTypes[1].Error);
            Assert.IsTrue(productTypes[1].created);
            Assert.AreEqual(NET_TEST2_PATH, productTypes[1].Path);

            Console.WriteLine("ProductTypeTest: testCreate end");
        }

        /// <summary>
        /// test getAllInfo
        /// </summary>
        public void testGetAllInfo()
        {
            Console.WriteLine("ProductTypeTest: testGetAllInfo start");

            String baseProductType = productTypeService.getBaseProductType();
            TGetInfo_Return[] productTypes = productTypeService.getAllInfo(new String[]{}, new String[]{});

            bool javaTest1Found = false, javaTest2Found = false, baseFound = false;
    	    foreach (TGetInfo_Return productType in productTypes) {
                if (productType.Error == null) {
                    Console.WriteLine("testGetAllInfo(): successfully retrieved ProductType: " + productType.Alias);
                    if (productType.Alias.Equals(NET_TEST1_ALIAS)) {
                	    javaTest1Found = true;
                	    Assert.AreEqual(NET_TEST1_LAYOUT_BUNDLES, productType.LayoutContentBundles);
                	    TLocalizedValue[] names = productType.Name;
                	    foreach (TLocalizedValue name in names) {
                		    if (name.LanguageCode.Equals("de")) Assert.AreEqual(NET_TEST1_NAME_DE, name.Value);
                            else if (name.LanguageCode.Equals("en")) Assert.AreEqual(NET_TEST1_NAME_EN, name.Value);
                	    }
                    }
                    else if (productType.Alias.Equals(NET_TEST2_ALIAS)) {
                	    javaTest2Found = true;
                	    Assert.AreEqual(NET_TEST2_LAYOUT_BASE, productType.LayoutContentBase);
                	    TLocalizedValue[] names = productType.Name;
                	    foreach (TLocalizedValue name in names) {
                		    if (name.LanguageCode.Equals("de")) Assert.AreEqual(NET_TEST2_NAME_DE, name.Value);
                		    else if (name.LanguageCode.Equals("en")) Assert.AreEqual(NET_TEST2_NAME_EN, name.Value);
                	    }
                    }
                    else if (baseProductType.Equals(productType.Path)) baseFound = true;
                } 
            }
    	    Assert.IsTrue(javaTest1Found);
            Assert.IsTrue(javaTest2Found);
            Assert.IsTrue(baseFound);

            Console.WriteLine("ProductTypeTest: testGetAllInfo end");
        }

        /// <summary>
        /// test getInfo
        /// </summary>
        public void testGetInfo()
        {
            Console.WriteLine("ProductTypeTest: testGetInfo start");

    	    TGetInfo_Return[] productTypes = productTypeService.getInfo(
    			    new String[]{NET_TEST1_PATH, NET_TEST2_PATH, NOT_EXISTING_PATH},
    			    new String[]{"WebUrl"}, 
    			    new String[]{"de", "en"}
    	    );

    	    // check first created test product type
    	    Assert.AreEqual(NET_TEST1_PATH, productTypes[0].Path);
    	    Assert.IsNull(productTypes[0].Error);
    	    Assert.AreEqual(NET_TEST1_ALIAS, productTypes[0].Alias);
    	    Assert.AreEqual(NET_TEST1_LAYOUT_BUNDLES, productTypes[0].LayoutContentBundles);
    	    TLocalizedValue[] names = productTypes[0].Name;
    	    Assert.AreEqual(2, names.Length);
    	    foreach (TLocalizedValue name in names) {
    		    if (name.LanguageCode.Equals("de")) Assert.AreEqual(NET_TEST1_NAME_DE, name.Value);
    		    else if (name.LanguageCode.Equals("en")) Assert.AreEqual(NET_TEST1_NAME_EN, name.Value);
    	    }
    	    TAttribute[] attributes = productTypes[0].Attributes;
    	    Assert.AreEqual(1, attributes.Length);
    	    Assert.AreEqual("WebUrl", attributes[0].Name);
    	    Assert.IsNotNull(attributes[0].Value);

    	    // check second created test product type
    	    Assert.AreEqual(NET_TEST2_PATH, productTypes[1].Path);
    	    Assert.IsNull(productTypes[1].Error);
    	    Assert.AreEqual(NET_TEST2_ALIAS, productTypes[1].Alias);
    	    Assert.AreEqual(NET_TEST2_LAYOUT_BASE, productTypes[1].LayoutContentBase);
    	    names = productTypes[1].Name;
    	    Assert.AreEqual(2, names.Length);
    	    foreach (TLocalizedValue name in names) {
    		    if (name.LanguageCode.Equals("de")) Assert.AreEqual(NET_TEST2_NAME_DE, name.Value);
    		    else if (name.LanguageCode.Equals("en")) Assert.AreEqual(NET_TEST2_NAME_EN, name.Value);
    	    }
    	    attributes = productTypes[1].Attributes;
    	    Assert.AreEqual(1, attributes.Length);
    	    Assert.AreEqual("WebUrl", attributes[0].Name);
    	    Assert.IsNotNull(attributes[0].Value);
        	
    	    // third element must be error
    	    Assert.IsNotNull(productTypes[2].Error);

            Console.WriteLine("ProductTypeTest: testGetInfo end");
        }

        /// <summary>
        /// test exists
        /// </summary>
        public void testExists()
        {
            Console.WriteLine("ProductTypeTest: testExists start");

            TExists_Return[] productTypes = productTypeService.exists(new String[] {
    			    NET_TEST1_PATH, NET_TEST2_PATH, NOT_EXISTING_PATH
    	    });
    	    foreach (TExists_Return productType in productTypes) {
    		    Assert.IsNull(productType.Error);
    	    }
    	    Assert.AreEqual(3, productTypes.Length);
    	    Assert.AreEqual(NET_TEST1_PATH, productTypes[0].Path);
    	    Assert.IsTrue(productTypes[0].exists);
    	    Assert.AreEqual(NET_TEST2_PATH, productTypes[1].Path);
    	    Assert.IsTrue(productTypes[1].exists);
    	    Assert.AreEqual(NOT_EXISTING_PATH, productTypes[2].Path);
    	    Assert.IsFalse(productTypes[2].exists);

            Console.WriteLine("ProductTypeTest: testExists end");
        }

        /// <summary>
        /// test update
        /// </summary>
        public void testUpdate()
        {
            Console.WriteLine("ProductTypeTest: testUpdate start");

            TUpdate_Input update1 = new TUpdate_Input();
            update1.Path = NET_TEST1_PATH;
            update1.LayoutContentBundles = "BundlesTable";
            TLocalizedValue name1_de = new TLocalizedValue();
            name1_de.LanguageCode = "de";
            name1_de.Value = NET_TEST1_NAME_DE + "updated";
            update1.Name = new TLocalizedValue[] { name1_de };

            TUpdate_Return[] productTypes = productTypeService.update(new TUpdate_Input[] { update1});
            Assert.AreEqual(1, productTypes.Length);
            Assert.AreEqual(NET_TEST1_PATH, productTypes[0].Path);
            Assert.IsNull(productTypes[0].Error);
            Assert.IsTrue(productTypes[0].updated);

            TGetInfo_Return[] result = productTypeService.getInfo(
                new String[] { NET_TEST1_PATH },
                new String[] { },
                new String[] { "de", "en" });

            Assert.AreEqual(1, result.Length);
            Assert.AreEqual(NET_TEST1_PATH, result[0].Path);
            Assert.IsNull(result[0].Error);
            Assert.AreEqual(NET_TEST1_ALIAS, result[0].Alias);
            Assert.AreEqual("BundlesTable", result[0].LayoutContentBundles);
            TLocalizedValue[] names = result[0].Name;
            Assert.AreEqual(2, names.Length);
            Assert.AreEqual("de", names[0].LanguageCode);
            Assert.AreEqual(NET_TEST1_NAME_DE + "updated", names[0].Value);
            Assert.AreEqual("en", names[1].LanguageCode);
            Assert.AreEqual(NET_TEST1_NAME_EN, names[1].Value);
            
            Console.WriteLine("ProductTypeTest: testUpdate end");
        }

        /// <summary>
        /// test delete
        /// </summary>
        public void testDelete()
        {
            Console.WriteLine("ProductTypeTest: testDelete start");

            TDelete_Return[] result = productTypeService.delete(new String[] {
    		NET_TEST1_PATH, NET_TEST2_PATH, NOT_EXISTING_PATH
    	});
            Assert.AreEqual(3, result.Length);
            Assert.AreEqual(NET_TEST1_PATH, result[0].Path);
            Assert.IsNull(result[0].Error);
            Assert.IsTrue(result[0].deleted);

            Assert.AreEqual(NET_TEST2_PATH, result[1].Path);
            Assert.IsNull(result[1].Error);
            Assert.IsTrue(result[1].deleted);

            Assert.AreEqual(NOT_EXISTING_PATH, result[2].Path);
            Assert.IsNotNull(result[2].Error);

            TExists_Return[] existsResult = productTypeService.exists(new String[] {
    		NET_TEST1_PATH, NET_TEST2_PATH
    	});
            Assert.AreEqual(2, existsResult.Length);
            Assert.AreEqual(NET_TEST1_PATH, existsResult[0].Path);
            Assert.IsNull(existsResult[0].Error);
            Assert.IsFalse(existsResult[0].exists);

            Assert.AreEqual(NET_TEST2_PATH, existsResult[1].Path);
            Assert.IsNull(existsResult[1].Error);
            Assert.IsFalse(existsResult[1].exists);
            Console.WriteLine("ProductTypeTest: testDelete end");
        }

        /// <summary>
        /// test createProductAttribute
        /// </summary>
        public void testCreateProductAttribute()
        {
            Console.WriteLine("ProductTypeTest: testCreateProductAttribute start");

    	    TCreateProductAttribute_Input in1 = new TCreateProductAttribute_Input();
    	    in1.Alias = ATTRIBUTE1_ALIAS;
    	    in1.Type = ATTRIBUTE1_TYPE;
            
            TLocalizedValue Name1DE = new TLocalizedValue();
            Name1DE.LanguageCode = "de";
            Name1DE.Value = ATTRIBUTE1_NAME_DE;
            TLocalizedValue Name1EN = new TLocalizedValue();
            Name1EN.LanguageCode = "en";
            Name1EN.Value = ATTRIBUTE1_NAME_EN;
            in1.Name = new TLocalizedValue[] { Name1DE, Name1EN };

            TLocalizedValue Descr1DE = new TLocalizedValue();
            Descr1DE.LanguageCode = "de";
            Descr1DE.Value = ATTRIBUTE1_DESCR_DE;
            TLocalizedValue Descr1EN = new TLocalizedValue();
            Descr1EN.LanguageCode = "en";
            Descr1EN.Value = ATTRIBUTE1_DESCR_EN;
            in1.Description = new TLocalizedValue[] { Descr1DE, Descr1EN };

            in1.IsVisible = true;
            in1.IsVisibleSpecified = true;
    	    in1.IsHTML = true;
            in1.IsHTMLSpecified = true;
    	    in1.Position = "8192";

    	    TCreateProductAttribute_Input in2 = new TCreateProductAttribute_Input();
    	    in2.Alias = ATTRIBUTE2_ALIAS;
    	    in2.Type = ATTRIBUTE2_TYPE;

            TLocalizedValue Name2DE = new TLocalizedValue();
            Name2DE.LanguageCode = "de";
            Name2DE.Value = ATTRIBUTE2_NAME_DE;
            TLocalizedValue Name2EN = new TLocalizedValue();
            Name2EN.LanguageCode = "en";
            Name2EN.Value = ATTRIBUTE2_NAME_EN;
            in2.Name = new TLocalizedValue[] { Name2DE, Name2EN };

            TLocalizedValue Descr2DE = new TLocalizedValue();
            Descr2DE.LanguageCode = "de";
            Descr2DE.Value = ATTRIBUTE2_DESCR_DE;
            TLocalizedValue Descr2EN = new TLocalizedValue();
            Descr2EN.LanguageCode = "en";
            Descr2EN.Value = ATTRIBUTE2_DESCR_EN;
            in2.Description = new TLocalizedValue[] { Descr2DE, Descr2EN };
            
    	    in2.Position = "4096";

    	    TCreateProductAttribute_Input in3 = new TCreateProductAttribute_Input();
    	    in3.Alias = "CurrencyID"; // reserved attribute alias
    	    in3.Type = ATTRIBUTE1_TYPE;

    	    TCreateProductAttribute_Input[] input = {in1, in2, in3};
    	    TCreateProductAttribute_Return[] attributes = productTypeService.createProductAttribute(
    		    NET_TEST1_PATH, input
    	    );
    	    Assert.IsNotNull(attributes);
    	    Assert.AreEqual(input.Length, attributes.Length);
    	    Assert.AreEqual(ATTRIBUTE1_ALIAS, attributes[0].Alias);
    	    Assert.IsNull(attributes[0].Error);
    	    Assert.AreEqual(ATTRIBUTE1_PATH, attributes[0].Path);
    	    Assert.IsTrue(attributes[0].created);
    	    Assert.AreEqual(ATTRIBUTE2_ALIAS, attributes[1].Alias);
    	    Assert.IsNull(attributes[1].Error);
    	    Assert.AreEqual(ATTRIBUTE2_PATH, attributes[1].Path);
    	    Assert.IsTrue(attributes[1].created);
    	    Assert.AreEqual("CurrencyID", attributes[2].Alias);
    	    Assert.IsNotNull(attributes[2].Error);

            Console.WriteLine("ProductTypeTest: testCreateProductAttribute end");
        }

        /// <summary>
        /// test getAllProductAttibutesInfo
        /// </summary>
        public void testGetAllProductAttibutesInfo()
        {
            Console.WriteLine("ProductTypeTest: testGetAllProductAttibutesInfo start");

    	TGetProductAttributeInfo_Return[] result = productTypeService.getAllProductAttributesInfo(
   			NET_TEST1_PATH,
       		new String[]{"de", "en"}
       	);

    	bool attribute1Found = false, attribute2Found = false;
    	foreach (TGetProductAttributeInfo_Return attribute in result) {
            Assert.IsNull(attribute.Error);
    		if (ATTRIBUTE1_ALIAS.Equals(attribute.Alias)) {
    			attribute1Found = true;
    			Assert.AreEqual(ATTRIBUTE1_PATH, attribute.Path);
    			Assert.AreEqual(ATTRIBUTE1_TYPE, attribute.Type);
    			Assert.IsTrue(attribute.IsVisible);
    			Assert.IsTrue(attribute.IsHTML);
    			TLocalizedValue[] names = attribute.Name;
    			foreach (TLocalizedValue name in names) {
    				if ("de".Equals(name.LanguageCode)) Assert.AreEqual(ATTRIBUTE1_NAME_DE, name.Value);
    				else if ("en".Equals(name.LanguageCode)) Assert.AreEqual(ATTRIBUTE1_NAME_EN, name.Value);
    			}
    			names = attribute.Description;
    			foreach (TLocalizedValue name in names) {
    				if ("de".Equals(name.LanguageCode)) Assert.AreEqual(ATTRIBUTE1_DESCR_DE, name.Value);
    				else if ("en".Equals(name.LanguageCode)) Assert.AreEqual(ATTRIBUTE1_DESCR_EN, name.Value);
    			}
    		}
    		if (ATTRIBUTE2_ALIAS.Equals(attribute.Alias)) {
    			attribute2Found = true;
    			Assert.AreEqual(ATTRIBUTE2_PATH, attribute.Path);
    			Assert.AreEqual(ATTRIBUTE2_TYPE, attribute.Type);
    			Assert.IsFalse(attribute.IsVisible);
    			Assert.IsFalse(attribute.IsHTML);
    			TLocalizedValue[] names = attribute.Name;
    			foreach (TLocalizedValue name in names) {
    				if ("de".Equals(name.LanguageCode)) Assert.AreEqual(ATTRIBUTE2_NAME_DE, name.Value);
    				else if ("en".Equals(name.LanguageCode)) Assert.AreEqual(ATTRIBUTE2_NAME_EN, name.Value);
    			}
    			names = attribute.Description;
    			foreach (TLocalizedValue name in names) {
    				if ("de".Equals(name.LanguageCode)) Assert.AreEqual(ATTRIBUTE2_DESCR_DE, name.Value);
    				else if ("en".Equals(name.LanguageCode)) Assert.AreEqual(ATTRIBUTE2_DESCR_EN, name.Value);
    			}
    		}
    	}
    	Assert.IsTrue(attribute1Found);
    	Assert.IsTrue(attribute2Found);
            Console.WriteLine("ProductTypeTest: testGetAllProductAttibutesInfo end");
        }

        /// <summary>
        /// test getProductAttributeInfo
        /// </summary>
        public void testGetProductAttributeInfo()
        {
            Console.WriteLine("ProductTypeTest: testGetProductAttributeInfo start");

            TGetProductAttributeInfo_Return[] attributes = productTypeService.getProductAttributeInfo(
                NET_TEST1_PATH,
                new String[] { ATTRIBUTE1_ALIAS, ATTRIBUTE2_ALIAS, NOT_EXISTING_ALIAS },
                new String[] { "en", "de" }
            );
            Assert.IsNotNull(attributes);
            Assert.AreEqual(3, attributes.Length);

            Assert.AreEqual(ATTRIBUTE1_ALIAS, attributes[0].Alias);
            Assert.IsNull(attributes[0].Error);
            Assert.AreEqual(ATTRIBUTE1_PATH, attributes[0].Path);
            Assert.AreEqual(ATTRIBUTE1_TYPE, attributes[0].Type);
            Assert.IsTrue(attributes[0].IsVisible);
            Assert.IsTrue(attributes[0].IsHTML);
            Assert.AreEqual(0, Int32.Parse(attributes[0].Position) % 10);

            Assert.AreEqual(ATTRIBUTE2_ALIAS, attributes[1].Alias);
            Assert.IsNull(attributes[1].Error);
            Assert.AreEqual(ATTRIBUTE2_PATH, attributes[1].Path);
            Assert.AreEqual(ATTRIBUTE2_TYPE, attributes[1].Type);
            Assert.IsFalse(attributes[1].IsVisible);
            Assert.IsFalse(attributes[1].IsHTML);            
            Assert.AreEqual(0, Int32.Parse(attributes[1].Position) % 10);

            Assert.IsTrue(Int32.Parse(attributes[0].Position) > Int32.Parse(attributes[1].Position));

            Assert.IsNotNull(attributes[2].Error);
            
            Console.WriteLine("ProductTypeTest: testGetProductAttributeInfo end");
        }

        /// <summary>
        /// test existsProductAttribute
        /// </summary>
        public void testExistsProductAttribute()
        {
            Console.WriteLine("ProductTypeTest: testExistsProductAttribute start");

            TExistsProductAttribute_Return[] attributes = productTypeService.existsProductAttribute(
                NET_TEST1_PATH,
                new String[] { ATTRIBUTE1_ALIAS, ATTRIBUTE2_ALIAS, NOT_EXISTING_ALIAS }
            );
            Assert.IsNotNull(attributes);
            Assert.AreEqual(3, attributes.Length);

            Assert.AreEqual(ATTRIBUTE1_ALIAS, attributes[0].Alias);
            Assert.IsTrue(attributes[0].exists);
            Assert.AreEqual(ATTRIBUTE2_ALIAS, attributes[1].Alias);
            Assert.IsTrue(attributes[1].exists);
            Assert.AreEqual(NOT_EXISTING_ALIAS, attributes[2].Alias);
            Assert.IsFalse(attributes[2].exists);

            Console.WriteLine("ProductTypeTest: testExistsProductAttribute end");
        }

        /// <summary>
        /// test deleteProductAttribute
        /// </summary>
        public void testDeleteProductAttribute()
        {
            Console.WriteLine("ProductTypeTest: testDeleteProductAttribute start");

            TDeleteProductAttribute_Return[] attributes = productTypeService.deleteProductAttribute(
                    NET_TEST1_PATH, new String[] { ATTRIBUTE1_ALIAS, NOT_EXISTING_ALIAS }
            );
            Assert.IsNotNull(attributes);
            Assert.AreEqual(2, attributes.Length);

            Assert.AreEqual(ATTRIBUTE1_ALIAS, attributes[0].Alias);
            Assert.IsNull(attributes[0].Error);
            Assert.IsTrue(attributes[0].deleted);

            Assert.AreEqual(NOT_EXISTING_ALIAS, attributes[1].Alias);
            Assert.IsNotNull(attributes[1].Error);

            TExistsProductAttribute_Return[] attributes2 = productTypeService.existsProductAttribute(
                    NET_TEST1_PATH,
                    new String[] { ATTRIBUTE1_ALIAS }
            );
            Assert.IsNotNull(attributes2);
            Assert.AreEqual(1, attributes2.Length);
            Assert.AreEqual(ATTRIBUTE1_ALIAS, attributes2[0].Alias);
            Assert.IsFalse(attributes2[0].exists);
            Console.WriteLine("ProductTypeTest: testDeleteProductAttribute end");
        }

        /// <summary>
        /// test updateProductAttribute
        /// </summary>
        public void testUpdateProductAttribute()
        {
            Console.WriteLine("ProductTypeTest: testUpdateProductAttribute start");

    	    TUpdateProductAttribute_Input in1 = new TUpdateProductAttribute_Input();
    	    in1.Alias = ATTRIBUTE1_ALIAS;
    	    in1.IsHTML = false;
            in1.IsHTMLSpecified = true;
            in1.Position = "1";

            TLocalizedValue descr1EN = new TLocalizedValue();
            descr1EN.LanguageCode = "en";
            descr1EN.Value = ATTRIBUTE1_DESCR_EN + "updated";
            in1.Description = new TLocalizedValue[]{descr1EN};

    	    TUpdateProductAttribute_Input in2 = new TUpdateProductAttribute_Input();
    	    in2.Alias = ATTRIBUTE2_ALIAS;
    	    in2.IsVisible = true;
            in2.IsVisibleSpecified = true;

            TLocalizedValue name2DE = new TLocalizedValue();
            name2DE.LanguageCode = "de";
            name2DE.Value = ATTRIBUTE2_NAME_DE + "updated";
    	    in2.Name = new TLocalizedValue[]{name2DE};

    	    TUpdateProductAttribute_Input in3 = new TUpdateProductAttribute_Input();
    	    in3.Alias = NOT_EXISTING_ALIAS;

    	    TUpdateProductAttribute_Return[] attributes = productTypeService.updateProductAttribute(
    		    NET_TEST1_PATH, new TUpdateProductAttribute_Input[]{in1, in2, in3}
    	    );

    	    Assert.IsNotNull(attributes);
    	    Assert.AreEqual(3, attributes.Length);

    	    Assert.AreEqual(ATTRIBUTE1_ALIAS, attributes[0].Alias);
    	    Assert.IsNull(attributes[0].Error);
    	    Assert.IsTrue(attributes[0].updated);

    	    Assert.AreEqual(ATTRIBUTE2_ALIAS, attributes[1].Alias);
    	    Assert.IsNull(attributes[1].Error);
    	    Assert.IsTrue(attributes[1].updated);

    	    Assert.AreEqual(NOT_EXISTING_ALIAS, attributes[2].Alias);
    	    Assert.IsNotNull(attributes[2].Error);

    	    TGetProductAttributeInfo_Return[] attributes2 = productTypeService.getProductAttributeInfo(
        		    NET_TEST1_PATH,
        		    new String[]{ATTRIBUTE1_ALIAS, ATTRIBUTE2_ALIAS},
        		    new String[]{"en", "de"}
        	    );
            Assert.IsNotNull(attributes2);
       	    Assert.AreEqual(2, attributes2.Length);

    	    Assert.AreEqual(ATTRIBUTE1_ALIAS, attributes2[0].Alias);
            Assert.IsNull(attributes2[0].Error);
    	    Assert.AreEqual(ATTRIBUTE1_PATH, attributes2[0].Path);
    	    Assert.IsTrue(attributes2[0].IsVisible);
    	    Assert.IsFalse(attributes2[0].IsHTML);
    	    Assert.AreEqual(0, Int32.Parse(attributes2[0].Position) % 10);
    	    TLocalizedValue[] descriptions = attributes2[0].Description;
    	    Assert.AreEqual(2, descriptions.Length);
		    foreach (TLocalizedValue description in descriptions) {
			    if ("de".Equals(description.LanguageCode)) Assert.AreEqual(ATTRIBUTE1_DESCR_DE, description.Value);
			    else if ("en".Equals(description.LanguageCode)) Assert.AreEqual(ATTRIBUTE1_DESCR_EN + "updated", description.Value);
		    }

    	    Assert.AreEqual(ATTRIBUTE2_ALIAS, attributes2[1].Alias);
            Assert.IsNull(attributes2[1].Error);
    	    Assert.AreEqual(ATTRIBUTE2_PATH, attributes2[1].Path);
    	    Assert.IsTrue(attributes2[1].IsVisible);
    	    Assert.IsFalse(attributes2[1].IsHTML);
    	    Assert.AreEqual(0, Int32.Parse(attributes2[1].Position) % 10);
    	    TLocalizedValue[] names = attributes2[1].Name;
    	    Assert.AreEqual(2, names.Length);
		    foreach (TLocalizedValue name in names) {
			    if ("de".Equals(name.LanguageCode)) Assert.AreEqual(ATTRIBUTE2_NAME_DE + "updated", name.Value);
			    else if ("en".Equals(name.LanguageCode)) Assert.AreEqual(ATTRIBUTE2_NAME_EN, name.Value);
		    }
    	    Assert.IsTrue(Int32.Parse(attributes2[0].Position) < Int32.Parse(attributes2[1].Position));

            Console.WriteLine("ProductTypeTest: testUpdateProductAttribute end");
        }

        /// <summary>
        /// test createPreDefAttribute
        /// </summary>
        public void testCreatePreDefAttribute()
        {
            Console.WriteLine("ProductTypeTest: testCreatePreDefAttribute start");

            TCreatePreDefAttribute_Input in1 = new TCreatePreDefAttribute_Input();
            in1.Alias = PREDEF_ATTRIBUTE1_ALIAS;
            in1.ValueString = PREDEF_ATTRIBUTE1_NAME;
            in1.Position = "32";

            TCreatePreDefAttribute_Input in2 = new TCreatePreDefAttribute_Input();
            in2.Alias = PREDEF_ATTRIBUTE2_ALIAS;
            in2.ValueString = PREDEF_ATTRIBUTE2_NAME;
            in2.Position = "33";

            TCreatePreDefAttribute_Input in3 = new TCreatePreDefAttribute_Input();
            in3.Alias = PREDEF_ATTRIBUTE2_ALIAS;

            TCreatePreDefAttribute_Return[] predefs = productTypeService.createPreDefAttribute(
                    ATTRIBUTE2_PATH,
                    new TCreatePreDefAttribute_Input[] { in1, in2, in3 }
            );

            Assert.IsNotNull(predefs);
            Assert.AreEqual(3, predefs.Length);

            Assert.AreEqual(PREDEF_ATTRIBUTE1_ALIAS, predefs[0].Alias);
            Assert.IsNull(predefs[0].Error);
            Assert.AreEqual(PREDEF_ATTRIBUTE1_PATH, predefs[0].Path);
            Assert.IsTrue(predefs[0].created);

            Assert.AreEqual(PREDEF_ATTRIBUTE2_ALIAS, predefs[1].Alias);
            Assert.IsNull(predefs[1].Error);
            Assert.AreEqual(PREDEF_ATTRIBUTE2_PATH, predefs[1].Path);
            Assert.IsTrue(predefs[1].created);

            Assert.AreEqual(PREDEF_ATTRIBUTE2_ALIAS, predefs[2].Alias);
            Assert.IsNotNull(predefs[2].Error);

            Console.WriteLine("ProductTypeTest: testCreatePreDefAttribute end");
        }

        /// <summary>
        /// test getAllPreDefAttributesInfo
        /// </summary>
        public void testGetAllPreDefAttributesInfo()
        {
            Console.WriteLine("ProductTypeTest: testGetAllPreDefAttributesInfo start");

            TGetPreDefAttributeInfo_Return[] predefs = productTypeService.getAllPreDefAttributesInfo(
                ATTRIBUTE2_PATH, new String[] { }
            );
            Assert.IsNotNull(predefs);

            bool predef1Found = false, predef2Found = false;
            foreach (TGetPreDefAttributeInfo_Return predef in predefs)
            {
                if (PREDEF_ATTRIBUTE1_ALIAS.Equals(predef.Alias))
                {
                    predef1Found = true;
                    Assert.AreEqual(PREDEF_ATTRIBUTE1_PATH, predef.Path);
                    Assert.AreEqual(PREDEF_ATTRIBUTE1_NAME, predef.ValueString);
                    Assert.IsNull(predef.ValueLocString);
                }
                else if (PREDEF_ATTRIBUTE2_ALIAS.Equals(predef.Alias))
                {
                    predef2Found = true;
                    Assert.AreEqual(PREDEF_ATTRIBUTE2_PATH, predef.Path);
                    Assert.AreEqual(PREDEF_ATTRIBUTE2_NAME, predef.ValueString);
                    Assert.IsNull(predef.ValueLocString);
                }
            }
            Assert.IsTrue(predef1Found);
            Assert.IsTrue(predef2Found);

            Console.WriteLine("ProductTypeTest: testGetAllPreDefAttributesInfo end");
        }

        /// <summary>
        /// test getPreDefAttributeInfo
        /// </summary>
        public void testGetPreDefAttributeInfo()
        {
            Console.WriteLine("ProductTypeTest: testGetPreDefAttributeInfo start");

            TGetPreDefAttributeInfo_Return[] predefs = productTypeService.getPreDefAttributeInfo(
                ATTRIBUTE2_PATH,
                new String[] { PREDEF_ATTRIBUTE1_ALIAS, PREDEF_ATTRIBUTE2_ALIAS, NOT_EXISTING_ALIAS },
                new String[] { }
            );
            Assert.IsNotNull(predefs);
            Assert.AreEqual(3, predefs.Length);

            Assert.AreEqual(PREDEF_ATTRIBUTE1_ALIAS, predefs[0].Alias);
            Assert.IsNull(predefs[0].Error);
            Assert.AreEqual(PREDEF_ATTRIBUTE1_PATH, predefs[0].Path);
            Assert.AreEqual(PREDEF_ATTRIBUTE1_NAME, predefs[0].ValueString);
            Assert.IsNull(predefs[0].ValueLocString);
            Assert.AreEqual(0, Int32.Parse(predefs[0].Position) % 10);

            Assert.AreEqual(PREDEF_ATTRIBUTE2_ALIAS, predefs[1].Alias);
            Assert.IsNull(predefs[1].Error);
            Assert.AreEqual(PREDEF_ATTRIBUTE2_PATH, predefs[1].Path);
            Assert.AreEqual(PREDEF_ATTRIBUTE2_NAME, predefs[1].ValueString);
            Assert.IsNull(predefs[1].ValueLocString);
            Assert.AreEqual(0, Int32.Parse(predefs[1].Position) % 10);

            Assert.IsTrue(Int32.Parse(predefs[0].Position) < Int32.Parse(predefs[1].Position));

            Assert.AreEqual(NOT_EXISTING_ALIAS, predefs[2].Alias);
            Assert.IsNotNull(predefs[2].Error);

            Console.WriteLine("ProductTypeTest: testGetPreDefAttributeInfo end");
        }

        /// <summary>
        /// test existsPreDefAttribute
        /// </summary>
        public void testExistsPreDefAttribute()
        {
            Console.WriteLine("ProductTypeTest: testExistsPreDefAttribute start");

            TExistsPreDefAttribute_Return[] predefs = productTypeService.existsPreDefAttribute(
                ATTRIBUTE2_PATH,
                new String[] { PREDEF_ATTRIBUTE1_ALIAS, PREDEF_ATTRIBUTE2_ALIAS, NOT_EXISTING_ALIAS }
            );
            Assert.IsNotNull(predefs);
            Assert.AreEqual(3, predefs.Length);

            Assert.AreEqual(PREDEF_ATTRIBUTE1_ALIAS, predefs[0].Alias);
            Assert.IsTrue(predefs[0].exists);

            Assert.AreEqual(PREDEF_ATTRIBUTE2_ALIAS, predefs[1].Alias);
            Assert.IsTrue(predefs[1].exists);

            Assert.AreEqual(NOT_EXISTING_ALIAS, predefs[2].Alias);
            Assert.IsFalse(predefs[2].exists);

            Console.WriteLine("ProductTypeTest: testExistsPreDefAttribute end");
        }

        /// <summary>
        /// test updatePreDefAttibute
        /// </summary>
        public void testUpdatePreDefAttibute()
        {
            Console.WriteLine("ProductTypeTest: testUpdatePreDefAttibute start");

            TUpdatePreDefAttribute_Input in1 = new TUpdatePreDefAttribute_Input();
            in1.Alias = PREDEF_ATTRIBUTE1_ALIAS;
            in1.ValueString = PREDEF_ATTRIBUTE1_NAME + "updated";
            in1.Position = "99999";

            TUpdatePreDefAttribute_Input in2 = new TUpdatePreDefAttribute_Input();
            in2.Alias = NOT_EXISTING_ALIAS;

            TUpdatePreDefAttribute_Return[] predefs = productTypeService.updatePreDefAttribute(
                ATTRIBUTE2_PATH,
                new TUpdatePreDefAttribute_Input[] { in1, in2 }
            );
            Assert.IsNotNull(predefs);
            Assert.AreEqual(2, predefs.Length);

            Assert.AreEqual(PREDEF_ATTRIBUTE1_ALIAS, predefs[0].Alias);
            Assert.IsNull(predefs[0].Error);
            Assert.IsTrue(predefs[0].updated);

            Assert.AreEqual(NOT_EXISTING_ALIAS, predefs[1].Alias);
            Assert.IsNotNull(predefs[1].Error);

            TGetPreDefAttributeInfo_Return[] predefs2 = productTypeService.getPreDefAttributeInfo(
                ATTRIBUTE2_PATH,
                new String[] { PREDEF_ATTRIBUTE1_ALIAS, PREDEF_ATTRIBUTE2_ALIAS },
                new String[] { }
            );
            Assert.IsNotNull(predefs2);
            Assert.AreEqual(2, predefs2.Length);

            Assert.AreEqual(PREDEF_ATTRIBUTE1_ALIAS, predefs2[0].Alias);
            Assert.IsNull(predefs2[0].Error);
            Assert.AreEqual(PREDEF_ATTRIBUTE1_NAME + "updated", predefs2[0].ValueString);
            Assert.IsNull(predefs2[0].ValueLocString);
            Assert.AreEqual(0, Int32.Parse(predefs2[0].Position) % 10);

            Assert.AreEqual(PREDEF_ATTRIBUTE2_ALIAS, predefs2[1].Alias);
            Assert.IsNull(predefs2[1].Error);
            Assert.AreEqual(PREDEF_ATTRIBUTE2_NAME, predefs2[1].ValueString);
            Assert.IsNull(predefs2[1].ValueLocString);
            Assert.AreEqual(0, Int32.Parse(predefs2[1].Position) % 10);

            Assert.IsTrue(Int32.Parse(predefs2[0].Position) > Int32.Parse(predefs2[1].Position));

            Console.WriteLine("ProductTypeTest: testUpdatePreDefAttibute end");
        }

        /// <summary>
        /// test deletePreDefAttribute
        /// </summary>
        public void testDeletePreDefAttribute()
        {
            Console.WriteLine("ProductTypeTest: testDeletePreDefAttribute start");
            TDeletePreDefAttribute_Return[] predefs = productTypeService.deletePreDefAttribute(
                ATTRIBUTE2_PATH,
                new String[] { PREDEF_ATTRIBUTE2_ALIAS, NOT_EXISTING_ALIAS }
            );
            Assert.IsNotNull(predefs);
            Assert.AreEqual(2, predefs.Length);

            Assert.AreEqual(PREDEF_ATTRIBUTE2_ALIAS, predefs[0].Alias);
            Assert.IsNull(predefs[0].Error);
            Assert.IsTrue(predefs[0].deleted);

            Assert.AreEqual(NOT_EXISTING_ALIAS, predefs[1].Alias);
            Assert.IsNotNull(predefs[1].Error);

            TExistsPreDefAttribute_Return[] predefs2 = productTypeService.existsPreDefAttribute(
                ATTRIBUTE2_PATH, new String[] { PREDEF_ATTRIBUTE2_ALIAS }
            );
            Assert.IsNotNull(predefs2);
            Assert.AreEqual(1, predefs2.Length);

            Assert.AreEqual(PREDEF_ATTRIBUTE2_ALIAS, predefs2[0].Alias);
            Assert.IsFalse(predefs2[0].exists);
            Console.WriteLine("ProductTypeTest: testDeletePreDefAttribute end");
        }

        /// <summary>
        /// test suite with all tests in correct order
        /// </summary>
        [Test]
        public void runAllTests()
        {
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

}
