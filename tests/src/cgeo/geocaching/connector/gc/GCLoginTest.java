package cgeo.geocaching.connector.gc;

import static org.assertj.core.api.Assertions.assertThat;

import cgeo.geocaching.enumerations.StatusCode;

import org.apache.commons.lang3.StringUtils;

import junit.framework.TestCase;

public class GCLoginTest extends TestCase {

    final GCLogin instance = GCLogin.getInstance();

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        assertThat(instance.login()).isEqualTo(StatusCode.NO_ERROR);
    }

    public void testHomeLocation() {
        assertThat(StringUtils.isNotBlank(GCLogin.retrieveHomeLocation())).isTrue();
    }

    public void testAvatar() {
        assertThat(instance.downloadAvatarAndGetMemberStatus()).isNotNull();
    }

}
