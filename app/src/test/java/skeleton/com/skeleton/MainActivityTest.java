package skeleton.com.skeleton;

import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class MainActivityTest {

    @Test
    public void shouldTestRobolectricWorks() {
        MainActivity mainActivity = Robolectric.buildActivity(MainActivity.class).create().get();

        TextView testText = (TextView) mainActivity.findViewById(R.id.test_text);

        assertThat(testText.getText().toString()).isEqualTo("Hello world!");
    }

}