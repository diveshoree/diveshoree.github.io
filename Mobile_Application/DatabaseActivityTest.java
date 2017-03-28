package humberparts.walkingprogrammers;

import android.content.Context;
import android.test.InstrumentationTestCase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by RAF on 2016-12-12.
 */
public class DatabaseActivityTest extends InstrumentationTestCase {

    private DatabaseActivity testDB= new DatabaseActivity(getInstrumentation().getTargetContext());

    @Test
    public void insertData() throws Exception {

        assertTrue(testDB.insertData("n123","kk", "p123"));
    }

    @Test
    public void search() throws Exception {

        Assert.assertNotNull(testDB.search("n123"));
    }

    @Test
    public void databaseViewer() throws Exception {
        assertNotNull(testDB.databaseViewer());
    }

    @Test
    public void deleteData() throws Exception {
        assertNotNull(testDB.deleteData("n123"));

    }

}