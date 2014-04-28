package de.epages.ws.featurepack;

import static de.epages.ws.common.AssertNoError.assertNoError;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import org.junit.ClassRule;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.rules.ExternalResource;
import org.junit.runners.MethodSorters;

import de.epages.ws.ProviderWebServiceTestConfiguration;
import de.epages.ws.common.model.TLocalizedValue;
import de.epages.ws.featurepack.model.TCreate_Input;
import de.epages.ws.featurepack.model.TCreate_Return;
import de.epages.ws.featurepack.model.TDelete_Return;
import de.epages.ws.featurepack.model.TFeature;
import de.epages.ws.featurepack.model.TGetInfo_Return;
import de.epages.ws.featurepack.model.TUpdate_Input;
import de.epages.ws.featurepack.model.TUpdate_Return;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FeaturePackServiceTest {

    private static final String FOLDER = "FeaturePacks/";

    private static final FeaturePackServiceClient service = new FeaturePackServiceClientImpl(new ProviderWebServiceTestConfiguration());

    private static final TCreate_Input newItem = new TCreate_Input();

    private static final TUpdate_Input updateItem = new TUpdate_Input();

    @ClassRule
    public static ExternalResource externalObjects = new ExternalResource() {
        protected void before() throws Throwable {
            newItem.setAlias("JavaFP1");
            newItem.setName(new TLocalizedValue[] { new TLocalizedValue("en", "name english") });
            newItem.setDescription(new TLocalizedValue[] { new TLocalizedValue("en", "desc english")});
            newItem.setAllowMax(BigInteger.ONE);
            newItem.setIsActive(true);
            newItem.setFeatures(new TFeature[] { new TFeature("/FeatureRefs/Products", BigInteger.ONE ) });

            updateItem.setPath(FOLDER + newItem.getAlias());
            updateItem.setIsActive(false);
            updateItem.setName(new TLocalizedValue[] { new TLocalizedValue("en", "name english updated") });
            updateItem.setDescription(new TLocalizedValue[] { new TLocalizedValue("en", "desc english updated")});

            cleanUp();
        }

        protected void after() {
            cleanUp();
        }

        protected void cleanUp() {
            if (itemExists()) {
                service.delete(new String[] { FOLDER + newItem.getAlias() });
            }
        }
    };

    private static Boolean itemExists() {
        return service.exists(new String[] { FOLDER + newItem.getAlias() })[0].getExists();
    }

    @Test
    public void test01_Create() {
        TCreate_Return[] results = service.create(new TCreate_Input[] { newItem });
        assertEquals(1, results.length);

        TCreate_Return result0 = results[0];
        assertNoError(result0.getError());
        assertEquals(newItem.getAlias(), result0.getAlias());
        assertTrue(result0.getCreated());
        assertTrue(itemExists());
    }

    @Test
    public void test02_GetInfoBeforeUpdate() {
        if(!itemExists()) {
            test01_Create();
        }
        TGetInfo_Return[] results = service.getInfo(new String[] { FOLDER + newItem.getAlias() }, new String[0], new String[] { "en" });
        assertEquals(1, results.length);

        TGetInfo_Return result0 = results[0];
        assertNoError(result0.getError());
        assertEquals(newItem.getName()[0].getValue(), result0.getName()[0].getValue());
        assertEquals(newItem.getDescription()[0].getValue(), result0.getDescription()[0].getValue());
        assertEquals(newItem.getIsActive(), result0.getIsActive());
    }

    @Test
    public void test03_Update() {
        if(!itemExists()) {
            test02_GetInfoBeforeUpdate();
        }
        TUpdate_Return[] results = service.update(new TUpdate_Input[] { updateItem });
        assertEquals(1, results.length);

        TUpdate_Return result0 = results[0];
        assertNoError(result0.getError());
        assertTrue(result0.getUpdated());
    }

    @Test
    public void test04_GetInfoAfterUpdate() {
        if(!itemExists()) {
            test03_Update();
        }
        TGetInfo_Return[] results = service.getInfo(new String[] { updateItem.getPath() }, new String[0], new String[] { "en" });
        assertEquals(1, results.length);

        TGetInfo_Return result0 = results[0];
        assertNoError(result0.getError());
        assertEquals(updateItem.getName()[0].getValue(), result0.getName()[0].getValue());
        assertEquals(updateItem.getDescription()[0].getValue(), result0.getDescription()[0].getValue());
        assertEquals(updateItem.getIsActive(), result0.getIsActive());
    }

    @Test
    public void test99_Delete() {
        if(!itemExists()) {
            test04_GetInfoAfterUpdate();
        }
        TDelete_Return[] results = service.delete(new String[] { FOLDER + newItem.getAlias() });
        TDelete_Return result0 = results[0];
        assertNoError(result0.getError());
        assertTrue(result0.getDeleted());
        assertFalse(itemExists());
    }

}
