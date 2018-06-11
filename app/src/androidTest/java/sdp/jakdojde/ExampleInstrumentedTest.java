package sdp.jakdojde;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * You can execute this Instrumented Test on your Android device.
 * To gain more information about testing from cmd visit <a href="https://developer.android.com/studio/test/command-line"> Command Line  </a>
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("sdp.jakdojde", appContext.getPackageName());
    }
}
